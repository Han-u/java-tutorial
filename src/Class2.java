import car.Car5;

class Car3{
    String name;
    String type;

    public Car3(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo(){
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public void printCarInfo(String date){
        this.printCarInfo();
        System.out.println("date : " + date);
    }

    public void printCarInfo(int number){
        this.printCarInfo();
        System.out.println("number = " + number);
    }

    public void printCarInfo(String data, int number){
        this.printCarInfo();
        System.out.println("data = " + data);
        System.out.println("number = " + number);
    }

}

class Car4{
    static String name = "None";
    String type;

    public Car4(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInto(){
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public static void getName() { // 안에서 사용하는 변수도 다 static이여야함
        System.out.println("name = " + name);
    }
}



public class Class2 {
    public static void main(String[] args){
        Car3 myCar3 = new Car3("a", "sedan");
        myCar3.printCarInfo();
        Car4 myCar4 = new Car4("a", "sedan");

        // 1. 오버로딩 사용
        myCar3.printCarInfo(2022);
        myCar3.printCarInfo("2022");
        myCar3.printCarInfo("2022", 2022);


        // 2. 접근 제어자
        Car5 myCar5 = new Car5("1", "2", "3", "4");
        System.out.println(myCar5.name1);
//        System.out.println(myCar5.name2);
//        System.out.println(myCar5.name3);
//        System.out.println(myCar5.name4); //해당 패키지에서 접근 불가


        // 3. Static
        Car4.getName();
        Car4 myCar4_1 = new Car4("a", "sedan");
        Car4 myCar4_2 = new Car4("b", "suv");
        Car4 myCar4_3 = new Car4("c", "rv");
        myCar4_1.printCarInto();  //name: c 스태틱이기 때문에 객체끼리 데이터를 공유함
        myCar4_2.printCarInto();  //name: c
        myCar4_3.printCarInto();  //name: c
    }
}
