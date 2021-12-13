CREATE TABLE produtos(
    codigo integer,
    nome varchar(20),
    marca varchar(20),
    valor double
);
INSERT INTO produtos VALUES
(1, "Galaxy S10", "Samsung", 5000),
(2, "iPhone 11", "Apple", 6000),
(3, "Moto G7", "Motorola", 1500),
(4, "Galaxy Note 10", "Samsung", 6500),
(6, "iPhone 8", "Apple", 3000);

SELECT*from produtos;
select * from produtos GROUP BY marca;
select marca, COUNT(codigo) from produtos GROUP BY marca;
select * from produtos WHERE marca like "%apple%" or marca like ("%samsung%");
select * from produtos WHERE marca like "%apple%" or marca like ("%samsung%") and valor <6000;
INSERT into produtos VALUES
(null,"iPhone 11 Max","Apple", 6500);
DELETE from produtos where marca = "samsung";
drop Table produtos;


