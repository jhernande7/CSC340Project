document.getElementById("loginForm").onsubmit = function(event) {
    event.preventDefault(); // Prevent form submission

    // Get the username and password input values
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    // Placeholder for login logic (you would typically check credentials here)
    console.log("Attempting to login as provider:", username);

    // Example verification process (this should connect to a backend for real verification)
    if (username === "provider@example.com" && password === "password") {
        // Redirect to provider dashboard
        alert("Login successful! Redirecting to your service management dashboard...");
        window.location.href = "provider2.html"; // Redirect to the provider dashboard
    } else {
        alert("Invalid credentials. Please try again.");
    }
};
