
SELECT * FROM track 
WHERE albumid IN (SELECT albumid FROM album 
	WHERE artistid IN (SELECT artistid FROM artist WHERE name = 'Metallica'))
ORDER BY name;

