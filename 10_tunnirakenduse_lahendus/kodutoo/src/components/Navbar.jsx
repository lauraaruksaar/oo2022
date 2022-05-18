import { Link } from "react-router-dom";

function Navbar() {
    return (
    <div>
    <nav className="navbar navbar-expand-lg navbar-light bg-light">
    <div className="container-fluid">
      <Link to="/">
        <div className="navbar-brand">Student attendance</div>
      </Link>
      <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span className="navbar-toggler-icon"></span>
      </button>
      <div className="collapse navbar-collapse" id="navbarNav">
        <div className="navbar-nav">
            <Link to="lisa">
            <div className="nav-link">Add students</div>
            </Link>
            <Link to="halda">
            <div className="nav-link">Show students</div>
            </Link>
        </div>
      </div>
    </div>
  </nav>
  </div>
  );
}

export default Navbar;