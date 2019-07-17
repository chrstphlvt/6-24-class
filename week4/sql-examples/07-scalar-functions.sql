
-- scalar functions operate on individual values
SELECT * FROM card;
SELECT LENGTH(card_name), LOWER(card_name) FROM card;


SELECT pass, MD5(pass) FROM app_user;


-- aggregate functions operate on the entire set of values
SELECT MAX(card_value) FROM card;
SELECT MAX(LENGTH(card_name)) from card;

SELECT COUNT(card_id) FROM card;
	
-- where would filter records before the grouping is done				  
SELECT COUNT(card_id), game_id FROM card WHERE game_id != 2 GROUP BY game_id;			  
				  