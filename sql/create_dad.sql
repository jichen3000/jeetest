create table dad(
	id number,
	name varchar2(60)
);
create table son(
	id number,
	name varchar2(60),
	dad_id number
);
alter table dad add (age number);
