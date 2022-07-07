/*
내부 클래스의 종류
* 인스턴스 클래스 : 클래스 안에 선언한 클래스
* 정적 클래스 : 내부 클래스에 static 키워드 붙어 바깥 클래스가 만들어지지 않아도 사용할 수 있는 클래스
* 지역 클래스 : 메소드 안에 있는 클래스
* 익명 클래스 : 이름을 가지지 않는 일회용 클래스, 선언과 동시에 객체 생성한다
*/


class Outer{
    public void print(){
        System.out.println("Outer.print");
    }

    class Inner{
        public void innerPrint(){
            Outer.this.print();
        }
    }

    static class InnerStaticClass{
        void innerPrint(){

        }
    }
}


abstract class Person5{
    public abstract void printInfo();
}

class Student7 extends Person{
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}

public class InnerClass {
    public static void main(String[] args){
        // 1. 외부 클래스
        Outer o1 = new Outer();


        // 2. 내부 클래스- 인스턴스
        Outer.Inner i1 = new Outer().new Inner();


        // 3. 내부 클래스 - 정적
        Outer.InnerStaticClass is1 = new Outer.InnerStaticClass();


        // 4. 익명 클래스
        Person5 p1 = new Person5() {
            @Override
            public void printInfo() {
                System.out.println("Main.printInfo");
            }
        };

    }
}

