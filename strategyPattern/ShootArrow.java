package SoftEng2.strategyPattern;

public class ShootArrow implements AttackStrategy{
    @Override
    public String attack() {
        String output = new String();
        output+= "shoots an arrow!";
        return output;
    }
}
