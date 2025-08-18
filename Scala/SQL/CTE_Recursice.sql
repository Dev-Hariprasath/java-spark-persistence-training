CREATE SCHEMA cte;
use cte;

CREATE TABLE categories (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    parent_id INT,
    FOREIGN KEY (parent_id) REFERENCES categories(id)
);
 
 
INSERT INTO categories (name, parent_id) VALUES
('Electronics', NULL),
('Computers', 1),
('Laptops', 2),
('Desktops', 2),
('Smartphones', 1),
('Accessories', 1),
('Chargers', 6),
('Cables', 6);
 
 INSERT INTO categories (name, parent_id) VALUES ('Smartwatch', 3), ('Headphones', 3);
 
 with recursive category_hierarchy AS ( 
	select id, name, parent_id, 1 AS level
    from categories
    where parent_id is Null
    
    union all
    
    select c.id, c.name, c.parent_id, ch.level + 1
    from categories as c
    join category_hierarchy as ch
    on c.parent_id = ch.id
 )
 
 select id, name, parent_id, level
 from category_hierarchy;