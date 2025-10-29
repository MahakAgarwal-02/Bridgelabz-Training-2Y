package Wrapper_Class;

public class BankTransactionLimit {

	
		
		public static double getRemainingLimit(Double limit, double withdrawn) {
	        if (limit == null) {
	            return 0.0;
	        }

	        double remaining = limit - withdrawn;

	        return remaining < 0 ? 0.0 : remaining;
	    }
		public static void main(String[] args) {
	        Double limit1 = 5000.0;  
	        double withdrawn1 = 1200.0;

	        double remaining1 = getRemainingLimit(limit1, withdrawn1);
	        System.out.println("Remaining Limit (Account 1): " + remaining1);

	        Double limit2 = null;    
	        double withdrawn2 = 500.0;

	        double remaining2 = getRemainingLimit(limit2, withdrawn2);
	        System.out.println("Remaining Limit (Account 2): " + remaining2);
	}

}
