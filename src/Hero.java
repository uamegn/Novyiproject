public class Hero {
    private int health;
    private int damage;
    private String superPower;

    public int getHealth() {
        return health;
    }

    public Hero(int health, int damage, String superPower){
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    public Hero(int health, int damage){
        this.health = health;
        this.damage = damage;
        this.superPower = "none";
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public java.lang.String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(java.lang.String superPower) {
        this.superPower = superPower;
    }
}
