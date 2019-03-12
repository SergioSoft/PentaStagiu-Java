package homeworkWeek5.Prob1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import homeworkWeek5.Prob1.Flight.StatusEnum;

public class FlightManagement {
    private List<User> passagers = new ArrayList<>();
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        for(int i = 0; i< flights.size(); i++ ) {
            if (flights.get(i).getName().equals(flights.get(i).getName())){
                System.out.println("You cannot add two flights with the same name");
                return ;
            }
        }
        flights.add(flight);
    }

    public void addPassenger(User user) {
        for (int i = 0; i< passagers.size(); i++ ) {
            if (passagers.get(i).getFullName().equalsIgnoreCase(user.getFullName())){
                System.out.println(user.getFullName() + " is already added to the passenger list.");
                return ;
            }
        }
        passagers.add(user);
        System.out.println(user.getFullName() + " was added to the passenger list.");
    }

    public void removeFlightName(String flightName){
        if (flights.size() == 0) {
            System.out.println("There are no flights to remove");
            return ;
        }
        Iterator<Flight> flightIterator = flights.iterator();
        while(flightIterator.hasNext()) {
            Flight flight = flightIterator.next();
            if (flight.getName().equalsIgnoreCase(flightName)) {
                flightIterator.remove();
                System.out.println("The flight: " + flightName + " was removed.");
                return ;
            }
        }
        System.out.println("The flight " + flightName + " was not found in the list.");
    }


    public void addUserToFlight(User user, Flight flight) {
        flight.addUser(user);
        addPassenger(user);
    }

    public void removeUserFromFlight(User user, Flight flight) {
        flight.removeUser(user);
    }

    public void getPassengers(Flight flight) {
        flight.getUsers();
    }

    public void removeFlight(Flight flight) {
        if (flights.size() == 0) {
            System.out.println("There are no flights to remove.");
            return;
        }
        Iterator<Flight> flightIterator = flights.iterator();

        while(flightIterator.hasNext()) {
            if (flightIterator.next().equals(flight)) {
                System.out.println("The flight: " + flight.getName() + " was removed from the list.");
                flights.remove(flight);
            }
        }
    }

    public void getFlights() {
        System.out.println("The flights list contain the following flights: ");
        for(int i = 0; i< flights.size(); i++ ) {
            System.out.println(flights.get(i).getName() + " with the destination: " + flights.get(i).getDestination() + " with the capacity of: " + flights.get(i).getMaxUserCapacity() +
                   " and the remaining seats are: " + flights.get(i).remainingSeats() + " .Flight duration: " + flights.get(i).getFlightDuration());
        }
    }

    public void removeUserByName(String name) {
        if (passagers.size() == 0) {
            System.out.println("There are no passengers on the list.");
        }
        Iterator<User> userIterator = passagers.iterator();
        while(userIterator.hasNext()) {
            User user = userIterator.next();
            if (user.getFullName().equalsIgnoreCase(name)){
                userIterator.remove();
                System.out.println("The passenger: " + name + " was removed.");
                return ;
            }
        }
        System.out.println("There was no passenger with such name.");
    }

    public void getPassengers(){
        System.out.println("The passengers list: ");
        for (int i = 0; i<passagers.size(); i++ ) {
            System.out.println(passagers.get(i).getFullName());
        }
    }

    public User returnPassenger(String name){
        for (int i = 0; i<passagers.size(); i++ ) {
            if (passagers.get(i).getFullName().equalsIgnoreCase(name)) {
                return passagers.get(i);
            }
        }
        return null;
    }

    public Flight returnFlight(String name) {
        for (int i = 0; i< flights.size(); i++ ) {
            if (flights.get(i).getName().equalsIgnoreCase(name)) {
                return flights.get(i);
            }
        }
        return null;
    }

    public void addPassengerToFlight(String passenger, String flight) {
        User user = returnPassenger(passenger);
        if (user == null) {
            System.out.println("The passenger: " + passenger + " was not found.");
            return ;
        }
        Flight flight1 = returnFlight(flight);
        if (flight1 == null) {
            System.out.println("We could not find the flight: " + flight);
            return ;
        }
        flight1.addUser(user);
    }

    //what flights did a user joined
    public void passengerFlights(String user) {
        if (returnPassenger(user) == null){
            System.out.println(user + " is not a passenger");
            return;
        }
        System.out.println(user + " is registered to the following flights:");
        flights.stream().filter(p -> p.checkPassengerList(user)).forEach(flight -> System.out.println(flight.getName() + " " +
                flight.getDestination() + " " + flight.getStatus()));
    }

    //How many flights did a user joined
    public void totalPassengerFlights(String user) {
        if (returnPassenger(user) == null){
            System.out.println(user + " is not a passenger");
            return;
        }
        long count = flights.stream().filter(p -> p.checkPassengerList(user)).count();
        System.out.println(user + " registered to: " + count + " flights");
    }

    //How many / what destinations did a user visited
    public void visitedDestinations(String user) {
        if (returnPassenger(user) == null){
            System.out.println(user + " is not a passenger");
            return;
        }
        System.out.println(user + " went to the following destinations: ");
        flights.stream().filter(p -> p.checkPassengerList(user)).filter(p -> p.getStatus().equals(StatusEnum.FINISHED)).forEach(flight -> System.out.println(flight.getDestination()));
    }

    public void totalVisitedDestinations(String user) {
        if (returnPassenger(user) == null){
            System.out.println(user + " is not a passenger");
            return;
        }
        long total = flights.stream().filter(p -> p.checkPassengerList(user)).filter(p -> p.getStatus().equals(StatusEnum.FINISHED)).count();
        System.out.println(user + " went in a total of " + total + " destinations.");
        }

    //How many / what are the flights scheduled in the future
    public void scheduledDestinations(String user) {
        if (returnPassenger(user) == null){
            System.out.println(user + " is not a passenger");
            return;
        }
        System.out.println(user + " will go to the following destinations: ");
        flights.stream().filter(p -> p.checkPassengerList(user)).filter(p -> p.getStatus().equals(StatusEnum.SCHEDULED)).forEach(flight -> System.out.println(flight.getDestination()));
    }

    public void updateFlights(){
        flights.stream().filter(p -> p.getStatus().equals(StatusEnum.SCHEDULED)).
                forEach((p) -> {
                    Date dateTime = p.getDate();
                    Date newDate = new Date(dateTime.getTime() + 60 * p.getFlightDuration());
                    if (newDate.getTime() > new Date().getTime()) {
                        p.setStatus(StatusEnum.FINISHED);
                    }
                });
    }

    public void showFlightsStatus(){
        flights.stream().forEach((p) -> System.out.println(p.getName() + " " + p.getStatus()));
    }

    public void showFlightsStatus(StatusEnum status) {
        updateFlights();
        System.out.println("Flights with status " + status);
        flights.stream().filter(p -> p.getStatus().equals(status)).forEach(p -> System.out.println(p.getName() + " " + p.getStatus()));
    }
}