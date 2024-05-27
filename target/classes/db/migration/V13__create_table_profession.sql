create table profession (id int8 generated by default as identity, company_name varchar(255), end_month int4 not null, end_year int4 not null, is_working_now boolean not null, skills varchar(255), started_month int4 not null, started_year int4 not null, job_seeker_id int8, position_id int8, primary key (id))
;