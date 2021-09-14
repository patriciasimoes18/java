
CREATE TABLE `usuario` (
  `codigo` int DEFAULT NULL,
  `nome` varchar(20) DEFAULT NULL,
  `idade` int DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL
);

INSERT INTO usuario(codigo,nome,idade,email) VALUES
(1,'Vanessa',16,'vanessa.rosa@gmail.com'),
(3,'Andressa',36,'dessa.simas@uol.com.br'),
(4,'Mayra',24,'mayra.antunes@gmail.com'),
(5,'Cristiane',14,'criss.maya@gmail.com'),
(6,'Leonardo',15,'leo.kopff@terra.com.br'),
(7,'Carina',27,'carina.almeida@gmail.com'),
(8,'Clóvis',29,'clovis.simao@hotmail.com'),
(9,'Gabriela',23,'gabriela.braga@live.com'),
(10,'Cibele',NULL,'cibele.lins@uol.com.br');

select count (nome)from usuario;
select *from usuario where idade <18;
select* from usuario where email like "%gmail%";

select nome from usuario WHERE idade is null;

delete from usuario where idade <18;
SELECT*from usuario;
drop Table usuario;

