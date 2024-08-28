package WEEK_3.INLAB;

class MediumGameFactory implements GameFactory {
    public Weapon createWeapon() {
        return new MediumWeapon();
    }

    public PowerUp createPowerUp() {
        return new MediumPowerUp();
    }
}