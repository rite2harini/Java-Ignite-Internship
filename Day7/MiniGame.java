/*
ADVANCED 2 – Mini Game Character System

Create a class GameCharacter:

Attributes:
name
health (PRIVATE)
attackPower (PRIVATE)
Requirements:
Constructor using this
Proper encapsulation
Methods:
attack(GameCharacter enemy)
heal()
showStats()
Rules:
attack reduces enemy health
heal increases own health
health should never be accessed directly
Twist:

Each attack should show:
*/
X attacked Y and reduced health by Z
public class GameCharacter {
    private String name;
    private int health;
    private int attackPower;

    public GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void attack(GameCharacter enemy) {
        enemy.setHealth(enemy.getHealth() - this.attackPower);
        System.out.println(this.name + " attacked " + enemy.getName() + " and reduced health by " + this.attackPower);
    }

    public void heal() {
        this.health += 2
