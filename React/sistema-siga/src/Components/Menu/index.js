import { Navbar, Nav } from 'react-bootstrap';
import Notas from '../Notas'

import { Link, Route, Switch } from 'react-router-dom';
import InserirNotas from '../Notas/InserirNotas';
import ExibirMedia from '../Notas/ExibirMedia';

export default function Menu() {

  return (
    <>
      <Navbar bg="light" expand="lg" className="d-flex flex-row justify-content-between">
        <Navbar.Brand href="#home" className="flex-grow-1">Sistema Siga</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="ml-auto">

            <Link to="/notas">Notas</Link>



          </Nav>

        </Navbar.Collapse>
      </Navbar>


      <Switch>
        <Route path="/notas" component={Notas} />
        <Route path="/inserirNotas" component={InserirNotas} />
        <Route path="/visualizarNotas" component={ExibirMedia} />
      </Switch>


    </>
  )
}