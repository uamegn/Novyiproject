public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenceType("armor");

        System.out.println("boss information");
        System.out.println("health: " + boss.getHealth());
        System.out.println("damage: " + boss.getDamage());
        System.out.println("defence type: " + boss.getDefenceType());



        Hero[] heroesArray = createHeroes();
        System.out.println("heroes information: ");
        for (Hero hero : heroesArray){
            System.out.println("health: " + hero.getHealth());
            System.out.println("damage:" + hero.getDamage());
            System.out.println("superpower: " + hero.getSuperPower());
        }
    }

    public static Hero[] createHeroes(){
        Hero hero1 = new Hero(150, 20, "fight");
        Hero hero2 = new Hero(120, 25);
        Hero hero3 = new Hero(180, 18, "invisibility");
        return  new Hero[]{hero1, hero2, hero3};
    }
}