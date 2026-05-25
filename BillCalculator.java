import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int continueChoice = 1;

        System.out.println("=== SMART ELECTRICITY BILL CALCULATOR ===");

        // Loop: Tab tak chalega jab tak user 1 press karega
        while (continueChoice == 1) {
            System.out.print("\nEnter Units Consumed: ");
            int units = sc.nextInt();
            double totalBill = 0;

            // Conditional Statements (If-Else) for slab logic
            if (units < 0) {
                System.out.println("Invalid input! Units cannot be negative.");
            } else {
                if (units <= 100) {
                    totalBill = units * 5.0; // Rs 5 per unit
                } 
                else if (units <= 200) {
                    // First 100 units at Rs 5, rest at Rs 7
                    totalBill = (100 * 5.0) + ((units - 100) * 7.0);
                } 
                else {
                    // First 100 at Rs 5, Next 100 at Rs 7, Rest at Rs 10
                    totalBill = (100 * 5.0) + (100 * 7.0) + ((units - 200) * 10.0);
                }
                
                System.out.println("---------------------------------");
                System.out.println("Total Bill Amount: Rs. " + totalBill);
                System.out.println("---------------------------------");
            }

            System.out.print("Do you want to calculate for another customer? (1 for Yes, 0 for No): ");
            continueChoice = sc.nextInt();
        }

        System.out.println("Thank you for using the Smart Billing System!");
        sc.close();
    }
}
