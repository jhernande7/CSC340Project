function toggleDescription(jobId) {
    const description = document.querySelector(`#${jobId} .job-description`);
    if (description.style.display === "none" || description.style.display === "") {
        description.style.display = "block"; // Show the description
    } else {
        description.style.display = "none"; // Hide the description
    }
}
