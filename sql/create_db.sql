create table book(
	id number,
	title varchar2(60),
	type_code varchar2(60),
	publisher_code varchar2(60)
);
create table type_code(
	id number,
	name varchar2(60),
	code varchar2(60)
);
create table publisher_code(
	id number,
	name varchar2(60),
	code varchar2(60)
);

create sequence book_seq;
