import { Navbar, Nav } from 'react-bootstrap';

export default function Menu() {

  return (
    <Navbar bg="light" expand="lg" className="d-flex flex-row justify-content-between">
      <Navbar.Brand href="#home" className="flex-grow-1">Sistema Siga</Navbar.Brand>
      <Navbar.Toggle aria-controls="basic-navbar-nav" />
      <Navbar.Collapse id="basic-navbar-nav">
        <Nav className="ml-auto">
          <Nav.Link href="#home">Notas</Nav.Link>
          <Nav.Link href="#link">Faltas</Nav.Link>
        </Nav>

      </Navbar.Collapse>
    </Navbar>

  )
}