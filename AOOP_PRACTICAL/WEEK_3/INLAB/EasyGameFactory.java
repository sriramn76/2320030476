package INLAB;

class EasyGameFactory implements GameFactory {
    public Weapon createWeapon() {
        return new EasyWeapon();
    }

    public PowerUp createPowerUp() {
        return new EasyPowerUp();
    }
}