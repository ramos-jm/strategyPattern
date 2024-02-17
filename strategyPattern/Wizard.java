package SoftEng2.strategyPattern;

public class Wizard implements CharacterRole{

    CastSpell castSpell = new CastSpell();
    CreateMagicBarrier createMagicBarrier = new CreateMagicBarrier();
    private String character = "Wizard";
    @Override
    public void characterAtk() {
        String output = new String();
        output += character + " " + castSpell.attack();
        System.out.println(output);
    }

    @Override
    public void characterDef() {
        String output = new String();
        output += character + " " + createMagicBarrier.defend();
        System.out.println(output);
    }
}
