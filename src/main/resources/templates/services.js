// Save services to local storage
localStorage.setItem('services', JSON.stringify(services));

// Load services from local storage when the page loads
window.onload = function() {
    const savedServices = localStorage.getItem('services');
    if (savedServices) {
        services = JSON.parse(savedServices);
        updateServiceTable(); // Update the table to show saved services
    }
};
