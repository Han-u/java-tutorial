// 추상 클래스 Person
abstract class Person3{
    abstract void printInfo();
}


// 추상 클래스 상속
class Student4 extends Person3{
    public void printInfo(){
        System.out.println("Student4.printInfo");
    }
}


public class Abstract {
    public static void main(String[] args){
        // Person3 p1 = new Person3(); // 추상클래스 바로 객체로 만드는 것은 불가능
        Student4 s1 = new Student4();
        s1.printInfo();

        Person3 p2 = new Person3() {
            @Override
            void printInfo() {
                System.out.println("Main.printInfo"); // 익명 클래스
            }
        };

        p2.printInfo();
    }
}
