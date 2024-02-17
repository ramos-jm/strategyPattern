package SoftEng2.strategyPattern;

public class Knight implements CharacterRole{

    SwingSword swingSword = new SwingSword();
    Shield shield = new Shield();
    Dodge dodge = new Dodge();
    CreateMagicBarrier createMagicBarrier = new CreateMagicBarrier();
    private String character = "Knight";
    @Override
    public void characterAtk() {
        String output = new String();
        output += character + " " + swingSword.attack();
        System.out.println(output);
    }

    @Override
    public void characterDef() {
        String output = new String();
        output += character + " " + shield.defend() + "\n";
        output += character + " " + dodge.defend() + "\n";
        output += character + " " + createMagicBarrier.defend();
        System.out.println(output);
    }
}
