function leaveAMessage(name, message) {
    if (name === "")
        error = "Name cannot be empty.";
    if (email === "")
        error = "Email cannot be empty.";
    if (message === "")
        error = "Message cannot be empty.";
    else {
        error = "";
        alert("Message sent!");
    }
    return `Message from ${name}: ${message}`;
}

function successMessage() {
    alert("Message sent!");
    return "Message sent!";
}