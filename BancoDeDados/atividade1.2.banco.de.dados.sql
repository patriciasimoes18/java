CREATE TABLE cargos(
    codigo int AUTO_INCREMENT PRIMARY KEY,
    cargo VARCHAR(40) NOT NULL,
    salario DOUBLE
);
CREATE Table filiais(
    codigo INTEGER AUTO_INCREMENT PRIMARY KEY,
    estado VARCHAR(2),
    cidade VARCHAR (30)
);
CREATE Table colaboradores (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (70),
    nascimento DATE,
    cargo INTEGER,
    filial INT,
    FOREIGN KEY (cargo) REFERENCES cargos (codigo),
    FOREIGN KEY (filial) REFERENCES filiais (codigo)
);
INSERT INTO cargos VALUES (null,"estagiario", 980);
INSERT INTO cargos VALUES
(null,"Desenvolvedor I", 1350),
(null,"Desenvolvedor II", 1800),
(null,"Desenvolvedor III", 2400),
(null,"Analista I", 2680),
(null,"Analista II", 3140),
(null,"Analista III", 3900),
(null,"Gerente de Projetos", 4700),
(null,"Administrador de Banco de Dados I", 2500),
(null,"Administrador de banco de Dados II", 3270),
(null,"Administrador de banco de Dados III", 4100);

SELECT*from cargos;
INSERT INTO filiais VALUES
(null,"SC", "Blumenau"),
(null,"SC", "Joinville"),
(null,"SC", "Criciúma"),
(null,"SC", "Florianópolis"),
(null,"PR", "Curitiba"),
(null,"PR", "Maringá"),
(null,"SP", "São Paulo"),
(null,"SP", "Campinas"),
(null,"SP", "Franca"),
(null,"MG", "Belo Horizonte"),
(null,"GO", "Anápolis"),
(null,"RJ", "Niterói");

SELECT * FROM colaboradores;

INSERT into colaboradores VALUES
(null, "Henrique Conceição", "2000/08/07", 1, 7),
(null,"Jéssica Corrêa", "1991/07/25",  5, 1);

INSERT into colaboradores VALUES
(null,"Luana Muniz", "1990/06/19", 9, 6),
(null,"Ricardo Alves", "1995/12/05", 11, 1),
(null,"Mayara Sanchez", "1987/01/22", 8, 2),
(null,"Daniel Starke", "1979/03/14", 6, 9),
(null,"Eduardo Ruediger", "1981/04/27", 11, 4),
(null,"Elizandra Ambrosi", "1994/02/06", 3, 1),
(null,"Camila Fortal", "1992/11/07", 8, 7),
(null,"Juliana Gonçalves", "1997/05/14", 1, 10),
(null,"Caio Orbus", "1986/06/06", 4, 3),
(null,"Cristiane Alcantra", "1981/10/07", 6, 4),
(null,"Bianca da Cruz", "1990/12/08", 2, 1),
(null,"Arnaldo Souza", "1984/01/08", 9, 5),
(null,"Josué Azess", "1977/05/30", 8, 7),
(null,"Renata de Paula", "1998/03/04", 1, 4);

--9) Exibir a quantidade de colaboradores por cada cargo.
SELECT
cargos.cargo,
COUNT(colaboradores.nome)
from colaboradores
inner JOIN cargos
on colaboradores.cargo = cargos.codigo
GROUP BY colaboradores.cargo;

--10) Exibir a quantidade de colaboradores por filial e a cidade.
SELECT
filiais.estado,
(SELECT filiais.cidade),
COUNT(colaboradores.nome)
from colaboradores
INNER JOIN filiais
on colaboradores.filial =  filiais.codigo 
GROUP BY filiais.estado;

--11) Nome do(s) colaborador(es) mais velho(s) e sua idade. *********
SELECT nome, DATE_FORMAT(nascimento, "%Y") from colaboradores, ;
SELECT nome, (2019-DATE_FORMAT(nascimento,"%Y")) 
AS idade FROM colaboradores WHERE nascimento = (SELECT MIN(nascimento) FROM colaboradores);

--12) Exiba todos os cargos e a quantidade de colaboradores por cargos,
-- mesmo que não haja nenhum colaborador cadastrado naquele cargo
SELECT 
cargos.cargo,
count (colaboradores.cargo)
from colaboradores
INNER JOIN cargos
on colaboradores.cargo = cargos.codigo
GROUP BY colaboradores.cargo;

--13) Exibir a quantidade de colaboradores que trabalham na filial do estado de SC,
-- independente a cidade de atuação.
SELECT
filiais.estado,
COUNT(colaboradores.nome)
from colaboradores 
inner JOIN filiais
on colaboradores.filial = filiais.codigo
--GROUP BY colaboradores.codigo;
and filiais.estado = "sc";









