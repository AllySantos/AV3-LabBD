import { useEffect, useState } from "react"
import { Table, Form, Button } from 'react-bootstrap';
import api from '../../../service/api'

export default function AlunosLista({ avaliacao }) {

  var [aluno, setAluno] = useState([])
  var jsonAlunoNota;

  async function loadAlunos(avaliacao) {

    if (avaliacao.codigo !== undefined) {
      await api.get("alunos/nota/" + avaliacao.codigo)
        .then((response) => {
          setAluno(response.data)
        })
        .catch((err) => {
          console.error(err)
        })
    }


  }

  useEffect(() => {
    loadAlunos(avaliacao)
  }, [avaliacao])


  async function handleSubmit(e) {
    e.preventDefault()
    geraAluno()

    await api.put('alunos/nota/' + avaliacao.codigo, jsonAlunoNota, {
      headers: {
        'content-type': 'application/json'
      }
    })
  }

  function geraAluno() {

    var aluno = document.getElementsByName('aluno[]');

    var alunos = [];

    for (var i = 0; i < aluno.length; i = i + 3) {

      var alunoNota = {
        ra: aluno[i + 0].value,
        nome: aluno[i + 1].value,
        nota: aluno[i + 2].value
      }

      alunos.push(alunoNota)

    }

    jsonAlunoNota = JSON.stringify(alunos);

  }

  return (

    <Form action="/teste" method="POST" onSubmit={handleSubmit} id="form">
      <Table striped bordered hover className="mt-1">
        <thead>
          <tr>
            <th>RA</th>
            <th>Nome</th>
            <th>Nota</th>
          </tr>
        </thead>
        <tbody>

          {
            aluno.map((a) => (
              <tr key={a.ra}>
                <td><Form.Control as="input" defaultValue={a.ra} name="aluno[]" plaintext /></td>
                <td><Form.Control as="input" defaultValue={a.nome} name="aluno[]" plaintext /></td>
                <td>

                  <Form.Control as="input" className="w-25" defaultValue={a.nota} name="aluno[]" />
                </td>
              </tr>
            ))
          }

        </tbody>

      </Table>

      <Button variant="primary" type="submit">
        Submit
    </Button>

    </Form>

  )

}