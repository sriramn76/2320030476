package Week_1;

class LoginState {
    private static LoginState instance;
    private boolean loggedIn;

    private LoginState() {
        loggedIn = false;
    }

    public static LoginState getInstance() {
        if (instance == null) {
            instance = new LoginState();
        }
        return instance;
    }
    
    public void login() {
        loggedIn = true;
        System.out.println("User logged in.");
    }
    public void logout() {
        loggedIn = false;
        System.out.println("User logged out.");
    }
    public boolean isLoggedIn() {
        return loggedIn;
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void viewBalance() {
        LoginState loginState = LoginState.getInstance();
        if (loginState.isLoggedIn()) {
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    public void deposit(double amount) {
        LoginState loginState = LoginState.getInstance();
        if (loginState.isLoggedIn()) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            viewBalance();
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    public void withdraw(double amount) {
        LoginState loginState = LoginState.getInstance();
        if (loginState.isLoggedIn()) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
                viewBalance();
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}

public class PostLab_1 {
	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        LoginState loginState = LoginState.getInstance();
        BankAccount account = new BankAccount(1000.00); 

        while (true) {
            System.out.println("\n1. Login\n2. Logout\n3. View Balance\n4. Deposit\n5. Withdraw\n6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    loginState.login();
                    break;
                case 2:
                    loginState.logout();
                    break;
                case 3:
                    account.viewBalance();
                    break;
                case 4:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 5:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 6:
                    scanner.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}