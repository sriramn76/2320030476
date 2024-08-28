package POSTLAB4;

public class Main {
	 public static void main(String[] args) {
	        Worker robot = new Robot();
	        Worker humanWorker = new Human();
	        Eater humanEater = (Eater) humanWorker; 

	        demonstrateWorking(robot);
	        demonstrateWorking(humanWorker);
	        demonstrateEating(humanEater);
	    }
	    public static void demonstrateWorking(Worker worker) {
	        worker.work();
	    }
	    public static void demonstrateEating(Eater eater) {
	        eater.eat();
	    }
}
