package SoftEng2.strategyPattern;

public class CreateMagicBarrier implements DefenseStrategy {
    @Override
    public String defend() {
        String output = new String();
        output += "Creating a magic barrier for defense!";
        return output;
    }
}
