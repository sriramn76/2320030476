package INLAB;

class HardGameFactory implements GameFactory {
    public Weapon createWeapon() {
        return new HardWeapon();
    }

    public PowerUp createPowerUp() {
        return new HardPowerUp();
    }
}