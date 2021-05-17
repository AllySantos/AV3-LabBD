CREATE DATABASE Escola
GO

USE Escola
GO

CREATE TABLE Aluno(
Ra INT                  NOT NULL,
Nome VARCHAR(100)		NOT NULL,
PRIMARY KEY (Ra),
)
GO

DROP TABLE Aluno

INSERT INTO Aluno(Ra, nome)
VALUES (1, 'Alicia Santos'),
	   (2, 'Karine Santos'),
	   (3, 'Leonardo Santos'),
	   (4, 'Adriano Silva'),
	   (5, 'Roberto Silva'),
	   (6, 'Gustavo Araujo'),
	   (7, 'Narciso')
GO



CREATE TABLE Faltas(
RaAluno INT				NOT NUll,
CodigoDisciplina CHAR(8)	NOT NULL,
Data Date				NOT NULL,
Presenca INT			NOT NULL,
PRIMARY KEY (RaAluno, CodigoDisciplina, Data),
FOREIGN KEY (RaAluno) REFERENCES Aluno (Ra),
FOREIGN KEY (CodigoDisciplina) REFERENCES Disciplina (Codigo),
)
GO



CREATE TABLE Curso(
NomeCurso	VARCHAR(100)         NOT NUll,
CodigoCurso INT	IDENTITY         NOT NULL,
PRIMARY KEY (CodigoCurso),
)
GO


INSERT INTO Curso(NomeCurso)
VALUES ('ADS'),
		('COMEX')
GO



CREATE TABLE Disciplina(
CodigoCurso INT			NOT NULL,
Codigo CHAR(8)			NOT NULL,
Nome VARCHAR(100)		NOT NULL,
Sigla VARCHAR(3)        NOT NULL,
Turno VARCHAR(1)		NOT NULL,
NumAulas INT			NOT NULL,
PRIMARY KEY (Codigo),
FOREIGN KEY (CodigoCurso) REFERENCES Curso (CodigoCurso),
)
GO

DROP TABLE Disciplina

INSERT INTO Disciplina(CodigoCurso, Codigo, Nome, Sigla, Turno, NumAulas)
VALUES (1, '4203-010', 'Arquitetura e Organização de Computadores', 'AOC', 'T', '4'),
	   (1, '4203-020', 'Arquitetura e Organização de Computadores', 'AOC', 'N', '4'),
	   (1,'4208-010', 'Laboratório de Hardware', 'LDH', 'T', '4'),
	   (1,'4226-004', 'Banco de Dados', 'BDD', 'T', '4'),
	   (1,'4213-003', 'Sistemas Operacionais I', 'SOI', 'T', '4'),
	   (1,'4213-013', 'Sistemas Operacionais I', 'SOI', 'N', '4'),
	   (1,'4233-005', 'Laboratório de Banco de Dados', 'LBD', 'T', '4'),
	   (2,'5005-220', 'Métodos Para a Produção do Conhecimento', 'MPC', 'T', '4')


GO


CREATE TABLE Notas(
RaAluno INT						NOT NUll,
CodigoAvaliacao INT				NOT NULL,
Nota DECIMAL (7,2)				NOT NULL,
PRIMARY KEY (RaAluno, CodigoAvaliacao),
FOREIGN KEY (CodigoAvaliacao) REFERENCES Avaliacao (Codigo),
FOREIGN KEY (RaAluno) REFERENCES Aluno(Ra),
)
GO

DROP TABLE Notas

INSERT INTO Notas(RaAluno, CodigoAvaliacao, Nota)
VALUES ('1', 1, 10),
       ('2', 1, 10),
       ('3', 1, 8),
	   ('4', 1, 9),  
	   ('5', 1, 9), 
	   ('6', 1, 10),
	   ('7', 1, 10)
GO



CREATE TABLE Avaliacao(
Codigo INT IDENTITY		NOT NUll,
CodigoDisciplina CHAR(8)	NOT NULL,
Tipo VARCHAR(2)			NOT NULL,
Peso DECIMAL(7,2)			NOT NULL,
PRIMARY KEY (Codigo),
FOREIGN KEY (CodigoDisciplina) REFERENCES Disciplina (Codigo),
)
GO

DROP TABLE Avaliacao

INSERT INTO Avaliacao(CodigoDisciplina, Tipo, Peso)
VALUES 
	--Arquitetura T e N
	('4203-010', 'P1', 0.3),
	('4203-010', 'P2', 0.5),
	('4203-010', 'T', 0.2),
    ('4203-020', 'P1', 0.3),
	('4203-020', 'P2', 0.5),
	('4203-020', 'T', 0.2),
	--LAB Hardware T
	('4208-010', 'P1', 0.3),
	('4208-010', 'P2', 0.5),
	('4208-010', 'T', 0.2),
	-- Banco de dados T
	('4226-004', 'P1', 0.3),
	('4226-004', 'P2', 0.5),
	('4226-004', 'T', 0.2),
	--Sistemas operacionais T E e N
	('4213-013', 'PE', 0.2),
	('4213-013', 'P1', 0.35),
	('4213-013', 'P2', 0.35),
	('4213-013', 'T', 0.3),
	('4213-003', 'PE', 0.2),
	('4213-003', 'P1', 0.35),
	('4213-003', 'P2', 0.35),
	('4213-003', 'T', 0.3),
	--Lab banco de dados T
	('4233-005', 'P1', 0.33),
	('4233-005', 'P2', 0.33),
	('4233-005', 'T', 0.33),
	--Métodos Para a Produção do Conhecimento - COMEX T
	('5005-220', 'MC', 0.8),
	('5005-220', 'MR', 0.2)
	   
GO

SELECT * FROM Avaliacao


SELECT * FROM Aluno
SELECT * FROM Faltas
SELECT * FROM Disciplina
SELECT * FROM Notas
SELECT * FROM Avaliacao