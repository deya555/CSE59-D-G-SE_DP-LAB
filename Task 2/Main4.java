class Sensor {
    String name;
    int batteryLevel;
    void charger (){
        batteryLevel = 100;
        System.out.println("Sensor fully Charged");
    }
}
class Main {
    public static void main(String[] args) {
        Sensor s = new Sensor ();
        s.name = "TempSensor-01";
        s.charger();
        System.out.println("Battery level: +s.batteryLevel");
    }
}
