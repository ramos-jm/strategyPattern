# Problem scenario:

Suppose we have three types of characters in a GameApp:

1. Knight: Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)
2. Wizard: Casts spells; uses magic barrier to defend
3. Archer: Shoots arrows; uses dodge to to defend

Implement two types of Strategy:<br>
A.  DefenseStrategy<ul>
     1. Shield<br>
     2. Dodge<br>
     3. CreateMagic
</ul>
B.  AttackStrategy<br><ul>
     1.  CastSpell<br>
     2.  ShootArrow<br>
     3.  SwingSword  
     </ul>

Refactor the existing codes and provide the UML Diagram:

<pre><code>public class Character {
    private String type;

    public Character(String type) {
        this.type = type;
    }

    public void attack() {
        if (type.equals("Knight")) {
            System.out.println("Knight attacks with a sword!");
        } else if (type.equals("Wizard")) {
            System.out.println("Wizard casts a spell!");
        } else if (type.equals("Archer")) {
            System.out.println("Archer shoots an arrow!");
        }
    }

    public void defend() {
        if (type.equals("Knight")) {
            System.out.println("Using a shield to defend!");
	System.out.println("Dodgin to avoid attack!");
            System.out.println("Creating a magic barrier for defense!"");		

        } else if (type.equals("Wizard")) {
            System.out.println("Creating a magic barrier for defense!"");
        } else if (type.equals("Archer")) {
            System.out.println("Using a shield to defend!"");
        }
    }
}
</code></pre>

# Strategy Pattern Output
![image](https://github.com/ramos-jm/strategyPattern/assets/127398189/3f18e6f5-4146-4f3b-ae44-1b86782e0ce0)


# Class Diagram

![strategyPattern](https://github.com/ramos-jm/strategyPattern/assets/127398189/30587aae-5d50-4d31-bfdd-657aa52678e0)



