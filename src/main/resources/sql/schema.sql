CREATE TABLE hotels (
    hotel_id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    phone_number VARCHAR(255) NOT NULL,
    photo_url VARCHAR(255) NOT NULL
);

CREATE TABLE rooms (
    room_id SERIAL PRIMARY KEY,
    hotel_id INTEGER REFERENCES hotels (hotel_id),
    room_number VARCHAR(10) NOT NULL,
    room_type VARCHAR(50) NOT NULL,
    description TEXT,
    price_per_night DECIMAL(10, 2) NOT NULL,
    number_of_beds INTEGER NOT NULL
);

CREATE TABLE bookings (
    booking_id SERIAL PRIMARY KEY,
    room_id INTEGER REFERENCES rooms (room_id),
    guest_name VARCHAR(255) NOT NULL,
    guest_email VARCHAR(255) NOT NULL,
    guest_phone_number VARCHAR(15) NOT NULL,
    check_in_date DATE NOT NULL,
    check_out_date DATE NOT NULL,
    number_of_guests INTEGER NOT NULL,
    total_price DECIMAL(10, 2) NOT NULL
);

CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);
