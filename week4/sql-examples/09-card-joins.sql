-- we can use ON and specify the columns we want to join on
-- or if the columns in both tables are the exact same name we can use using instead
SELECT * FROM app_user u 
	INNER JOIN card c USING (user_id)
	INNER JOIN game g USING (game_id)
	INNER JOIN quality q ON (c.quality_id = q.quality_id);