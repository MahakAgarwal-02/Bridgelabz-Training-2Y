package collections;

import java.util.*;

class RideRequest {
 int requestId;
 String pickup;
 int priority;  

 public RideRequest(int requestId, String pickup, int priority) {
     this.requestId = requestId;
     this.pickup = pickup;
     this.priority = priority;
 }

 @Override
 public String toString() {
     return "Request#" + requestId + " | Pickup: " + pickup + " | Priority: " + priority;
 }
}

class Driver {
 int driverId;
 String name;

 public Driver(int driverId, String name) {
     this.driverId = driverId;
     this.name = name;
 }

 @Override
 public int hashCode() {
     return Objects.hash(driverId);
 }

 @Override
 public boolean equals(Object obj) {
     if (!(obj instanceof Driver)) return false;
     Driver d = (Driver) obj;
     return this.driverId == d.driverId;
 }

 @Override
 public String toString() {
     return "Driver#" + driverId + " - " + name;
 }
}

class Ride {
 RideRequest request;
 Driver driver;

 public Ride(RideRequest request, Driver driver) {
     this.request = request;
     this.driver = driver;
 }

 @Override
 public String toString() {
     return "Ride Completed: " + request + " | Driver: " + driver;
 }
}

public class RideSharingSystem {

 public static void main(String[] args) {

     Queue<RideRequest> requestQueue = new LinkedList<>();

     PriorityQueue<RideRequest> priorityRequests =
             new PriorityQueue<>(Comparator.comparingInt(r -> r.priority));

     Set<Driver> availableDrivers = new HashSet<>();

     List<Ride> completedRides = new ArrayList<>();

     availableDrivers.add(new Driver(101, "Ramesh"));
     availableDrivers.add(new Driver(102, "Suresh"));
     availableDrivers.add(new Driver(103, "Mahesh"));
     availableDrivers.add(new Driver(101, "Duplicate Ramesh"));  // duplicate ignored

     addRideRequest(requestQueue, priorityRequests, 1, "Sector 14", 3);
     addRideRequest(requestQueue, priorityRequests, 2, "MG Road", 1); // high priority
     addRideRequest(requestQueue, priorityRequests, 3, "Cyber City", 5);
     addRideRequest(requestQueue, priorityRequests, 4, "Huda City", 2); // high priority

     System.out.println("\nAssigning Rides...");
     while (!availableDrivers.isEmpty() &&
            (!priorityRequests.isEmpty() || !requestQueue.isEmpty())) {

         RideRequest request;

         if (!priorityRequests.isEmpty()) {
             request = priorityRequests.poll();
         } else {
             request = requestQueue.poll();
         }

         Driver driver = availableDrivers.iterator().next();
         availableDrivers.remove(driver);

         Ride completed = new Ride(request, driver);
         completedRides.add(completed);

         System.out.println(completed);
     }

     System.out.println("\n--- Completed Ride History ---");
     completedRides.forEach(System.out::println);
 }

 public static void addRideRequest(Queue<RideRequest> q,
                                   PriorityQueue<RideRequest> pq,
                                   int id, String pickup, int priority) {

     RideRequest r = new RideRequest(id, pickup, priority);

     if (priority <= 2) {
         pq.add(r);  
     } else {
         q.add(r);
     }

     System.out.println("New Request Added: " + r);
 }
}
