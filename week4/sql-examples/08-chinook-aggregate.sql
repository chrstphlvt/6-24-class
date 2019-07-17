-- where would filter data before the grouping is done
-- having would filter after the grouping is done
SELECT albumid, COUNT(name) FROM track
	GROUP BY albumid 
	HAVING COUNT(name) > 25
	ORDER BY albumid; 
	
-- SELECT * FROM album WHERE albumid = 141;