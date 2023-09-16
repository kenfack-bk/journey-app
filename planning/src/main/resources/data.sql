INSERT INTO schedules(day_of_week, hours, minutes)
values('MONDAY', 5, 30), ('MONDAY', 16, 30), ('TUESDAY', 8, 0), ('MONDAY', 9, 0);

INSERT INTO journey_paths(departure, arrival, distance, duration, cost)
values('DOUALA', 'YAOUNDE', 250, 4, 7000), ('YAOUNDE', 'BAFOUSSAM', 400, 6, 8000);

INSERT INTO journey_path_schedule(journey_path_id, schedule_id)
values(1, 1), (1, 2), (1, 3), (1, 4);


