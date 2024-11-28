class MyHeader extends HTMLElement {
connectedCallback() {
this.innerHTML = `
<header>

<section id="header-section">

  <style>
    /* Global Reset */
  * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
      font-family: 'Poppins', sans-serif;
  }


  /* Navigation Bar */
  nav {
      width: 100%;
      display: flex;
      align-items: center;
      justify-content: space-between;
      padding: 10px 0;
      position: relative; /* Enable dropdown positioning */
      background: rgba(0, 0, 0, 0.5); /* Dark gray with 50% transparency */
      backdrop-filter: blur(10px); /* Adds a slight blur effect for a modern look */
      z-index: 1000; /* Ensures it appears above other elements */
  }

  .logo {
      width: 180px;
      cursor: pointer;
  }

  nav ul {
      list-style: none;
      display: flex;
      gap: 20px;
      padding-right: 60px;
  }

  nav li {
      position: relative; /* Allows dropdown positioning */
  }

  nav ul li a {
      color: #fff;
      text-decoration: none;
      font-size: 18px;
      padding: 10px 15px;
      display: inline-block;
      transition: color 0.3s ease;
  }

  nav ul li a:hover {
      color: #f5168d; /* Pink hover effect */
  }

  /* Dropdown Menu */
  nav ul li .dropdown {
      display: none; /* Hidden by default */
      position: absolute;
      top: 100%; /* Position below the parent menu item */
      left: 0;
      background: #fff; /* White background for the dropdown */
      border-radius: 5px;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2); /* Subtle shadow */
      z-index: 1000;
      min-width: 250px; /* Ensure consistent width */
      padding: 10px 0;
      text-align: left;
  }

  nav ul li:hover .dropdown {
      display: block; /* Show dropdown on hover */
  }

  .dropdown-item {
      padding: 10px 15px;
      transition: background 0.3s ease, color 0.3s ease;
  }

  .dropdown-item a {
      text-decoration: none;
      color: #333; /* Dark text for dropdown links */
      font-weight: bold;
      font-size: 16px;
  }

  .dropdown-item:hover {
      background: #f5168d; /* Pink background on hover */
      color: #fff;
  }

  /* Description Text */
  .dropdown-item p {
      font-size: 14px;
      color: #555;
      margin-top: 5px;
      line-height: 1.4;
      font-weight: normal;
  }

  /* Button */
  .btn {
      display: flex;
      align-items: center;
      padding: 10px 20px;
      border: 0;
      outline: 0;
      border-radius: 5px;
      background: #f5168d;
      color: #fff;
      font-weight: 500;
      cursor: pointer;
  }

  .btn img {
      width: 20px;
      margin-right: 10px;
  }

  /* Icons Section */
  .nav-icons {
      display: flex;
      align-items: center;
      gap: 15px;
  }

  .nav-icons .icon-link {
      display: flex;
      align-items: center;
      justify-content: center;
      width: 40px;
      height: 40px;
      border-radius: 50%;
      background: rgba(211, 211, 211, 0.7); /* Light gray with transparency */
      cursor: pointer;
      transition: background 0.3s ease;
  }

  .nav-icons .icon-link:hover {
      background: rgba(211, 211, 211, 1); /* Slightly darker on hover */
  }

  .nav-icons .icon-link img {
      width: 24px;
      height: 24px;
  }

  /* Content Section */
  .content {
      margin-top: 14%;
      color: #fff;
      max-width: 620px;
  }

  .content h1 {
      font-size: 70px;
      font-weight: 600;
      line-height: 85px;
      margin-bottom: 25px;
  }

  .content form {
      display: flex;
      align-items: center;
      background: #fff;
      border-radius: 5px;
      padding: 10px;
      margin-top: 30px;
  }

  .content form input {
      border: 0;
      outline: 0;
      width: 100%;
      font-size: 16px;
      padding-left: 10px;
  }

  .content form .btn {
      font-size: 15px;
      padding: 10px 30px;
  }




  </style>
  <div class="container">
    <nav>
      <a href="../Newhmpg/samplelogin.html">
        <img src="../Newhmpg/logo23.png" class="logo" alt="Logo">
      </a>
      <ul>
        <!-- How it Works -->
        <li>
          <a href="#">How it works</a>
          <div class="dropdown">
            <div class="dropdown-item">
              <a href="#">Pricing</a>
              <p>Flat rate pricing based on labor time and parts</p>
            </div>
            <div class="dropdown-item">
              <a href="#">Reviews</a>
              <p>Trusted mechanics rated by thousands of happy customers</p>
            </div>
            <div class="dropdown-item">
              <a href="#">Book a Mechanic Online</a>
              <p>Book a top-rated mobile mechanic online</p>
            </div>
            <div class="dropdown-item">
              <a href="#">Contact</a>
              <p>Reach us by phone or email, or read our FAQs</p>
            </div>
          </div>
        </li>

        <!-- Services -->
        <li>
          <a href="#">Services</a>
          <div class="dropdown">
            <div class="dropdown-item">
              <a href="#">Oil Change</a>
              <p>Quick and affordable oil change services</p>
            </div>
            <div class="dropdown-item">
              <a href="#">Battery Replacement</a>
              <p>Convenient and reliable battery replacement</p>
            </div>
            <div class="dropdown-item">
              <a href="#">Pre-purchase Car Inspection</a>
              <p>Ensure the vehicle you’re buying is road-ready</p>
            </div>
            <div class="dropdown-item">
              <a href="#">Brake Pad Replacement</a>
              <p>Professional brake pad replacement for safe driving</p>
            </div>
            <div class="dropdown-item">
              <a href="#">Towing and Roadside Assistance</a>
              <p>Emergency towing and roadside support services</p>
            </div>
            <div class="dropdown-item">
              <a href="NewhmPg/Services.html">Explore 100+ Services</a>
              <p>Discover all the services we provide for your car</p>
            </div>
          </div>
        </li>

        <!-- Cities -->
        <li>
          <a href="#">Cities</a>
          <div class="dropdown">
            <div class="dropdown-item">
              <a href="#">Charlotte, NC</a>
              <p>Find mechanics in Charlotte, North Carolina</p>
            </div>
            <div class="dropdown-item">
              <a href="#">Los Angeles, CA</a>
              <p>Trusted professionals in Los Angeles, California</p>
            </div>
            <div class="dropdown-item">
              <a href="#">Atlanta, GA</a>
              <p>Top-rated mechanics in Atlanta, Georgia</p>
            </div>
            <div class="dropdown-item">
              <a href="#">San Antonio, TX</a>
              <p>Affordable car services in San Antonio, Texas</p>
            </div>
            <div class="dropdown-item">
              <a href="#">Dallas, TX</a>
              <p>Mechanics available in Dallas, Texas</p>
            </div>
            <div class="dropdown-item">
              <a href="#">All Cities</a>
              <p>Explore all cities we currently serve</p>
            </div>
          </div>
        </li>

        <!-- Use Our Guide -->
        <li>
          <a href="#">Use Our Guide</a>
          <div class="dropdown">
            <div class="dropdown-item">
              <a href="#">Articles & Questions</a>
              <p>Over 25,000 topics from beginner tips to technical guides</p>
            </div>
            <div class="dropdown-item">
              <a href="#">Estimates</a>
              <p>Get instant auto repair estimates for your car</p>
            </div>
            <div class="dropdown-item">
              <a href="#">Cars</a>
              <p>Check cars for recalls, common issues, and maintenance costs</p>
            </div>
            <div class="dropdown-item">
              <a href="#">Scheduled Maintenance</a>
              <p>View your car’s maintenance schedule</p>
            </div>
          </div>
        </li>
      </ul>
      <div class="nav-icons">
      <a href= "LoginPgWork/SignUp.html" class="btn-link">
        <button class="btn">
          <img src="icon.png" alt="Mechanic Icon"> Become A Mechanic
        </button>
      </a>
        <a href="#" class="icon-link">
          <img src="../Newhmpg/search.png" alt="Search Icon">
        </a>
        <a href="#" class="icon-link">
          <img src="../Newhmpg/user.png" alt="User Icon">
        </a>
      </div>
    </nav>
  </div>
</section>




</header>
`
}
}

customElements.define('my-header', MyHeader)