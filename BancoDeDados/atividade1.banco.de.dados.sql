CREATE TABLE Alunos(
    nome VARCHAR(30),
    idade INTEGER,
    nota1 DOUBLE,
    nota2 DOUBLE
);

insert into Alunos values ("Ana", 15, 7.5, 8.2);
insert into Alunos values ("Lucas", 9, null, 8.6);
insert into Alunos values ("Vanessa", 16, 6.6, 7.1);
insert into Alunos values ("Leonardo", 15, 5, 4.5);
insert into Alunos values ("Dênis", 17, 10, 10);

select * from Alunos;

select nome, nota1, nota2,  (nota1+nota2)/2 from Alunos;

select (nota1, nota2)2,
if ((nota1+nota2)/2 >=7,"Aprovado") from Alunos*******;

select * from Alunos where idade <16;

select * from Alunos where idade is null;

select * from Alunos order by nome desc;

select nome from Alunos where nome like "%l%";

select nome from Alunos where nome like "a%";

select nome from Alunos where nome like "%a";

select count (*) from Alunos;
 select count (idade) from Alunos*********;

 select max (idade) from Alunos;

 select min (idade)  from Alunos;

update Alunos set idade= 9 where idade = null;









