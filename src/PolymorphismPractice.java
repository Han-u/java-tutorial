class Car6{
    Car6(){}
    public void horn(){
        System.out.println("빵빵!");
    }
}

class FireTruck6 extends Car6{
    public void horn(){
        System.out.println("위이잉!");
    }
}

class Ambulance6 extends Car6{
    public void horn(){
        System.out.println("삐뽀삐뽀!");
    }
}


public class PolymorphismPractice {
    public static void main(String[] args){
        Car6 car = new Car6();
        car.horn();

        car = new FireTruck6();
        car.horn();

        car = new Ambulance6();
        car.horn();

        Car6[] car2 = {new Car6(), new FireTruck6(), new Ambulance6()};

        for(Car6 item: car2){
            item.horn();
        }
    }
}
