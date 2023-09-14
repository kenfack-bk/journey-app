DROP TABLE IF EXISTS journey_path_schedule;
DROP TABLE IF EXISTS schedules;
DROP TABLE IF EXISTS journey_paths;

create table schedules(
   id bigserial primary key,
   version int default 0 not null,
   day_of_week varchar(10) not null,
   hours int not null,
   minutes int not null
);

create table journey_paths (
   id  bigserial  primary key,
   version int default 0 not null,
   departure varchar(100) not null,
   arrival varchar(100) not null,
   distance int not null,
   duration int not null,
   cost int  default 0
);

create table journey_path_schedule(
    journey_path_id int not null,
    schedule_id int not null,
    primary key(journey_path_id, schedule_id),
    foreign key(journey_path_id) references journey_paths(id),
    foreign key(schedule_id) references schedules(id)
);