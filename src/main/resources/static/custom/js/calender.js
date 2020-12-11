function ini_events(ele) {
    ele.each(function () {
        // create an Event Object (http://arshaw.com/fullcalendar/docs/event_data/Event_Object/)
        // it doesn't need to have a start or end
        let eventObject = {
            title: $.trim($(this).text()) // use the element's text as the event title
        }

        // store the Event Object in the DOM element so we can get to it later
        $(this).data('eventObject', eventObject)

        // make the event draggable using jQuery UI
        $(this).draggable({
            zIndex: 1070,
            revert: true, // will cause the event to go back to its
            revertDuration: 0 //  original position after the drag
        })

    })
}

ini_events($('#external-events div.external-event'))

/* initialize the calendar
 -----------------------------------------------------------------*/
//Date for the calendar events (dummy data)
let date = new Date()
let d = date.getDate(),
    m = date.getMonth(),
    y = date.getFullYear()

let Calendar = FullCalendar.Calendar;
let Draggable = FullCalendarInteraction.Draggable;

let containerEl = document.getElementById('external-events');
let checkbox = document.getElementById('drop-remove');
let calendarEl = document.getElementById('calendar');
let events = [{
    id: "1",
    title: 'Mất gốc 1',
    start: new Date(y, m, 1),
    backgroundColor: '#f56954', //red
    borderColor: '#f56954', //red
    allDay: true
},
{
    id: "2",
    title: 'Mất gốc 2',
    start: new Date(y, m, d - 5),
    end: new Date(y, m, d - 4),
    backgroundColor: '#f39c12', //yellow
    borderColor: '#f39c12' //yellow
},
{
    id: "3",
    title: 'TOEIC 1',
    start: new Date(y, m, d, 10, 30),
    allDay: false,
    backgroundColor: '#0073b7', //Blue
    borderColor: '#0073b7' //Blue
},
{
    id: "4",
    title: 'TOEIC 2',
    start: new Date(y, m, d, 12, 0),
    end: new Date(y, m, d, 14, 0),
    allDay: false,
    backgroundColor: '#00c0ef', //Info (aqua)
    borderColor: '#00c0ef' //Info (aqua)
},
{
    id: "5",
    title: 'Luyện thi 1',
    start: new Date(y, m, d + 1, 19, 0),
    end: new Date(y, m, d + 1, 22, 30),
    allDay: false,
    backgroundColor: '#00a65a', //Success (green)
    borderColor: '#00a65a' //Success (green)
},
{
    id: "6",
    title: 'Mất gốc 1',
    start: new Date(y, m, 28),
    end: new Date(y, m, 29),
    url: 'http://google.com/',
    backgroundColor: '#3c8dbc', //Primary (light-blue)
    borderColor: '#3c8dbc' //Primary (light-blue)
}];

let id = events.length;

// -ADD EXTERNAL EVENTS

new Draggable(containerEl, {
    itemSelector: '.external-event',
    eventData: function (eventEl) {
        console.log(eventEl);
        id++;
        return {
            id: id,
            title: eventEl.innerText,
            backgroundColor: window.getComputedStyle(eventEl, null).getPropertyValue('background-color'),
            borderColor: window.getComputedStyle(eventEl, null).getPropertyValue('background-color'),
            textColor: window.getComputedStyle(eventEl, null).getPropertyValue('color'),
        };
    }
});

let calendar = new Calendar(calendarEl, {
    plugins: ['bootstrap', 'interaction', 'dayGrid', 'timeGrid'],
    header: {
        left: 'prev,next today',
        center: 'title',
        right: 'dayGridMonth,timeGridWeek,timeGridDay'
    },
    'themeSystem': 'bootstrap',
    events,
    editable: true,
    droppable: true, // this allows things to be dropped onto the calendar !!!
    drop: function (info) {
        // is the "remove after drop" checkbox checked?
        if (checkbox.checked) {
            // if so, remove the element from the "Draggable Events" list
            info.draggedEl.parentNode.removeChild(info.draggedEl);
        }
    }
});

calendar.render();
//$('#calendar').fullCalendar()

/* ADDING EVENTS */
let currColor = '#3c8dbc' //Red by default
//Color chooser button
let colorChooser = $('#color-chooser-btn')
$('#color-chooser > li > a').click(function (e) {
    e.preventDefault()
    //Save color
    currColor = $(this).css('color')
    //Add color effect to button
    $('#add-new-event').css({
        'background-color': currColor,
        'border-color': currColor
    })
})

$('#add-new-event').click(function (e) {
    e.preventDefault()
    //Get value and make sure it is not null
    let val = $('#new-event').val()
    if (val.length == 0) {
        return
    }

    //Create events
    let event = $('<div />')
    event.css({
        'background-color': currColor,
        'border-color': currColor,
        'color': '#fff'
    }).addClass('external-event')
    event.html(val)
    $('#external-events').prepend(event)

    //Add draggable funtionality
    ini_events(event)

    //Remove event from text input
    $('#new-event').val('')
})

// -- DELETE LAST EVENT -- 
function deleteLastEvent(){
    calendar.getEventById(id).remove();
    id--;
}
