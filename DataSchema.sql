create table genres (genre_id  bigserial not null, name varchar(255), primary key (genre_id));
create table literature_genres (literature_id int8 not null, genre_id int8 not null, primary key (literature_id, genre_id));
create table literature_types (literature_type_id  bigserial not null, name varchar(255), primary key (literature_type_id));
create table literature_users (literature_id int8 not null, user_id int8 not null, primary key (literature_id, user_id));
create table literatures (literature_id  bigserial not null, cost float8, description varchar(255), name varchar(255), author_id int8, primary key (literature_id));
create table users (user_id  bigserial not null, balance float8, email varchar(255), mobile varchar(255), name varchar(255), patronymic varchar(255), role varchar(255), surname varchar(255), primary key (user_id));
alter table if exists literature_types add constraint UK_era58hn1umha9yy2n3q2m5yof unique (name);
alter table if exists users add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);
alter table if exists users add constraint UK_63cf888pmqtt5tipcne79xsbm unique (mobile);
alter table if exists literature_genres add constraint FKa0xd5nt21odu9qy8m043pqo35 foreign key (genre_id) references genres;
alter table if exists literature_genres add constraint FKqoqllnpuduixk72r1jvb0rohh foreign key (literature_id) references literatures;
alter table if exists literature_users add constraint FK1k004y6eaxneik7ud27o1putu foreign key (user_id) references users;
alter table if exists literature_users add constraint FKgiok71bn9m53grux3a73xhl15 foreign key (literature_id) references literatures;
alter table if exists literatures add constraint FKt5dggsvun571mwll3fgv2ci3q foreign key (author_id) references users;