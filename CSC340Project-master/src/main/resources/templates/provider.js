// Initialize services array
let services = JSON.parse(localStorage.getItem('services')) || [];

// Function to update the service table display
function updateServiceTable() {
    const tableBody = document.getElementById("serviceTable").getElementsByTagName('tbody')[0];
    tableBody.innerHTML = ''; // Clear the existing table body

    // Populate the table with services
    services.forEach((service, index) => {
        const newRow = tableBody.insertRow();
        newRow.innerHTML = `
            <td>${service.name}</td>
            <td>${service.description}</td>
            <td>$${service.price}</td>
            <td>
                <button onclick="editService(${index})">Edit</button>
                <button onclick="deleteService(${index})">Delete</button>
            </td>
        `;
    });
}

// Function to handle service addition
document.getElementById("serviceForm").onsubmit = function(event) {
    event.preventDefault(); // Prevent form submission
    const serviceName = document.getElementById("serviceName").value;
    const serviceDescription = document.getElementById("serviceDescription").value;
    const servicePrice = document.getElementById("servicePrice").value;

    // Create a new service object and add it to the array
    services.push({
        name: serviceName,
        description: serviceDescription,
        price: servicePrice
    });

    // Save to local storage
    localStorage.setItem('services', JSON.stringify(services));

    // Update the service table display
    updateServiceTable();

    // Clear the form
    document.getElementById("serviceForm").reset();
};

// Load services from local storage when the page loads
window.onload = function() {
    const savedServices = localStorage.getItem('services');
    if (savedServices) {
        services = JSON.parse(savedServices);
        updateServiceTable(); // Update the table to show saved services
    }
};
