class Person2{
    public void print(){
        System.out.println("Person2.print");
    }
}

class Student3 extends Person2{
    public void print(){
        System.out.println("Student2.print");
    }
    public void print2(){
        System.out.println("Student2.print2");
    }
}

class CollegeStudent extends Person2{
    public void print(){
        System.out.println("CollegeStudent.print");
    }
}


public class Polymorphism {
    public static void main(String[] args){
        // 1. 다형성
        Person2 p1 = new Person2();
        Student3 s1 = new Student3();

        Person2 p2 = new Student3();
        //Student3 s2 = new Person2();
        Person2 p3 = new CollegeStudent();

        p1.print();
        s1.print();
        s1.print2();
        p2.print();
        p3.print();



        // 2. 타입 변환
        Person2 pp1 = null;
        Student3 ss1 = null;

        Person2 pp2 = new Person2();
        Student3 ss2 = new Student3();
        Person2 pp3 = new Student3(); // 다형성, 업캐스팅 자식클래스의 객체가 부모클래스로 형변환 하는 것

        CollegeStudent cc1;
        CollegeStudent cc2 = new CollegeStudent();

        pp1 = pp2; // Person = Person
        pp1 = ss2; // Person = Student
        ss1 = ss2; // Student = Student
        // ss1 = pp2; // Student = Person X
        ss1 = (Student3) pp3; // Student = (Student) Person 다운캐스팅
        // ss1 = (Student3) cc2; Student = (Student)CollegeStudent X
        // cc1 = (CollegeStudent) ss2; CollegeStudent = Student X


        // 3. instanceof
        Person2 pe1 = new Person2();
        Student3 st1 = new Student3();
        Person2 pe2 = new Student3();
        Person2 pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person2); //true
        System.out.println(pe1 instanceof Student3); //false

        System.out.println(st1 instanceof  Student3); //true
        System.out.println(st1 instanceof  Person2); //true

        System.out.println(pe2 instanceof Person2);  //true
        System.out.println(pe2 instanceof Student3); //true

        System.out.println(pe3 instanceof Person2); //true
        System.out.println(pe3 instanceof CollegeStudent);  //true

        if(pe1 instanceof Student3){
            Student3 stu1 = (Student3) pe1;
        }
        if(st1 instanceof Person2){
            Person2 per1 = (Person2) st1;
        }
    }
}
