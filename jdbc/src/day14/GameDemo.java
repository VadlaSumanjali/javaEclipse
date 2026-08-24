package day14;
abstract class Character {

    private String name;
    private int health;
    private int power;

    Character(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public void reduceHealth(int damage) {

        health -= damage;

        if (health < 0) {
            health = 0;
        }
    }

    abstract void attack();

    abstract void defend();
}

class Warrior extends Character {

    Warrior(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    void attack() {
        System.out.println(getName() + " attacks with Sword");
    }

    @Override
    void defend() {
        System.out.println(getName() + " defends with Shield");
    }
}

class Mage extends Character {

    Mage(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    void attack() {
        System.out.println(getName() + " attacks with Magic");
    }

    @Override
    void defend() {
        System.out.println(getName() + " defends with Magic Barrier");
    }
}

class Archer extends Character {

    Archer(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    void attack() {
        System.out.println(getName() + " attacks with Bow");
    }

    @Override
    void defend() {
        System.out.println(getName() + " defends by Dodging");
    }
}

public class GameDemo {

    public static void main(String[] args) {

        Character c1 =
            new Warrior("Warrior", 100, 30);

        Character c2 =
            new Mage("Mage", 80, 40);

        Character c3 =
            new Archer("Archer", 90, 25);

        c1.attack();
        c1.defend();

        c2.attack();
        c2.defend();

        c3.attack();
        c3.defend();

        c1.reduceHealth(40);

        System.out.println("Warrior Health: " + c1.getHealth());

        c1.reduceHealth(100);

        System.out.println("Warrior Health: " + c1.getHealth());
    }
}
