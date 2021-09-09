
-- Comandos DDL
-- Criar tabela
CREATE TABLE  clientes(
    nome VARCHAR(30),
    idade INTEGER,
    email VARCHAR(50)

); 
-- Listar todas as bases de dados
show databases;

--  Exibir estruturas da tabela

describe clientes;

-- Renomear tabela

alter table clientes rename to usuarios;

-- Adicionar nova coluna

alter table usuarios add column cidade varchar (30);

-- Remover colula

alter table usuarios drop column cidade;

-- _________________________________
-- Inserir dados

insert into usuarios values ("Jena", 22, "jean@gmail.com");

insert into usuarios (nome, email) values ("Rebeca", "rebeca@gmail.com");

-- Iserir varias informaçoes de uma vez

insert into usuarios values
-- Se algum usiario nao tem informação pode colocar null para preencher o campo
("Ana", 16, "ana@gmail.com"),
("Rubens", 24, "rubens@gmail.com"),
("Francielle", 34, "francielle@gmail.com"),
("Bianca", 43, "bianca@gmail.com"),
("Paulo", 21, "paulo@gmail.com");

--  Selecionar dados

select * from usuarios;  -- exibir todos os registros

select nome, idade from usuarios; --  exibir determinada colula

select count (*) from usuarios; --  exibir quantos registros tem na tabela

select max(idade) from usuarios; -- obter o maior valor

select min(idade) from usuarios; -- obter o menor valor

select avg (idade) from usuarios; -- obter a média de uma determinada coluna

select 
idade, 
if (idade>=18, "Maior de idade", "Menor de idade")
from usuarios; -- exibir a idade e retornar uma mensagem

select * from usuarios where idade>=18; -- filtrar dados

select * from usuarios where idade is null; -- para exibir um campo vazio

select * from usuarios where idade is NOT null; -- exibir usiaris que tem a informaçaõ da idade

select * from usuarios order by nome; --Ordenar em ordem alfabetica (a-z) ou crescente

select * from usuarios order by nome desc; -- ordenar em ordem alfabetica (z-z) ou decrescente

select nome from usuarios where nome like "f%"; -- inicia em F
select nome from usuarios where nome like "%a"; -- termina com A
select nome from usuarios where nome like "%e%"; -- contem o termo E

select * from usuarios where email like "%gmail.com" and idade >=18; -- exibir registro que terminam com o termo gmail.com e com idade maior ou igual a 18

-- Alterar dados

update usuarios set idade = 27 where idade is null;
update usuarios set nome = "Jean" where nome = "Jena";

-- Remover dados

delete from usuarios where idade < 18;

--Remover tabela

drop table usuarios;

-- remover base de dados

drop database bd1;





