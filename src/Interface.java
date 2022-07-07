/*

인터페이스:
    다중 상속처럼 사용할 수 있는 기능
    추상 메소드와 상수만으로 이루어짐

*/


//School 인터페이스
interface School{
    public static final int MAX_CLASS = 20;
    public static final int MAX_PERSON_PER_CLASS = 40;
    public abstract void printSchool();
}


// Student 클래스 - School 인터페이스 이용
class Student5 implements School{
    public void printSchool(){
        System.out.println("00 University");
    }
}



// Person 클래스
class Person4{
    public String name;
    public void printName(){
        System.out.println("name = " + name);
    }
}


// Student2 클래스 - Person 상속, School 인터페이스 이용
class Student6 extends Person4 implements School{
    Student6(String name){
        super.name = name;
    }
    public void printSchool(){
        System.out.println("11 University");
    }
}



public class Interface {
    public static void main(String[] args){
        // 1. 인터페이스 기본 가용
        Student5 s1 = new Student5();
        s1.printSchool();
        System.out.println(s1.MAX_CLASS);
        System.out.println(s1.MAX_PERSON_PER_CLASS);


        // 2. 다중 상속처럼 사용하기
        Student6 s2 = new Student6("A");
        s2.printName();
        s2.printSchool();

    }
}
