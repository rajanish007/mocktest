create database mockup;
use mockup;

create table m_student(
s_id varchar(32) NOT NULL,
s_name varchar(15) NOT NULL,
s_passwd varchar(20) NOT NULL,
s_uname varchar(20) NOT NULL,
s_email varchar(32) NOT NULL,
PRIMARY KEY(s_id)
);

create table m_faculty(
f_id varchar(32) NOT NULL,
f_name varchar(15) NOT NULL,
f_passwd varchar(20) NOT NULL,
f_uname varchar(20) NOT NULL,
f_email varchar(32) NOT NULL,
PRIMARY KEY(f_id)
);

create table m_querie(
q_id varchar(32) NOT NULL,
f_id varchar(32) NOT NULL,
q_time_allocated int NOT NULL,
q_correct_ans varchar(1) NOT NULL,
q_desc text NOT NULL,
q_first_ans text NOT NULL,
q_second_ans text NOT NULL,
q_third_ans text NOT NULL,
q_fourth_ans text NOT NULL,
PRIMARY KEY(q_id),
FOREIGN KEY(f_id) REFERENCES m_faculty(f_id)
);

create table m_test(
t_id varchar(32) NOT NULL,
t_date DATETIME NOT NULL,
t_q_list text NOT NULL,
t_duration int NOT NULL,
t_feedback text DEFAULT NULL,
PRIMARY KEY(t_id)
);

create table m_result(
r_id varchar(32) NOT NULL,
t_id varchar(32) NOT NULL REFERENCES m_test(t_id),
s_id varchar(32) NOT NULL REFERENCES m_student(s_id),
r_query_count int NOT NULL,
r_correct_ans_count int NOT NULL,
status varchar(4) NOT NULL,
PRIMARY KEY(r_id)
);

create table m_test_result_desc(
t_id varchar(32) NOT NULL REFERENCES m_test(t_id),
r_id varchar(32) NOT NULL REFERENCES m_result(r_id),
q_id varchar(32) NOT NULL REFERENCES m_student(s_id),
ans_recieved varchar(1) NOT NULL,
PRIMARY KEY(t_id,r_id,q_id)
);
