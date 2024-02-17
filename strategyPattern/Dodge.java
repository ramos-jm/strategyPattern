package SoftEng2.strategyPattern;

public class Dodge implements DefenseStrategy{
    @Override
    public String defend() {
        String output = new String();
        output+= "Dodgin' to avoid attack!";
        return output;
    }
}
