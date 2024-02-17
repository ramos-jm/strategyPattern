package SoftEng2.strategyPattern;

public class Character {
    private CharacterRole role;

    public Character(CharacterRole role) {
        this.role = role;
    }

    public void attack(){
        role.characterAtk();
    }

    public void defend(){
        role.characterDef();
    }
}
