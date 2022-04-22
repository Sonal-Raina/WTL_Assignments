#Create a database table ebookshop (book_id, book_title, book_author, book_price, quantity

create database wtl5;
use wtl5;
 
create table ebookshop (book_id int, book_title varchar(30), book_author varchar(30), book_price int, quantity int, primary key(book_id));

insert into ebookshop values('8', 'dbms', 'amit', '566', '99'),('6', 'wtl', 'rahul', '56', '2');

select * from ebookshop ;
