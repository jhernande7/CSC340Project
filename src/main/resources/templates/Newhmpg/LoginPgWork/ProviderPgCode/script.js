// JavaScript to handle dropdowns
document.addEventListener("DOMContentLoaded", () => {
  // Select all dropdown buttons
  const dropdownButtons = document.querySelectorAll(".dropdown-btn");

  dropdownButtons.forEach((button) => {
    button.addEventListener("click", (e) => {
      e.preventDefault();

      // Close other dropdowns if already open
      const allDropdowns = document.querySelectorAll(".dropdown-menu");
      allDropdowns.forEach((dropdown) => {
        if (dropdown !== button.nextElementSibling) {
          dropdown.style.display = "none";
        }
      });

      // Toggle the current dropdown
      const dropdownMenu = button.nextElementSibling;
      if (dropdownMenu.style.display === "block") {
        dropdownMenu.style.display = "none";
      } else {
        dropdownMenu.style.display = "block";
      }
    });
  });

  // Close dropdown if clicked outside
  document.addEventListener("click", (e) => {
    if (!e.target.closest(".dropdown")) {
      const allDropdowns = document.querySelectorAll(".dropdown-menu");
      allDropdowns.forEach((dropdown) => {
        dropdown.style.display = "none";
      });
    }
  });
});
