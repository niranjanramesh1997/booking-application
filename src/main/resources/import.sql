insert into movie ( movie_genre , movie_id , movie_name , rating , release_date , running_time ) values ('Horror', 1, 'Conjuring', 0, '2020-09-09T09:09:01Z', 600000) ;
insert into movie ( movie_genre , movie_id , movie_name , rating , release_date , running_time ) values ('Comedy', 2, 'Johny English', 1, '2021-09-09T09:09:01Z', 610420) ;

insert into location ( city_name , location_id , pin_code ) values ('Chennai', 1, '600053');
insert into location ( city_name , location_id , pin_code ) values ('Ernakulam', 2, '682011');

insert into theatre (theatre_id, theatre_name, total_screens, location_id) values ( 1, 'PVR Cinemas', 2, 1);
insert into theatre (theatre_id, theatre_name, total_screens, location_id) values ( 2, 'PVR Cinemas', 3, 2);
insert into theatre (theatre_id, theatre_name, total_screens, location_id) values ( 3, 'Satyam Cinemas', 2, 1);
insert into theatre (theatre_id, theatre_name, total_screens, location_id) values ( 4, 'EVM Cinemas', 1, 2);

insert into screen ( screen_id , seats , theatre_id ) values (1, 100, 1);
insert into screen ( screen_id , seats , theatre_id ) values (2, 150, 1);
insert into screen ( screen_id , seats , theatre_id ) values (3, 100, 2);
insert into screen ( screen_id , seats , theatre_id ) values (4, 120, 2);
insert into screen ( screen_id , seats , theatre_id ) values (5, 100, 2);
insert into screen ( screen_id , seats , theatre_id ) values (6, 50, 3);
insert into screen ( screen_id , seats , theatre_id ) values (7, 90, 3);
insert into screen ( screen_id , seats , theatre_id ) values (8, 200, 4);

insert into show ( show_id, movie_id , screen_id , start_time , end_time) values (1, 1, 1, '2021-08-05T09:00:00Z', '2021-09-05T10:00:00Z');
insert into show ( show_id, movie_id , screen_id , start_time , end_time) values (2, 2, 2, '2021-08-05T09:00:00Z', '2021-09-05T10:30:00Z');
insert into show ( show_id, movie_id , screen_id , start_time , end_time) values (3, 1, 5, '2021-08-05T11:00:00Z', '2021-09-05T12:30:00Z');

insert into seat (seat_id, seat_number, seat_type, screen_id) values (1, 1, 2, 1);
insert into seat (seat_id, seat_number, seat_type, screen_id) values (2, 2, 2, 1);
insert into seat (seat_id, seat_number, seat_type, screen_id) values (3, 3, 2, 1);
insert into seat (seat_id, seat_number, seat_type, screen_id) values (4, 4, 2, 1);
insert into seat (seat_id, seat_number, seat_type, screen_id) values (5, 5, 2, 1);
insert into seat (seat_id, seat_number, seat_type, screen_id) values (6, 6, 1, 1);
insert into seat (seat_id, seat_number, seat_type, screen_id) values (7, 7, 1, 1);
insert into seat (seat_id, seat_number, seat_type, screen_id) values (8, 8, 0, 1);

insert into show_seat ( blocked , booking_id , price , seat_id , show_id , show_seat_id ) values (false, null, 200, 1, 1, 1);
insert into show_seat ( blocked , booking_id , price , seat_id , show_id , show_seat_id ) values (false, null, 200, 2, 1, 2);
insert into show_seat ( blocked , booking_id , price , seat_id , show_id , show_seat_id ) values (false, null, 200, 3, 1, 3);
insert into show_seat ( blocked , booking_id , price , seat_id , show_id , show_seat_id ) values (false, null, 200, 4, 1, 4);
insert into show_seat ( blocked , booking_id , price , seat_id , show_id , show_seat_id ) values (false, null, 200, 5, 1, 5);
insert into show_seat ( blocked , booking_id , price , seat_id , show_id , show_seat_id ) values (false, null, 250, 6, 1, 6);
insert into show_seat ( blocked , booking_id , price , seat_id , show_id , show_seat_id ) values (false, null, 250, 7, 1, 7);
insert into show_seat ( blocked , booking_id , price , seat_id , show_id , show_seat_id ) values (false, null, 300, 8, 1, 8);
