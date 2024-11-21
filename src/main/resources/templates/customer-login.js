document.getElementById("customerLoginForm").onsubmit = function(event) {
    event.preventDefault(); // Prevent form submission

    // Get the email and password input values
    const email = document.getElementById("customerEmail").value;
    const password = document.getElementById("customerPassword").value;

    // Placeholder for login logic (this should connect to a backend for real verification)
    console.log("Attempting to login as customer:", email);

    // Example verification process (replace with real checks)
    if (email === "customer@example.com" && password === "password") {
        // Redirect to provider dashboard or show success message
        alert("Login successful! Redirecting to the provider dashboard...");
        window.location.href = "provider.html"; // Redirect to the provider dashboard
    } else {
        alert("Invalid credentials. Please try again.");
    }
};
