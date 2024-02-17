package SoftEng2.strategyPattern;

public class CastSpell implements AttackStrategy{
    @Override
    public String attack() {
        String output = new String();
        output+= "casts a spell!";
        return output;
    }
}
