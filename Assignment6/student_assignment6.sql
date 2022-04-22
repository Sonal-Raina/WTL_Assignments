#Create a database table students_info (stud_id, stud_name, class, division, city)  

create database wtl6;
use wtl6;
 
create table students_info (stud_id int, stud_name varchar(30), class int, division varchar(2), city varchar(20), primary key(stud_id));

insert into students_info values('1', 'amit', '14', 'A', 'pune'),('2', 'nikhil', '19', 'B', 'latur');

select * from students_info ;
