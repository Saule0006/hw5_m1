//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(1000);
        boss.setDafance("armor");

        System.out.println("Boss health: " + boss.getHealth() + " damage: " + boss.getDamage() + " dafance: " + boss.getDafance());
        Hero[] heroes = createHeroes();
        for (Hero hero: heroes){
            System.out.println("Hero health: " + hero.getHealth() + " damage: " + hero.getDamage() + " superAbility " + hero.getSuperAbility());
        }
    }

    public  static  Hero[] createHeroes(){
        Hero hero1 = new Hero(100,12);
        Hero hero2 = new Hero(123, 45,"magic");
        Hero hero3 = new Hero(100,12);
        Hero[]  heroes = {hero1,hero2,hero3};
        return heroes;
    }
}