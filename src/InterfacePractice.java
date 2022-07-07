abstract class GreenOrc{
    public final String SKIN_COLOR = "녹색";
    public int health;
    public int attackDamage;
    public int defense;

    public abstract void setHealth();
    public abstract void setDamage();
    public abstract void setDefense();
}

interface NPCSystem{
    public abstract void conversationSystem();
    public abstract void questionSystem();
}

interface UserSystem{
    public abstract void partySystem();
    public abstract void tradeSystem();
}


// OrkNPC1 클래스
class OrkNPC1 extends GreenOrc implements NPCSystem{
    @Override
    public void setHealth() {
        this.health = 100;
    }

    @Override
    public void setDamage() {
        this.attackDamage = 10;
    }

    @Override
    public void setDefense() {
        this.defense = 5;
    }

    @Override
    public void conversationSystem() {
        System.out.println("ㅎㅇㅎㅇ");
    }

    @Override
    public void questionSystem() {
        System.out.println("새로운 퀘스트 완료");
    }
}

// OrkUser1 클래스
class OrkUser1 extends GreenOrc implements UserSystem{
    @Override
    public void setHealth() {
        this.health = 200;
    }

    @Override
    public void setDamage() {
        this.attackDamage = 20;
    }

    @Override
    public void setDefense() {
        this.defense = 10;
    }

    @Override
    public void partySystem() {
        System.out.println("ㅂㅇㅂㅇ");
    }

    @Override
    public void tradeSystem() {
        System.out.println("어쩌구");
    }
}


public class InterfacePractice {
    public static void main(String[] args){
        // no Test code
    }
}
