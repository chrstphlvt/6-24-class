
SELECT name FROM artist WHERE LOWER(name) LIKE 'i%'
UNION
SELECT name FROM track WHERE LOWER(name) LIKE 'i%'
ORDER BY name;