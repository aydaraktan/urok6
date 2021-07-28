package  com.company;

public class Boss extends Player{

    public Boss(String name, int health, int damage) {
        super(name, health, damage);
    }

    public Boss() {
    }

    public void smile(){
        System.out.println("Улыбайся!");
    }
}