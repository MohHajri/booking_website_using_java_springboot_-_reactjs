-- CREATE TABLE hotels (
--     hotel_id SERIAL PRIMARY KEY,
--     name VARCHAR(255) NOT NULL,
--     description VARCHAR(255) NOT NULL,
--     address VARCHAR(255) NOT NULL,
--     phone_number VARCHAR(255) NOT NULL,
--     photo_url VARCHAR(255) NOT NULL
-- );

-- CREATE TABLE rooms (
--     room_id SERIAL PRIMARY KEY,
--     hotel_id INTEGER REFERENCES hotels (hotel_id),
--     room_number VARCHAR(10) NOT NULL,
--     room_type VARCHAR(50) NOT NULL,
--     description TEXT,
--     price_per_night DECIMAL(10, 2) NOT NULL,
--     number_of_beds INTEGER NOT NULL
-- );

-- CREATE TABLE bookings (
--     booking_id SERIAL PRIMARY KEY,
--     room_id INTEGER REFERENCES rooms (room_id),
--     guest_name VARCHAR(255) NOT NULL,
--     guest_email VARCHAR(255) NOT NULL,
--     guest_phone_number VARCHAR(15) NOT NULL,
--     check_in_date DATE NOT NULL,
--     check_out_date DATE NOT NULL,
--     number_of_guests INTEGER NOT NULL,
--     total_price DECIMAL(10, 2) NOT NULL
-- );

-- CREATE TABLE users (
--     user_id SERIAL PRIMARY KEY,
--     username VARCHAR(100) NOT NULL,
--     email VARCHAR(255) NOT NULL,
--     password VARCHAR(255) NOT NULL
-- );


/*
insert some data to all tables

*/

-- INSERT INTO hotels (name, description, address, phone_number, photo_url) VALUES ('Hotel 1', 'Hotel 1 description', 'Hotel 1 address', 'Hotel 1 phone number', 'Hotel 1 photo url');
-- INSERT INTO hotels (name, description, address, phone_number, photo_url) VALUES ('Hotel 2', 'Hotel 2 description', 'Hotel 2 address', 'Hotel 2 phone number', 'Hotel 2 photo url');
-- INSERT INTO hotels (name, description, address, phone_number, photo_url) VALUES ('Hotel 3', 'Hotel 3 description', 'Hotel 3 address', 'Hotel 3 phone number', 'Hotel 3 photo url');
-- INSERT INTO hotels (name, description, address, phone_number, photo_url) VALUES ('Hotel 4', 'Hotel 4 description', 'Hotel 4 address', 'Hotel 4 phone number', 'Hotel 4 photo url');

-- INSERT INTO rooms (hotel_id, room_number, room_type, description, price_per_night, number_of_beds) VALUES (1, '101', 'Single', 'Single room description', 100.00, 1);
-- INSERT INTO rooms (hotel_id, room_number, room_type, description, price_per_night, number_of_beds) VALUES (1, '102', 'Double', 'Double room description', 200.00, 2);
-- INSERT INTO rooms (hotel_id, room_number, room_type, description, price_per_night, number_of_beds) VALUES (1, '103', 'Triple', 'Triple room description', 300.00, 3);
-- INSERT INTO rooms (hotel_id, room_number, room_type, description, price_per_night, number_of_beds) VALUES (2, '201', 'Single', 'Single room description', 100.00, 1);

-- INSERT INTO bookings (room_id, guest_name, guest_email, guest_phone_number, check_in_date, check_out_date, number_of_guests, total_price) VALUES (1, 'John Doe', 'john@gmail.com', 0423332434, '2020-01-01', '2020-01-02', 1, 100.00);
-- INSERT INTO bookings (room_id, guest_name, guest_email, guest_phone_number, check_in_date, check_out_date, number_of_guests, total_price) VALUES (2, 'Justin Bieber', 'Justin@gmail.com', 2422323, '2020-01-01', '2020-01-02', 2, 200.00);
-- INSERT INTO bookings (room_id, guest_name, guest_email, guest_phone_number, check_in_date, check_out_date, number_of_guests, total_price) VALUES (3, 'Tom Cruise', 'Tom@gmail.com', 2422323, '2020-01-01', '2020-01-02', 3, 300.00);
-- INSERT INTO bookings (room_id, guest_name, guest_email, guest_phone_number, check_in_date, check_out_date, number_of_guests, total_price) VALUES (4, 'Tom Hardy', 'hardy@outlook.com', 2422323, '2020-01-01', '2020-01-02', 1, 100.00);

-- INSERT INTO users (username, email, password) VALUES ('hajri' ,'hajri@outlook.com')


INSERT INTO Hotel (name, description, address, phoneNumber, photoUrl)
VALUES
  ('Hilton', 'Luxury hotel in the heart of the city', '123 Main St', '555-1234', 'https://example.com/hilton.jpg'),
  ('Marriott', 'Upscale hotel with top-notch amenities', '456 Elm St', '555-5678', 'https://example.com/marriott.jpg'),
  ('Sheraton', 'Comfortable accommodations for business and leisure travelers', '789 Oak St', '555-9012', 'https://example.com/sheraton.jpg');
