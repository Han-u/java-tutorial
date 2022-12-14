// Car 클래스 - 객체변수, 메소드
class Car{
    String name;
    String type;

    // Car() {}

    public void printCarInto(){
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public void move(){
        System.out.println("이동");
    }

    public void brake(){
        System.out.println("정지");
    }
}


// Car2 클래스 - 생성자, this
class Car2{
    String name;
    String type;

    Car2(String name, String type) {
        this.name = name;
        this.type = type;
        System.out.println("생성자 출력");
    }

    public void printCarInto(){
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public void load(){
        System.out.println("짐을 주세요!");
    }

    public void horn(){
        System.out.println("빵빵!");
    }
}


public class Class {
    public static void main(String[] args){
        // Car 클래스 사용
        Car myCar1 = new Car();
        myCar1.name = "a";
        myCar1.type = "suv";
        myCar1.printCarInto();
        myCar1.move();
        myCar1.brake();


        // Car2 클래스 사용
        Car2 myCar2 = new Car2("b", "sedan");
        myCar2.printCarInto();
        myCar2.load();
        myCar2.horn();
    }
}
