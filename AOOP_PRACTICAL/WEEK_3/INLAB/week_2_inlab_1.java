package INLAB;

public class week_2_inlab_1 {
	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        GameState gameState = GameState.getInstance();

        while (true) {
            System.out.println("\n1. Set Level\n2. Set Difficulty\n3. Create Enemy\n4. Create Weapon and Power-Up\n5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter level: ");
                    int level = scanner.nextInt();
                    gameState.setLevel(level);
                    System.out.println("Level set to " + level);
                    break;
                case 2:
                    System.out.print("Enter difficulty (Easy, Medium, Hard): ");
                    String difficulty = scanner.nextLine();
                    gameState.setDifficulty(difficulty);
                    System.out.println("Difficulty set to " + difficulty);
                    break;
                case 3:
                    Enemy enemy = EnemyFactory.createEnemy(gameState.getDifficulty());
                    enemy.attack();
                    break;
                case 4:
                    GameFactory factory;
                    switch (gameState.getDifficulty()) {
                        case "Easy":
                            factory = new EasyGameFactory();
                            break;
                        case "Medium":
                            factory = new MediumGameFactory();
                            break;
                        case "Hard":
                            factory = new HardGameFactory();
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown difficulty: " + gameState.getDifficulty());
                    }
                    Weapon weapon = factory.createWeapon();
                    PowerUp powerUp = factory.createPowerUp();
                    weapon.use();
                    powerUp.apply();
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
	}
}