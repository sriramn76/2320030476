package POSTLAB;

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
