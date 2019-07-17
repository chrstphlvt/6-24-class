-- a sub query is a query within a query
SELECT * FROM card 
WHERE card.game_id IN 
	(SELECT game_id FROM game WHERE game_name = 'Yugioh' OR game_name = 'Pokemon');