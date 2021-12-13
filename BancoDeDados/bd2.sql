CREATE Table marcas(
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30)
);
INSERT into marcas (nome) VALUES
("samsung"),
("apple"),
("motorola");

SELECT * FROM marcas;
CREATE Table produtos(

codigo INTEGER AUTO_INCREMENT PRIMARY KEY,
produto VARCHAR(50),
valor DOUBLE, -- double = numero que pode ter casas decimais
codigoMarca INT,
FOREIGN KEY(codigoMarca) REFERENCES marcas (codigo)  
);
insert into produtos VALUES
(null, "galaxy s21",8000, 1),
(null,"iphone 12", 7500, 2),
(null,"galaxy note", 4000, 1),
(null,"iphone 8",3500, 2);

SELECT*from produtos;
SELECT
 produtos.produto,
 produtos.valor,
 marcas.nome
FROM produtos
inner JOIN marcas
on produtos.codigoMarca= marcas.codigo;

TRUNCATE TABLE produtos; -- deleta a tabela e zera o auto incremento, começa a intar de 1 novamente.

SELECT*from produtos
where valor >= (SELECT avg(valor) from produtos);


-- Primary kry ou chave primaria: Garante que nao existira informaçoes repetidas.
-- FOREIGN key ou chave-estrangeira: Cria um vinculo com a outra tabela. É como se fosse uma coluna compartilhada.
