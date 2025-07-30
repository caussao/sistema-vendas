import { Route, Router, BrowserRouter } from "react-router-dom";
import "./App.css";
import Menu from "./components/Menu/Menu";
import Home from "./pages/Home/Home";
import CadastroProduto from "./pages/CadastroProdutos";

function App() {
  return (
    <>
      <BrowserRouter>
        <Menu>
          <Routes>
            <Route path="/cadastro-produto" element={<CadastroProduto />} />
          </Routes>
        </Menu>
      </BrowserRouter>
    </>
  );
}

export default App;
