##Ticketing System Simulation
Introduction
This is a ticketing system simulation, designed to demonstrate the interaction between vendors and customers in a ticket-based environment. The system consists of a backend API built with Java Spring Boot and a frontend UI built with React.

#Setup Instructions
Java 11 or later
Node.js 14 or later
Maven 3.6 or later
npm 6 or later

## Building and Running the Application
Clone the repository to in local machine.
Navigate to the backend directory and run mvn clean install to build the backend API.
Navigate to the frontend directory and run npm install to install the dependencies.
Run npm start to start the frontend UI.
Run the backend API by executing the TicketingSystemApplication class.

##Usage Instructions
Configuring and Starting the System
Open the frontend UI in your web browser.
Click on the "Start" button to start the simulation.
Configure the system by entering the desired values for total tickets, ticket release rate, customer retrieval rate, and maximum ticket capacity.
Click on the "Update" button to save the configuration.

##UI Controls
Vendor: Displays the number of tickets added by the vendor.
Purchased: Displays the number of tickets purchased by customers.
Available: Displays the number of available tickets.
Start: Starts the simulation.
Stop: Stops the simulation.
Log Table: Displays the thread output log.

##Troubleshooting
If the simulation does not start, check the console logs for any errors.
If the UI does not update, try refreshing the page.

## API Endpoints
POST /api/configuration/update: Updates the system configuration.
GET /api/configuration/latest: Retrieves the latest system configuration.

##Code Style
Use consistent naming conventions and indentation.
