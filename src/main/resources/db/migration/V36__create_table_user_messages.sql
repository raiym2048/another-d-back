create table user_messages (id int8 generated by default as identity, name varchar(255), sender_email varchar(255),email_of_recipient varchar(255),un_read_messages integer, file_id int8, last_action_date varchar(255), user_message_info_id int8, primary key (id))
;