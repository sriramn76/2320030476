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
