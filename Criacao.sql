CREATE DATABASE Escola
GO

USE Escola
GO

CREATE TABLE Aluno(
Ra INT		NOT NUll,
Nome VARCHAR(100)		NOT NULL,
PRIMARY KEY (Ra),
)
GO

CREATE TABLE Faltas(
RaAluno INT				NOT NUll,
CodigoDisciplina INT	NOT NULL,
Data Date				NOT NULL,
Presenca INT			NOT NULL,
PRIMARY KEY (RaAluno, CodigoDisciplina, Data),
)
GO

CREATE TABLE Disciplina(
Codigo INT				NOT NULL,
Nome VARCHAR(100)		NOT NULL,
Sigla VARCHAR(3)        NOT NULL,
Turno VARCHAR(50)		NOT NULL,
NumAulas INT			NOT NULL,
PRIMARY KEY (Codigo),
)
GO

CREATE TABLE Notas(
RaAluno INT				NOT NUll,
CodigoDisciplina INT	NOT NULL,
CodigoAvaliacao INT		NOT NULL,
Nota INT				NOT NULL,
PRIMARY KEY (RaAluno, CodigoDisciplina, CodigoAvaliacao),
)
GO


CREATE TABLE Avaliacao(
Codigo INT				NOT NUll,
Tipo VARCHAR(2)			NOT NULL,
Peso DECIMAL			NOT NULL,
PRIMARY KEY (Codigo),
)
GO

SELECT * FROM Aluno
SELECT * FROM Faltas
SELECT * FROM Disciplina
SELECT * FROM Notas
SELECT * FROM Avaliacao