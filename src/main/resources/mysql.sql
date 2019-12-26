create table  SignupLogin.login(
id int primary key AUTO_INCREMENT,
email varchar(50),
pass_word varchar(50),
session_id int);

insert into SignupLogin.login (email,pass_word,session_id) values('kaustav541@gmail.com','12345',1245879);


create table  SignupLogin.Register(
id int primary key AUTO_INCREMENT,
email varchar(50),
`name` varchar(50),
pass_word varchar(50),
phone varchar(10));

insert into SignupLogin.Register (email,`name`,pass_word,phone) values('kaustav541@gmail.com','Kaustav','1245879','9038856904');
