package homeworkWeek5.Prob1;

import homeworkWeek5.Prob1.Flight.StatusEnum;

public class MainApp {

	public static void main(String[] args) {
		FlightManagement flightManager = new FlightManagement();

        User user1 = new User("Sergiu", "Bugneac","1989.01.13");
        User user2 = new User("Ciprian", "Leon","1985.05.11");
        User user3 = new User("Gheorghe", "Zamfir","1987.07.23");


        System.out.println(user1.getBirthDate());
        Flight flight = new Flight("Flight045", "Paris", "2019.01.21 10:11", 200, 2, StatusEnum.SCHEDULED);
        Flight flight1 = new Flight("Flight055", "Chisinau", "2019.01.22 10:11", 190, 12, StatusEnum.FINISHED);
        
        flightManager.addFlight(flight);
        flightManager.addFlight(flight1);
        flightManager.addUserToFlight(user1, flight);
        flightManager.getPassengers(flight);
        flightManager.removeUserFromFlight(user1, flight);
        flightManager.addUserToFlight(user2, flight);
        flightManager.addUserToFlight(user3, flight);

        flightManager.getPassengers(flight);
        flightManager.getFlights();
        flightManager.removeFlight(flight1);

        //remove flight by flight name
        flightManager.addFlight(new Flight("flight901", "Chisinau", "2019.01.07 14:11", 190, 12, StatusEnum.SCHEDULED));
        flightManager.removeFlightName("flight901");
        flightManager.addPassenger(new User("Alexandru", "Buzu","1989.12.21"));
        flightManager.removeUserByName("Alexandru Buzu");

        //asign passenger to flight by passenger name and flight name
        //flightManager.addPassenger(user4);
        flightManager.getPassengers();
        flightManager.addPassengerToFlight("Bogdan Ioan", "Flight045");
        flightManager.addPassengerToFlight("Dima Gheorghe", "Flight897");

        //adding flights and users
        flightManager.addFlight(new Flight("Flight09999", "Milan", "2019.01.22 10:11", 60, 48, StatusEnum.FINISHED));  
        flightManager.passengerFlights("Sergiu Bugneac");
        flightManager.totalPassengerFlights("Sergiu Bugneac");
        flightManager.visitedDestinations("Sergiu Bugneac");
        flightManager.scheduledDestinations("Sergiu Bugneac");
        flightManager.totalVisitedDestinations("Sergiu Bugneac");
        //update flights
        flightManager.showFlightsStatus();
        flightManager.updateFlights();
        flightManager.showFlightsStatus();
        //show flights with status argument
        flightManager.showFlightsStatus(StatusEnum.FINISHED);
    }

	}


