class Person{
    String name;
    int age;
    public int a1;
    private int a2;

    Person(){}
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}


// Student 클래스- Person 상속, 접근제어자 확인
class Student extends Person{
    Student(){
        a1 = 1;
         // a2 = 1;
    }
}


// Student2 클래스 - Person 상속, super 사용, 오버라이딩
class Student2 extends Person{
    String name;
    int stdId;

    public Student2(String name, int age, int stdId) {
//        this.name = name;
//        super.name = name;
        super(name, age);
        this.age = age;
        this.stdId = stdId;
    }

    public void printInfo(){
        System.out.println("Student2.printInfo");
        System.out.println("name = " + name); // 자기 객체에 할당된 값이 없어 null로 나옴
        System.out.println("stdId = " + stdId);
        System.out.println("age = " + age);
    }
}

public class Inheritance {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name="a";
        s1.age=26;
        s1.printInfo();

        Student2 s2 = new Student2("b", 32, 1);
        s2.printInfo();
    }
}
