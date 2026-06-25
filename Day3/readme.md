1.import java.util.Scanner;

public class BonusChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input section
        System.out.print("Enter years of experience: ");
        double years = scanner.nextDouble();

        System.out.print("Enter attendance percentage: ");
        double attendance = scanner.nextDouble();

        System.out.print("Enter performance rating (1-5): ");
        int rating = scanner.nextInt();

        // Evaluation logic
        if (attendance < 60) {
            System.out.println("Not Eligible");
            System.out.println("Bonus Amount: ₹0 (Reason: Attendance below 60%)");
        } else if (years > 3 && attendance > 85) {
            int bonus = 0;

            switch (rating) {
                case 5:
                    bonus = 50000;
                    break;
                case 4:
                    bonus = 30000;
                    break;
                case 3:
                    bonus = 10000;
                    break;
                default:
                    bonus = 0;
                    break;
            }

            if (bonus > 0) {
                System.out.println("Eligible");
                System.out.println("Bonus Amount: ₹" + bonus);
            } else {
                System.out.println("Not Eligible");
                System.out.println("Bonus Amount: ₹0 (Reason: Performance rating too low)");
            }
        } else {
            System.out.println("Not Eligible");
            System.out.println("Bonus Amount: ₹0 (Reason: Did not meet experience or attendance criteria)");
        }

        scanner.close();
    }
}

2.import java.util.Scanner;

public class SmartLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String correctUsername = "admin";
        String correctPassword = "Java@123";
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter Username: ");
            String username = scanner.next();

            System.out.print("Enter Password: ");
            String password = scanner.next();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                // Username and password correct, check OTP
                System.out.print("Enter 4-digit OTP: ");
                int otp = scanner.nextInt();

                if (otp >= 1000 && otp <= 9999) {
                    System.out.println("Login Successful!");
                } else {
                    System.out.println("Invalid OTP. Login Failed.");
                }
                break; // Break the while loop since credentials were correct
            } else {
                attempts++;
                System.out.println("Incorrect credentials.");

                // Extra twist hint checking
                if (username.equals(correctUsername) && password.startsWith("Java") && password.endsWith("123")) {
                    System.out.println("Almost correct password");
                }

                if (attempts == 3) {
                    System.out.println("Account Blocked");
                }
            }
        }

        scanner.close();
    }
}
3.print("--- Electricity Bill Generator ---")
print("1. Domestic")
print("2. Commercial")
print("3. Industrial")
choice = input("Select connection type (1-3 or name): ").strip().lower()

if choice in ['1', 'domestic', '2', 'commercial', '3', 'industrial']:
    units = float(input("Enter units consumed: "))
    bill = 0.0

    if choice == '1' or choice == 'domestic':
        if units <= 100:
            bill = 0
        elif units <= 300:
            bill = (units - 100) * 5
        else:
            bill = (200 * 5) + ((units - 300) * 8)
            
    elif choice == '2' or choice == 'commercial':
        if units < 200:
            bill = units * 10
        else:
            bill = units * 15
            
    elif choice == '3' or choice == 'industrial':
        pf_input = input("Is power factor good? (yes/no): ").strip().lower()
        base_charge = units * 20
        if units > 500 and pf_input == 'yes':
            bill = base_charge * 0.90 # 10% discount applied
        else:
            bill = base_charge

    print(f"Total Electricity Bill: ₹{bill:.2f}")
else:
    print("Invalid Connection Type")
