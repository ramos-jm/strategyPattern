package SoftEng2.strategyPattern;

public class SwingSword implements AttackStrategy{
    @Override
    public String attack() {
        String output = new String();
        output+= "attacks with a sword!";
        return output;
    }
}
