CREATE TABLE app_user (
	user_id SERIAL PRIMARY KEY,
	username TEXT UNIQUE NOT NULL,
	pass TEXT NOT NULL,
	first_name TEXT NOT NULL,
	last_name TEXT NOT NULL,
	phone TEXT,
	email TEXT UNIQUE NOT NULL,
	role TEXT NOT NULL
);

CREATE TABLE game (
	game_id SERIAL PRIMARY KEY,
	game_name TEXT NOT NULL,
	producer TEXT NOT NULL
);

CREATE TABLE quality (
	quality_id SERIAL PRIMARY KEY,
	quality_label TEXT UNIQUE NOT NULL
);

CREATE TABLE card (
	card_id SERIAL PRIMARY KEY,
	card_name TEXT NOT NULL,
	card_value NUMERIC(8,2) NOT NULL,
	game_id INTEGER REFERENCES game(game_id), -- foreign key
	user_id INTEGER REFERENCES app_user(user_id),
	quality_id INTEGER REFERENCES quality(quality_id)
);