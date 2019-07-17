INSERT INTO app_user (username, pass, first_name, last_name, phone, email)
	VALUES 	('btkruppa', 'pass', 'blake', 'kruppa', '09803924', 'blake.kruppa@revature.com'),
			('edward', 'pass', 'edward', 'mcintire', '09803924', 'edward.mcintire@revature.com'),
			('abdulla', 'pass', 'abdulla', 'aqrabawi', '09803924', 'abdula.aqrabawi@revature.com'),
			('shay', 'pass', 'shay', 'gilchrist', '09803924', 'shay.gilchrist@revature.com'),
			('stefan', 'pass', 'stefan', 'todorov', '09803924', 'stefan.todorov@revature.com'),
			('larry', 'pass', 'larry', 'the cable man', '09803924', 'larry.the cable man@revature.com');
			
INSERT INTO quality (quality_label) VALUES
	('NM'), ('M'), ('OK'), ('BAD');
	
INSERT INTO game (game_name, producer) VALUES
	('Magic The Gathering', 'Wizards of The Coast'),
	('Pokemon', 'Nintendo'),
	('Yugioh', 'Konami');
	
INSERT INTO card (card_name, card_value, game_id, user_id, quality_id) VALUES
	('Island', 0.15, (SELECT game_id FROM game WHERE game_name = 'Magic The Gathering'), null, 
	 	(SELECT quality_id FROM quality  WHERE quality_label = 'OK')),
 	('Pikachu', 3, (SELECT game_id FROM game WHERE game_name = 'Pokemon'), null, 
	 	(SELECT quality_id FROM quality  WHERE quality_label = 'NM')),
 	('Blue Eyes White Dragon', 5, (SELECT game_id FROM game WHERE game_name = 'Yugioh'), null, 
		(SELECT quality_id FROM quality  WHERE quality_label = 'M')),
  	('Kuriboh', 0.1, (SELECT game_id FROM game WHERE game_name = 'Yugioh'), null, 
		(SELECT quality_id FROM quality  WHERE quality_label = 'OK')),
   	('Ditto', 20, (SELECT game_id FROM game WHERE game_name = 'Pokemon'), 
	 	(SELECT user_id FROM app_user WHERE username = 'larry'), 
	 	(SELECT quality_id FROM quality  WHERE quality_label = 'BAD'));
	  