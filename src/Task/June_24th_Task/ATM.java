package Task.June_24th_Task;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

       /* Initialize the account balance with a fixed amount (e.g., ₹10,000).
        2️⃣ Take user input for the amount they want to withdraw.
        3️⃣ Check withdrawal conditions:
         The amount should be greater than zero.
          The amount should be a multiple of 100 (common ATM rule).
         The amount should not exceed the account balance.
        4️⃣ Deduct the amount from the balance if conditions are met.
        5️⃣ Display the updated balance or an error message if the withdrawal fails.
*/

        int balance=10000;
        System.out.println("Enter the amount to withdrwal");
        Scanner scanner= new Scanner(System.in);
        int amount = scanner.nextInt();


        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } else if (amount % 100 != 0) {
            System.out.println("Amount must be a multiple of 100.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. You have only " + balance);
        } else {
            balance = balance-amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Updated Balance:"  + balance);
        }
    }

}
