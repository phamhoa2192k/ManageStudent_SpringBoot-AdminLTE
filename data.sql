#######################
create database quanly;
#drop database quanly;
use quanly;
create table user(
id varchar(10) primary key,
email varchar(255) not null,
password varchar(255) not null);

create table student(
id varchar(10) not null primary key,
firstname nvarchar(255) not null,
lastname nvarchar(255) not null,
birthday date,
address nvarchar(255),
email varchar(255) not null, 
phonenumber varchar(20) not null);

create table classroom(
id varchar(10) primary key not null,
name nvarchar(255) not null,
time nvarchar(255) not null,
maxstudent int not null,
address nvarchar(255) not null,
tuition int not null);

create table teacher(
id varchar(10) primary key not null,
firstname nvarchar(255) not null,
lastname nvarchar(255) not null,
birthday date,
address nvarchar(255) ,
email varchar(255) not null,
phonenumber varchar(20) not null);

create table classroom_teacher(
id varchar(10) not null primary key,
id_classroom varchar(10) not null,
id_teacher varchar(10) not null,
foreign key (id_classroom) references classroom(id),
foreign key (id_teacher) references teacher(id));

create table classroom_student(
id varchar(10) primary key not null,
id_student varchar(10) not null,
id_classroom varchar(10) not null,
foreign key (id_student) references student(id),
foreign key (id_classroom) references classroom(id));
###########################

INSERT INTO `quanly`.`user` (`id`, `email`, `password`) VALUES ('1', 'admin1@gmail.com', '1');
INSERT INTO `quanly`.`user` (`id`, `email`, `password`) VALUES ('2', 'admin2@gmail.com', '2');
INSERT INTO `quanly`.`user` (`id`, `email`, `password`) VALUES ('3', 'admin3@gmail.com', '3');

INSERT INTO `quanly`.`student` (`id`, `firstname`, `lastname`, `birthday`, `address`, `email`, `phonenumber`) VALUES ('1', 'Phạm', 'Hòa', '2000-09-21', 'a', 'hoa@gmail.com', '01');
INSERT INTO `quanly`.`student` (`id`, `firstname`, `lastname`, `birthday`, `address`, `email`, `phonenumber`) VALUES ('2', 'Phạm', 'Hòa 1', '2000-09-22', 'b', 'hoa1@gmail.com', '02');
INSERT INTO `quanly`.`student` (`id`, `firstname`, `lastname`, `birthday`, `address`, `email`, `phonenumber`) VALUES ('3', 'Nguyễn', 'Hòa 2', '2000-09-23', 'c', 'hoa2@gmail.com', '03');
INSERT INTO `quanly`.`student` (`id`, `firstname`, `lastname`, `birthday`, `address`, `email`, `phonenumber`) VALUES ('4', 'Phạm', 'Hòa 3', '2000-09-24', 'd', 'hoa3@gmai.com', '04');
INSERT INTO `quanly`.`student` (`id`, `firstname`, `lastname`, `birthday`, `address`, `email`, `phonenumber`) VALUES ('5', 'Bùi', 'Hòa 4 ', '2000-09-25', 'e', 'hoa4@gmail.com', '05');

INSERT INTO `quanly`.`classroom` (`id`, `name`, `time`, `maxstudent`, `address`,`tuition`) VALUES ('1', 'Mất gốc', '19h-21h T2-T3 05/2020-06-2020', '50', 'P101',2000000);
INSERT INTO `quanly`.`classroom` (`id`, `name`, `time`, `maxstudent`, `address`,`tuition`) VALUES ('2', 'Mất gốc', '16h-18h T2-T3 05/2020-06-2020', '50', 'P102',2000000);
INSERT INTO `quanly`.`classroom` (`id`, `name`, `time`, `maxstudent`, `address`,`tuition`) VALUES ('3', 'TOEIC', '19h-21h T4-T6 05/2020-06/2020', '50', 'P201',3000000);
INSERT INTO `quanly`.`classroom` (`id`, `name`, `time`, `maxstudent`, `address`,`tuition`) VALUES ('4', 'TOEIC', '7h-9h T7-CN 05/2020-06/2020', '100', 'H2',3000000);
INSERT INTO `quanly`.`classroom` (`id`, `name`, `time`, `maxstudent`, `address`,`tuition`) VALUES ('5', 'Luyện thi', '15h-19h T5 05/2020-06/2020', '10', 'P305',4000000);

INSERT INTO `quanly`.`teacher` (`id`, `firstname`, `lastname`, `birthday`, `address`, `email`, `phonenumber`) VALUES ('1', 'David', 'E', '1990-01-01', 'a', 'a', '01');
INSERT INTO `quanly`.`teacher` (`id`, `firstname`, `lastname`, `birthday`, `address`, `email`, `phonenumber`) VALUES ('2', 'Nguyễn', 'A', '1990-01-02', 'b', 'b', '02');
INSERT INTO `quanly`.`teacher` (`id`, `firstname`, `lastname`, `birthday`, `address`, `email`, `phonenumber`) VALUES ('3', 'Phạm', 'B', '1980-02-03', 'c', 'c', '03');
INSERT INTO `quanly`.`teacher` (`id`, `firstname`, `lastname`, `birthday`, `address`, `email`, `phonenumber`) VALUES ('4', 'Robert', 'C', '1995-09-01', 'd', 'd', '04');
INSERT INTO `quanly`.`teacher` (`id`, `firstname`, `lastname`, `birthday`, `address`, `email`, `phonenumber`) VALUES ('5', 'Taylor', 'D', '1986-04-30', 'e', 'e', '05');

INSERT INTO `quanly`.`classroom_teacher` (`id`,`id_classroom`, `id_teacher`) VALUES ('1','1', '1');
INSERT INTO `quanly`.`classroom_teacher` (`id`,`id_classroom`, `id_teacher`) VALUES ('2','2', '2');
INSERT INTO `quanly`.`classroom_teacher` (`id`,`id_classroom`, `id_teacher`) VALUES ('3','3', '3');
INSERT INTO `quanly`.`classroom_teacher` (`id`,`id_classroom`, `id_teacher`) VALUES ('4','4', '4');
INSERT INTO `quanly`.`classroom_teacher` (`id`,`id_classroom`, `id_teacher`) VALUES ('5','5', '5');

INSERT INTO `quanly`.`classroom_student` (`id`,`id_classroom`, `id_student`) VALUES ('1','1', '1');
INSERT INTO `quanly`.`classroom_student` (`id`,`id_classroom`, `id_student`) VALUES ('2','1', '2');
INSERT INTO `quanly`.`classroom_student` (`id`,`id_classroom`, `id_student`) VALUES ('3','1', '3');
INSERT INTO `quanly`.`classroom_student` (`id`,`id_classroom`, `id_student`) VALUES ('4','2', '4');
INSERT INTO `quanly`.`classroom_student` (`id`,`id_classroom`, `id_student`) VALUES ('5','3', '1');
INSERT INTO `quanly`.`classroom_student` (`id`,`id_classroom`, `id_student`) VALUES ('6','3', '2');
INSERT INTO `quanly`.`classroom_student` (`id`,`id_classroom`, `id_student`) VALUES ('7','3', '3');
INSERT INTO `quanly`.`classroom_student` (`id`,`id_classroom`, `id_student`) VALUES ('8','4', '4');
INSERT INTO `quanly`.`classroom_student` (`id`,`id_classroom`, `id_student`) VALUES ('9','5', '5');

