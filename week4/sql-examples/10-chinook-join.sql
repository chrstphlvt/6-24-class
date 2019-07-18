SELECT * FROM artist a 
	LEFT JOIN track t ON (a.name = t.name);