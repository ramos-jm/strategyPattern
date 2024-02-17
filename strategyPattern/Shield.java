package SoftEng2.strategyPattern;

public class Shield implements DefenseStrategy{
    @Override
    public String defend() {
        String output = new String();
        output+= "Using a shield to defend!";
        return output;
    }
}
