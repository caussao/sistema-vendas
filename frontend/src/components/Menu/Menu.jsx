import { Link } from "react-router-dom";
import "./Menu.css";

function Menu() {
  return (
    <nav>
      <ul>
        <li>
          <Link to="/cadastro-produto">Cadastrar Produto</Link>
        </li>
      </ul>
    </nav>
  );
}

export default Menu;
