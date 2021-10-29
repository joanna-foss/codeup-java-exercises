public class Player {
    public String name;
    public boolean single;
    public int age;
    public int health;
    public int stamina;

    public Player(String name){
        this.name = name;
        this.single = true;
        this.age = 30;
        this.health = 100;
        this.stamina = 100;
    }

    public Player(String name, int age, boolean single){
        this.name = name;
        this.single = single;
        this.age = age;
    }
}
