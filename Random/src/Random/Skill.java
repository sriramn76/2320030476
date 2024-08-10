package Random;

class Skill {
    public static void main(String[] args) {
        Fan s = new Fan(3, true, 5.0);

        // Call the increaseSpeed() method on the Fan instance
        s.increaseSpeed();
    }
}

class Fan {
    int speed;
    boolean on;
    double radius;

    // Constructor
    Fan(int speed, boolean on, double radius) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
    }

    // Method to increase the speed of the fan
    public void increaseSpeed() {
        if (on) {
            // Increase the speed only if the fan is on
            speed++;
            System.out.println("Speed increased. New speed: " + speed);
        } else {
            System.out.println("Fan is off. Cannot increase speed.");
        }
    }
}
