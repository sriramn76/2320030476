package Random;

interface Enemy {
    void attack();
}

class EasyEnemy implements Enemy {
    public void attack() {
        System.out.println("Easy Enemy attacks!");
    }
}

class MediumEnemy implements Enemy {
    public void attack() {
        System.out.println("Medium Enemy attacks!");
    }
}

class HardEnemy implements Enemy {
    public void attack() {
        System.out.println("Hard Enemy attacks!");
    }
}

class EnemyFactory {
    public static Enemy createEnemy(String difficulty) {
        switch (difficulty) {
            case "Easy":
                return new EasyEnemy();
            case "Medium":
                return new MediumEnemy();
            case "Hard":
                return new HardEnemy();
            default:
                throw new IllegalArgumentException("Unknown difficulty: " + difficulty);
        }
    }
}

interface Weapon {
    void use();
}

interface PowerUp {
    void apply();
}

interface GameFactory {
    Weapon createWeapon();
    PowerUp createPowerUp();
}

class EasyWeapon implements Weapon {
    public void use() {
        System.out.println("Using Easy Weapon!");
    }
}

class MediumWeapon implements Weapon {
    public void use() {
        System.out.println("Using Medium Weapon!");
    }
}

class HardWeapon implements Weapon {
    public void use() {
        System.out.println("Using Hard Weapon!");
    }
}

class EasyPowerUp implements PowerUp {
    public void apply() {
        System.out.println("Applying Easy Power-Up!");
    }
}

class MediumPowerUp implements PowerUp {
    public void apply() {
        System.out.println("Applying Medium Power-Up!");
    }
}

class HardPowerUp implements PowerUp {
    public void apply() {
        System.out.println("Applying Hard Power-Up!");
    }
}

class EasyGameFactory implements GameFactory {
    public Weapon createWeapon() {
        return new EasyWeapon();
    }

    public PowerUp createPowerUp() {
        return new EasyPowerUp();
    }
}

class MediumGameFactory implements GameFactory {
    public Weapon createWeapon() {
        return new MediumWeapon();
    }

    public PowerUp createPowerUp() {
        return new MediumPowerUp();
    }
}

class HardGameFactory implements GameFactory {
    public Weapon createWeapon() {
        return new HardWeapon();
    }

    public PowerUp createPowerUp() {
        return new HardPowerUp();
    }
}

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
