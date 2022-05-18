import { Link } from "react-router-dom";

function Navbar() {
    return (
    <div>
    <nav className="navbar navbar-expand-lg navbar-light bg-light">
    <div className="container-fluid">
      <Link to="/">
        <div className="navbar-brand">Veebipood</div>
      </Link>
      <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span className="navbar-toggler-icon"></span>
      </button>
      <div className="collapse navbar-collapse" id="navbarNav">
        <div className="navbar-nav">
            <Link to="lisa">
            <div class="nav-link">Lisa toode</div>
            </Link>
            <Link to="halda">
            <div class="nav-link">Halda tooteid</div>
            </Link>
            <Link to="ostukorv">
            <div class="nav-link">Ostukotv</div>
            </Link>
        </div>
      </div>
    </div>
  </nav>
  </div>
  );
}

export default Navbar;