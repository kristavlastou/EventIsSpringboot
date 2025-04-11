# EventIS - Event Management Application

## Group Project Description
As part of our group project for the ISIA course, we developed an application called **EventIS** with the goal of utilizing technology for socialization. 

### Features:
- Users can create and share their own events.
- Users can browse events posted by others.
- Personalized user profiles allow users to save favorite events.

🔗 **Live Demo:** [EventIS](http://ism.dmst.aueb.gr/ismgroup8/eventIs.jsp)
- **Username:** user1
- **Password:** 12345

---

## Individual Project
For my individual assignment, I implemented the use case of **browsing available events**, selecting filters, and viewing event details.

### User Flow:
1. The user navigates to the home screen where all events are displayed.
2. The user can select a category and apply filters.
3. The user selects an event to view more details.

### Enhancements from the Group Project:
- **All events are displayed** on the homepage, regardless of category.
- Users can browse freely and apply additional filters.

### Possible Actions:
- **Applying Additional Filters:** Users can refine their search using checkboxes.
- **Submitting Filters:** Clicking the "Search" button applies the selected filters.
- **Viewing Filtered Results:** A dynamically updated event list is shown.
- **Selecting an Event:** Users can click an event to view detailed information.

### Alternative Flows:
- **A. No Available Events:**
  - If no events match the filters, a message notifies the user.
  - Users can modify the filters or return to the home screen.
- **B. Searching Without Filters:**
  - Clicking "Search" without filters will display all available events without a warning message.

---

## Technologies Used
### Backend:
- Spring Boot
- Spring MVC
- Spring Data JPA

### Frontend:
- Thymeleaf
- HTML, CSS, JavaScript

### Database:
- H2 (in-memory) or MySQL (configurable)

### Build Tool:
- Maven

---

## Architecture
The application follows the **MVC (Model-View-Controller)** architecture:
- **Model:** The `Event` entity represents an event with attributes like `id`, `name`, `date`, `city`, and `price`. The `User` class was added for database compatibility but is not used in this specific use case.
- **View:** Thymeleaf templates (`events.html`, `event-details.html`, `error.html`) for rendering UI components.
- **Controller:** Handles user requests and interacts with the service layer (`ErrorController.java`, `EventController.java`).
- **Service:** Implements business logic and communicates with the database.

---

## Setup & Build
### 1. Clone the repository:
```sh
git clone https://github.com/kristavlastou/SpringBootEventIs.git
```

### 2. Build the project (e.g., using an IDE or command line):
```sh
mvn clean install
```

### 3. Run the application:
```sh
mvn spring-boot:run
```

> **Note:** Database credentials are already configured in the `application.properties` file, so no further setup is required.


---

### 4. Open your Browser and visit the following URL:
```sh
http://localhost:8080/events
```

## Repository
The repository remains **private** for security reasons, as per project requirements.

---
## Example
- The homepage displays a list of all available events, unfiltered
- The user finds the "City" filter section.
- Selects "Patra" from the list of available cities.
- Clicks the "Search" button
- The event list updates, showing only events located in Patra.
- The user browses the filtered list and clicks on any event 
- The event details page loads, displaying all the available information



---

### Note
For security reasons the credentials to the database have been removed from the application.properties
