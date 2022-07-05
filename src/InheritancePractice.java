//Cat에서 super 또는 super() 사용하여
// 고양이 입니다가 출력될 수 있도록
class Animal2{
    String desc;

    public Animal2(String desc) {
        this.desc = desc;
    }

    public void printInfo(){
        System.out.println(this.desc);
    }
}


class Cat extends Animal2{
    String desc;
    Cat(){
//        this.desc = "고양이 입니다";
//        super.desc = "고양이 입니다";
        super("고양이 입니다");
    }
}

public class InheritancePractice {
    public static void main(String[] args){
        //Test code
        Cat cat = new Cat();
        cat.printInfo();
    }
}
