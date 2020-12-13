create database quanly;
INSERT INTO `quanly`.`user` (`id`, `email`, `password`) VALUES ('1', 'admin1@gmail.com', '1');
INSERT INTO `quanly`.`user` (`id`, `email`, `password`) VALUES ('2', 'admin2@gmail.com', '2');
INSERT INTO `quanly`.`user` (`id`, `email`, `password`) VALUES ('3', 'admin3@gmail.com', '3');

INSERT INTO `quanly`.`teacher` (`id`, `address`, `birthday`, `email`, `firstname`, `lastname`, `phonenumber`) VALUES ('1', 'a', '1990-01-01', 'a', 'David', 'E', '01');
INSERT INTO `quanly`.`teacher` (`id`, `address`, `birthday`, `email`, `firstname`, `lastname`, `phonenumber`) VALUES ('2', 'b', '1990-01-02', 'b', 'Nguyễn', 'A', '02');
INSERT INTO `quanly`.`teacher` (`id`, `address`, `birthday`, `email`, `firstname`, `lastname`, `phonenumber`) VALUES ('3', 'c', '1980-02-03', 'c', 'Phạm', 'B', '03');
INSERT INTO `quanly`.`teacher` (`id`, `address`, `birthday`, `email`, `firstname`, `lastname`, `phonenumber`) VALUES ('4', 'd', '1995-09-01', 'd', 'Robert', 'C', '04');
INSERT INTO `quanly`.`teacher` (`id`, `address`, `birthday`, `email`, `firstname`, `lastname`, `phonenumber`) VALUES ('5', 'e', '1986-04-30', 'e', 'Taylor', 'D', '05');

INSERT INTO `quanly`.`student` (`id`, `address`, `birthday`, `email`, `firstname`, `lastname`, `phonenumber`) VALUES ('1', 'a', '2000-09-21', 'hoa@gmail.com', 'Phạm', 'Hòa', '01');
INSERT INTO `quanly`.`student` (`id`, `address`, `birthday`, `email`, `firstname`, `lastname`, `phonenumber`) VALUES ('2', 'b', '2000-09-22', 'hoa1@gmail.com', 'Phạm', 'Hòa 1', '02');
INSERT INTO `quanly`.`student` (`id`, `address`, `birthday`, `email`, `firstname`, `lastname`, `phonenumber`) VALUES ('3', 'c', '2000-09-23', 'hoa2@gmail.com', 'Nguyễn', 'Hòa 2', '03');
INSERT INTO `quanly`.`student` (`id`, `address`, `birthday`, `email`, `firstname`, `lastname`, `phonenumber`) VALUES ('4', 'd', '2000-09-24', 'hoa3@gmai.com', 'Phạm', 'Hòa 3', '04');
INSERT INTO `quanly`.`student` (`id`, `address`, `birthday`, `email`, `firstname`, `lastname`, `phonenumber`) VALUES ('5', 'e', '2000-09-25', 'hoa4@gmail.com', 'Bùi', 'Hòa 4 ', '05');

INSERT INTO `quanly`.`classroom_teacher` (`id`, `id_classroom`, `id_student`) VALUES ('1', '1', '1');
INSERT INTO `quanly`.`classroom_teacher` (`id`, `id_classroom`, `id_student`) VALUES ('2', '2', '2');
INSERT INTO `quanly`.`classroom_teacher` (`id`, `id_classroom`, `id_student`) VALUES ('3', '3', '3');
INSERT INTO `quanly`.`classroom_teacher` (`id`, `id_classroom`, `id_student`) VALUES ('4', '4', '4');
INSERT INTO `quanly`.`classroom_teacher` (`id`, `id_classroom`, `id_student`) VALUES ('5', '5', '5');

INSERT INTO `quanly`.`classroom` (`id`, `address`, `maxstudent`, `name`, `time`, `tuition`) VALUES ('1', 'P101', '50', 'Mất gốc 1', '19h-21h T2-T3 05/2020-06-2020', '2000000');
INSERT INTO `quanly`.`classroom` (`id`, `address`, `maxstudent`, `name`, `time`, `tuition`) VALUES ('2', 'P102', '50', 'Mất gốc 2', '16h-18h T2-T3 05/2020-06-2020', '2000000');
INSERT INTO `quanly`.`classroom` (`id`, `address`, `maxstudent`, `name`, `time`, `tuition`) VALUES ('3', 'P201', '50', 'TOEIC 1', '19h-21h T4-T6 05/2020-06/2020', '3000000');
INSERT INTO `quanly`.`classroom` (`id`, `address`, `maxstudent`, `name`, `time`, `tuition`) VALUES ('4', 'H2', '100', 'TOEIC 2', '7h-9h T7-CN 05/2020-06/2020', '3000000');
INSERT INTO `quanly`.`classroom` (`id`, `address`, `maxstudent`, `name`, `time`, `tuition`) VALUES ('5', 'P305', '10', 'Luyện thi 1', '15h-19h T5 05/2020-06/2020', '4000000');

INSERT INTO `quanly`.`classrom_student` (`id`, `id_classroom`, `id_student`) VALUES ('1\'', '1', '1');
INSERT INTO `quanly`.`classrom_student` (`id`, `id_classroom`, `id_student`) VALUES ('2', '1', '2');
INSERT INTO `quanly`.`classrom_student` (`id`, `id_classroom`, `id_student`) VALUES ('3', '1', '3');
INSERT INTO `quanly`.`classrom_student` (`id`, `id_classroom`, `id_student`) VALUES ('4', '2', '4');
INSERT INTO `quanly`.`classrom_student` (`id`, `id_classroom`, `id_student`) VALUES ('5', '3', '1');
INSERT INTO `quanly`.`classrom_student` (`id`, `id_classroom`, `id_student`) VALUES ('6', '3', '2');
INSERT INTO `quanly`.`classrom_student` (`id`, `id_classroom`, `id_student`) VALUES ('7', '3', '3');
INSERT INTO `quanly`.`classrom_student` (`id`, `id_classroom`, `id_student`) VALUES ('8', '4', '4');
INSERT INTO `quanly`.`classrom_student` (`id`, `id_classroom`, `id_student`) VALUES ('9', '5', '5');

