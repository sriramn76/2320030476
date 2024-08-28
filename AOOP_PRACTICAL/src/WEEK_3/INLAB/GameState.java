package WEEK_3.INLAB;

	class GameState {
	    private static GameState instance;
	    private int level;
	    private String difficulty;

	    // Private constructor to prevent instantiation
	    private GameState() {
	        level = 1;
	        difficulty = "Easy";
	    }

	    // Public method to provide access to the single instance
	    public static GameState getInstance() {
	        if (instance == null) {
	            instance = new GameState();
	        }
	        return instance;
	    }

	    // Method to get the current level
	    public int getLevel() {
	        return level;
	    }

	    // Method to set the level
	    public void setLevel(int level) {
	        this.level = level;
	    }

	    // Method to get the difficulty
	    public String getDifficulty() {
	        return difficulty;
	    }

	    // Method to set the difficulty
	    public void setDifficulty(String difficulty) {
	        this.difficulty = difficulty;
	    }
	}