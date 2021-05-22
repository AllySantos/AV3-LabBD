create function fn_get_all_faltas(@CodigoDisciplina char(8))
returns @alunos_falta table(
	ra_aluno int,
	nome_aluno varchar(100),
	semana1 char(4),
	semana2 char(4),
	semana3 char(4),
	semana4 char(4),
	semana5 char(4),
	semana6 char(4),
	semana7 char(4),
	semana8 char(4),
	semana9 char(4),
	semana10 char(4),
	semana11 char(4),
	semana12 char(4),
	semana13 char(4),
	semana14 char(4),
	semana15 char(4),
	semana16 char(4),
	semana17 char(4),
	semana18 char(4),
	semana19 char(4),
	semana20 char(4)
	
)
as
begin


	declare @Ra as int,
			@DataFalta as date,
			@Presenca as int


	--Insere o RA e o nome dos alunos

	insert into @alunos_media (ra_aluno, nome_aluno) select distinct RaAluno, Aluno.Nome FROM Faltas 
													inner join Aluno
													on Faltas.RaAluno = Aluno.Ra
													where Notas.CodigoDisciplina = @CodigoDisciplina


	--Pega de uma disciplina em especifico
	DECLARE c CURSOR FOR SELECT RaAluno, DataFalta, Presenca FROM Faltas 
						where CodigoDisciplina = @CodigoDisciplina
						order by DataFalta
					

	OPEN c
	FETCH NEXT FROM c INTO @Ra, @DataFalta, @Presenca

	WHILE @@FETCH_STATUS = 0
	BEGIN



		FETCH NEXT FROM c INTO @Ra, @CodigoAvaliacao, @Nota
	END
	return

end