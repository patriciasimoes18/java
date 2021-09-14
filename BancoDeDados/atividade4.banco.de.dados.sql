CREATE TABLE produto(
    codigo INTEGER,
	produto VARCHAR(40),
	categoria VARCHAR(20),
	valor DOUBLE,
	cadastro DATE
);
INSERT INTO produto VALUES
(1, "Smartphone Samsung A8", "telefonia", 1400.00 , "2019-07-22"),
(2, "Notebook Acer A650", "informática", 3800.00 ,  "2019-03-19"),
(3, "Telefone sem fio Intelbras", "telefonia",129.90, "2018-12-20"),
(4, "iPhone XR","telefonia", 5499.00, "2019-07-08"),
(5, "Notebook Dell Espiron 500","informática",3975.80, "2019-01-29"),
(6, "All in one LG A8574","informática",2547.12, "2019-02-13"),
(7, "Smartphone Motorola G7","telefonia",799.00, "2019-04-03"),
(8, "Smartphone Galaxy S10","telefonia",4600.00, "2019-05-03"),
(9, "Notebook Acer Axpros 47","informática",2857.00, "2019-08-16"),
(10, "Smartphone Asus Zenfone 6","telefonia",2356.00, "2018-07-29"),
(11, "Telefone empresarial Intelbras", "telefonia",129.90, "2018-12-20"),
(13, "iPhone 8","telefonia",6000.00, "2019-07-29");

select COUNT(produto) from produto;
select produto, valor from produto where cadastro BETWEEN "2019/04/01" and "2019/07/31";
select categoria, COUNT(*) from produto GROUP BY categoria;
select categoria, avg (valor) from produto GROUP BY categoria;
select produto, categoria from produto WHERE valor >=4000; 
-- SELECT produto, DATE_FORMAT(cadastro, "%d - %m - %Y") from produto where DATE_FORMAT(cadastro, "%Y") = 2018;
SELECT * from produto where DATE_FORMAT(cadastro, "%Y") = 2018;
DELETE from produto where produto LIKE "%samsung%" or produto like "%lg%";
select*from produto where produto LIKE "%intelbras%";
drop Table produtos;