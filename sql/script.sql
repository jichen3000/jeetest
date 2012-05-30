    create table book (
        id number(19,0) not null,
        publisher_code varchar2(255 char),
        title varchar2(255 char),
        type_code varchar2(255 char),
        primary key (id)
    );

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

    create table child_b (
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

    create table child_c (
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

    create table child_d (
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

    create table child_e (
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

    create table father_clob (
        id number(19,0) not null,
        content clob,
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
    create sequence father_clob_seq;

    create table grandson_a_a (
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
        childA_id number(19,0),
        primary key (id)
    );

    create table grandson_a_b (
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
        childA_id number(19,0),
        primary key (id)
    );

    create table grandson_a_c (
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
        childA_id number(19,0),
        primary key (id)
    );

    create table grandson_a_d (
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
        childA_id number(19,0),
        primary key (id)
    );

    create table grandson_a_e (
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
        childA_id number(19,0),
        primary key (id)
    );

    create table grandson_a_f (
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
        childA_id number(19,0),
        primary key (id)
    );

    create table grandson_b_a (
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
        childB_id number(19,0),
        primary key (id)
    );

    create table grandson_b_b (
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
        childB_id number(19,0),
        primary key (id)
    );

    create table grandson_b_c (
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
        childB_id number(19,0),
        primary key (id)
    );

    create table grandson_b_d (
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
        childB_id number(19,0),
        primary key (id)
    );

    create table grandson_b_e (
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
        childB_id number(19,0),
        primary key (id)
    );

    create table grandson_b_f (
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
        childB_id number(19,0),
        primary key (id)
    );

    create table grandson_c_a (
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
        childC_id number(19,0),
        primary key (id)
    );

    create table grandson_c_b (
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
        childC_id number(19,0),
        primary key (id)
    );

    create table grandson_c_c (
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
        childC_id number(19,0),
        primary key (id)
    );

    create table grandson_c_d (
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
        childC_id number(19,0),
        primary key (id)
    );

    create table grandson_c_e (
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
        childC_id number(19,0),
        primary key (id)
    );

    create table grandson_c_f (
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
        childC_id number(19,0),
        primary key (id)
    );

    create table grandson_d_a (
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
        childD_id number(19,0),
        primary key (id)
    );

    create table grandson_d_b (
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
        childD_id number(19,0),
        primary key (id)
    );

    create table grandson_d_c (
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
        childD_id number(19,0),
        primary key (id)
    );

    create table grandson_d_d (
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
        childD_id number(19,0),
        primary key (id)
    );

    create table grandson_d_e (
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
        childD_id number(19,0),
        primary key (id)
    );

    create table grandson_d_f (
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
        childD_id number(19,0),
        primary key (id)
    );

    create table grandson_e_a (
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
        childE_id number(19,0),
        primary key (id)
    );

    create table grandson_e_b (
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
        childE_id number(19,0),
        primary key (id)
    );

    create table grandson_e_c (
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
        childE_id number(19,0),
        primary key (id)
    );

    create table grandson_e_d (
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
        childE_id number(19,0),
        primary key (id)
    );

    create table grandson_e_e (
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
        childE_id number(19,0),
        primary key (id)
    );

    create table grandson_e_f (
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
        childE_id number(19,0),
        primary key (id)
    );

    create table grandson_f_a (
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
        childF_id number(19,0),
        primary key (id)
    );

    create table grandson_f_b (
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
        childF_id number(19,0),
        primary key (id)
    );

    create table grandson_f_c (
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
        childF_id number(19,0),
        primary key (id)
    );

    create table grandson_f_d (
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
        childF_id number(19,0),
        primary key (id)
    );

    create table grandson_f_e (
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
        childF_id number(19,0),
        primary key (id)
    );


truncate table father;
truncate table child_a;
truncate table grandson_a_a;
truncate table grandson_a_b;
truncate table grandson_a_c;
truncate table grandson_a_d;
truncate table grandson_a_e;

truncate table child_b;
truncate table grandson_b_a;
truncate table grandson_b_b;
truncate table grandson_b_c;
truncate table grandson_b_d;
truncate table grandson_b_e;

truncate table child_c;
truncate table grandson_c_a;
truncate table grandson_c_b;
truncate table grandson_c_c;
truncate table grandson_c_d;
truncate table grandson_c_e;

truncate table child_d;
truncate table grandson_d_a;
truncate table grandson_d_b;
truncate table grandson_d_c;
truncate table grandson_d_d;
truncate table grandson_d_e;

truncate table child_e;
truncate table grandson_e_a;
truncate table grandson_e_b;
truncate table grandson_e_c;
truncate table grandson_e_d;
truncate table grandson_e_e;

