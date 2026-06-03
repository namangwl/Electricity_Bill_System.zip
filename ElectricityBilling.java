import java.util.Scanner;

public class ElectricityBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("⚡ Welcome to Smart Electricity Billing System ⚡");
        System.out.print("Please enter the electricity units consumed: ");
        
        // Input validation check
        if (sc.hasNextInt()) {
            int units = sc.nextInt();
            double billAmount = 0.0;
            
            // Core Logic for Slab-Rates
            if (units < 0) {
                System.out.println("Error: Units cannot be negative.");
            } else {
                if (units <= 100) {
                    billAmount = units * 5.0; // ₹5 per unit for first 100
                } else if (units <= 200) {
                    billAmount = (100 * 5.0) + ((units - 100) * 7.0); // ₹7 for next 100
                } else {
                    billAmount = (100 * 5.0) + (100 * 7.0) + ((units - 200) * 10.0); // ₹10 for above 200
                }
                
                // Output Formatting
                System.out.println("\n----------------------------------");
                System.out.println("📊 BILL SUMMARY");
                System.out.println("Total Units Consumed : " + units + " Units");
                System.out.println("Total Bill Amount    : ₹" + billAmount);
                System.out.println("----------------------------------");
            }
        } else {
            // Agar user ne unit ki jagah text daal diya
            System.out.println("Invalid input! Please enter a valid number for units.");
        }
        
        sc.close();
    }
}
