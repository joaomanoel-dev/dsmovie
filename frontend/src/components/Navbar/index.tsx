import { ReactComponent as GitHubIcon } from 'assets/img/github.svg';
import './styles.css';

function Navbar() {
  return (
    <header>
      <nav className='container'>
        <div className='dsmovie-nav-content'>
          <h1>
            Rate the film
          </h1>
          <a href='https://github.com/joaomanoel-dev'>
            <div className='dsmovie-contact-container'>
              <GitHubIcon />
              <p className='dsmovie-contact-link'>/joaomanoel-dev</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;