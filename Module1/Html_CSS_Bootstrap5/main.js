// 1. Basic setup
console.log("Welcome to the Community Portal");
window.onload = function() {
  alert("Page fully loaded");
};

// 2. Event details example
const eventName = "City Music Festival";
const eventDate = "2025-06-15";
let availableSeats = 100;
console.log(`Event: ${eventName} on ${eventDate}`);

// 3. Example events array
const events = [
  { name: "Music Festival", date: "2025-06-15", seats: 100, category: "music" },
  { name: "Art Workshop", date: "2025-04-10", seats: 0, category: "art" },
  { name: "Food Fair", date: "2025-07-20", seats: 50, category: "food" }
];

// 3. Show only upcoming events with seats
function displayValidEvents() {
  const today = new Date();
  const validEvents = events.filter(e => new Date(e.date) >= today && e.seats > 0);
  validEvents.forEach(e => {
    console.log(`Upcoming: ${e.name} on ${e.date} - Seats: ${e.seats}`);
  });
}
displayValidEvents();

// 4. Functions and closures
function addEvent(newEvent) {
  events.push(newEvent);
}

function registerUser(eventName) {
  try {
    const event = events.find(e => e.name === eventName);
    if (!event) throw new Error("Event not found");
    if (event.seats <= 0) throw new Error("No seats available");
    event.seats--;
    console.log(`Registered for ${eventName}. Seats left: ${event.seats}`);
  } catch (error) {
    console.error(error.message);
  }
}

function filterEventsByCategory(category, callback) {
  const filtered = events.filter(e => e.category === category);
  callback(filtered);
}

// Closure example: Track registrations per category
function createRegistrationCounter() {
  const counts = {};
  return function(category) {
    counts[category] = (counts[category] || 0) + 1;
    return counts[category];
  };
}
const countRegistrations = createRegistrationCounter();

// 5. Event constructor and prototype
function Event(name, date, seats, category) {
  this.name = name;
  this.date = date;
  this.seats = seats;
  this.category = category;
}
Event.prototype.checkAvailability = function() {
  return this.seats > 0;
};

// 6. Array methods usage
addEvent(new Event("Baking Workshop", "2025-08-05", 30, "food"));
const musicEvents = events.filter(e => e.category === "music");
const eventCards = events.map(e => `${e.name} on ${e.date}`);

// 7. DOM manipulation: Display events dynamically
function renderEvents() {
  const container = document.getElementById("eventsContainer");
  container.innerHTML = "";
  events.forEach(e => {
    const card = document.createElement("div");
    card.className = "eventCard";
    card.textContent = `${e.name} - ${e.date} (${e.seats} seats left)`;
    container.appendChild(card);
  });
}
renderEvents();

// 8. Event handling
document.getElementById("categoryFilter").onchange = function() {
  const cat = this.value;
  filterEventsByCategory(cat, filteredEvents => {
    const container = document.getElementById("eventsContainer");
    container.innerHTML = "";
    filteredEvents.forEach(e => {
      const card = document.createElement("div");
      card.className = "eventCard";
      card.textContent = `${e.name} - ${e.date} (${e.seats} seats left)`;
      container.appendChild(card);
    });
  });
};

document.addEventListener("keydown", function(event) {
  const searchInput = document.getElementById("searchName");
  if (document.activeElement === searchInput) {
    const value = searchInput.value.toLowerCase();
    const filtered = events.filter(e => e.name.toLowerCase().includes(value));
    const container = document.getElementById("eventsContainer");
    container.innerHTML = "";
    filtered.forEach(e => {
      const card = document.createElement("div");
      card.className = "eventCard";
      card.textContent = `${e.name} - ${e.date} (${e.seats} seats left)`;
      container.appendChild(card);
    });
  }
});

// 9. Async fetch mock
async function fetchEvents() {
  const loadingSpinner = document.getElementById("loadingSpinner");
  loadingSpinner.style.display = "block";
  try {
    const response = await fetch("https://mockapi.io/api/events");
    if (!response.ok) throw new Error("Network response was not ok");
    const data = await response.json();
    console.log("Fetched events:", data);
  } catch (error) {
    console.error("Fetch error:", error);
  } finally {
    loadingSpinner.style.display = "none";
  }
}
//fetchEvents(); // Uncomment if you have a mock API

// 11 & 12. Form handling with validation and submission simulation
function submitForm(event) {
  event.preventDefault();

  const form = document.getElementById("registrationForm");

  const name = form.name.value.trim();
  const email = form.email.value.trim();
  const date = form.date.value;
  const eventType = form.eventType.value;
  const message = form.message.value.trim();

  let errorMessage = "";

  if (!name) errorMessage += "Please enter your name.\n";
  if (!email || !email.includes("@")) errorMessage += "Please enter a valid email.\n";
  if (!date) errorMessage += "Please select a date.\n";
  if (!eventType) errorMessage += "Please select an event type.\n";

  if (errorMessage) {
    alert(errorMessage);
    return;
  }

  document.getElementById("confirmation").textContent =
    `Thank you, ${name}, for registering for a ${eventType} event on ${date}!`;

  // Simulate server POST with delay
  setTimeout(() => {
    console.log("User registration data sent to server.");
  }, 1000);
}

// Attach form submit event listener
document.getElementById("registrationForm").addEventListener("submit", submitForm);

// 13. Debug logs example
console.log("Script loaded and ready.");

// 14. jQuery example (optional, requires jQuery library)
/*
$(document).ready(function() {
  $('#registerBtn').click(function() {
    alert("Register button clicked");
  });

  $('.eventCard').fadeIn();

  // Benefit of frameworks: easier UI state management and scalability
});
*/
