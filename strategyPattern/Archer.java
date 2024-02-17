package SoftEng2.strategyPattern;

public class Archer implements CharacterRole{

    ShootArrow shootArrow = new ShootArrow();
    Shield shield = new Shield();
    private  String character = "Archer";

    @Override
    public void characterAtk() {
        String output = new String();
        output += character + " " + shootArrow.attack();
        System.out.println(output);
    }

    @Override
    public void characterDef() {
        String output = new String();
        output += character + " " + shield.defend();
        System.out.println(output);
    }
}
