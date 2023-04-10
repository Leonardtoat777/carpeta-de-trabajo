create database login;

use login; 

create table usuarios(
	id int primary key auto_increment,
    user_name varchar(50),
    apellido varchar(50),
    password varchar(50),
    email varchar(50),
    numero char(9)
);

insert into usuarios values(01,"leonardo","salazar",123456,"leonardtoat@gmail.com",987654321);

select * from usuarios where email="" and password=""

update usuarios set password ="" where email="";




