package SoftEng2.strategyPattern;

public class GameApp {
    public static void main(String[] args){

        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());
        Character archer = new Character(new Archer());

        //Knight Attack and Defense Strategy
        System.out.println("----Knight Game Strategy----");
        System.out.println("Knight Offensive Move:");
        knight.attack();
        System.out.println();
        System.out.println("Knight Defensive Move:");
        knight.defend();
        System.out.println();

        //Wizard Attack and Defense Strategy
        System.out.println("----Wizard Game Strategy----");
        System.out.println("Wizard Offensive Move:");
        wizard.attack();
        System.out.println();
        System.out.println("Wizard Defensive Move:");
        wizard.defend();
        System.out.println();

        //Archer Attack and Defense Strategy
        System.out.println("----Archer Game Strategy----");
        System.out.println("Archer Offensive Move:");
        archer.attack();
        System.out.println();
        System.out.println("Archer Defensive Move:");
        archer.defend();
        System.out.println();

    }
}
