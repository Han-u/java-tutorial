abstract class Device{
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}


// UsbPort1 클래스
class UsbPort1 extends Device{
    UsbPort1(int id){
        this.deviceId = id;
    }

    public void deviceInfo(){
        System.out.println("deviceId = " + deviceId);
    };
    public void connect(){
        System.out.println("연결");
    };
    public void disconnect(){
        System.out.println("연결 해제");
    };
    public void send(){
        System.out.println("데이터 전송");
    };
    public void receive(){
        System.out.println("데이터 수신");
    };
}

// Wifi 클래스
class Wifi extends Device{
    Wifi(int id){
        this.deviceId = id;
    }

    @Override
    void deviceInfo() {

    }

    @Override
    void connect() {

    }

    @Override
    void disconnect() {

    }

    @Override
    void send() {

    }

    @Override
    void receive() {

    }
}


public class AbstractPractice {
    public static void main(String[] args){
        UsbPort1 usb1 = new UsbPort1(1);
        Wifi wifi = new Wifi(2);
    }
}
