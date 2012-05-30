


    drop table child_a cascade constraints;

    drop table father cascade constraints;



    drop sequence child_a_seq;

    drop sequence father_seq;



    create table child_a (
        id number(19,0) not null,
        f0 varchar2(255 char),
        f1 varchar2(255 char),
        f2 varchar2(255 char),
        f3 varchar2(255 char),
        f4 varchar2(255 char),
        f5 varchar2(255 char),
        f6 varchar2(255 char),
        f7 varchar2(255 char),
        f8 varchar2(255 char),
        f9 varchar2(255 char),
        father_id number(19,0),
        primary key (id)
    );

    create table father (
        id number(19,0) not null,
        f0 varchar2(255 char),
        f1 varchar2(255 char),
        f2 varchar2(255 char),
        f3 varchar2(255 char),
        f4 varchar2(255 char),
        f5 varchar2(255 char),
        f6 varchar2(255 char),
        f7 varchar2(255 char),
        f8 varchar2(255 char),
        f9 varchar2(255 char),
        primary key (id)
    );

 

    create sequence child_a_seq;

    create sequence father_seq;
