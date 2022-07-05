class Car5{
    Car5(){}
    public void horn(){
        System.out.println("빵빵");
    }
}

class FireTruck extends Car5{
    public void horn(){
        super.horn();
        System.out.println("위이잉");
    }
}

class Ambulance extends Car5{
    public void horn(){
        super.horn();
        System.out.println("삐뽀삐뽀");
    }
}

public class InheritancePractice2 {
    public static void main(String[] args){
        FireTruck truck = new FireTruck();
        truck.horn();

        Ambulance amb = new Ambulance();
        amb.horn();
    }
}
