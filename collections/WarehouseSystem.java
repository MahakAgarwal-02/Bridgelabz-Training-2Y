package collections;

import java.util.*;

class Package {
 String packageId;
 String address;

 public Package(String packageId, String address) {
     this.packageId = packageId;
     this.address = address;
 }

 @Override
 public String toString() {
     return "PackageID: " + packageId + ", Address: " + address;
 }
}

public class WarehouseSystem {

 public static void main(String[] args) {

     Queue<Package> pendingDeliveries = new LinkedList<>();

     Set<String> uniquePackageIds = new HashSet<>();

     List<Package> deliveredList = new ArrayList<>();

     Stack<Package> returnedStack = new Stack<>();

     
     addPackage(new Package("PKG101", "Delhi"), pendingDeliveries, uniquePackageIds);
     addPackage(new Package("PKG102", "Mumbai"), pendingDeliveries, uniquePackageIds);
     addPackage(new Package("PKG103", "Pune"), pendingDeliveries, uniquePackageIds);
     addPackage(new Package("PKG101", "Delhi"), pendingDeliveries, uniquePackageIds); 

    
     System.out.println("\nProcessing Deliveries...\n");

     while (!pendingDeliveries.isEmpty()) {
         Package p = pendingDeliveries.poll(); 

         if (Math.random() > 0.3) {  
             deliveredList.add(p);
             System.out.println("Delivered: " + p);
         } else {
             returnedStack.push(p);
             System.out.println("Returned: " + p);
         }
     }

    
     System.out.println("\n========== DELIVERY SUMMARY ==========");

     System.out.println("\nDelivered Packages:");
     deliveredList.forEach(System.out::println);

     System.out.println("\nReturned / Cancelled Packages:");
     returnedStack.forEach(System.out::println);

     System.out.println("\nTotal Unique Packages Received: " + uniquePackageIds.size());
     System.out.println("Total Delivered: " + deliveredList.size());
     System.out.println("Total Returned: " + returnedStack.size());
 }

 private static void addPackage(Package p, Queue<Package> queue, Set<String> set) {
     if (set.add(p.packageId)) {
         queue.add(p);
         System.out.println("Added: " + p);
     } else {
         System.out.println("Duplicate Package Ignored: " + p.packageId);
     }
 }
}

