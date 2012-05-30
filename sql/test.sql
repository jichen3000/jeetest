SELECT * FROM book;
select book_seq.CURRVAL from dual;
select book_seq.nextval from dual;
create sequence book_seq;
drop sequence book_seq;
select * from dual;
truncate table book;

select * from type_code where code like '%t%';