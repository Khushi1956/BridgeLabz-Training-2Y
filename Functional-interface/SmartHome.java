interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light ON"); }
    public void turnOff() { System.out.println("Light OFF"); }
}

class AC implements SmartDevice {
    public void turnOn() { System.out.println("AC Cooling Started"); }
    public void turnOff() { System.out.println("AC Turned Off"); }
}

public class SmartHome {
    public static void main(String[] args) {
        SmartDevice tv = new Light();
        SmartDevice ac = new AC();
        tv.turnOn(); ac.turnOn();
        tv.turnOff(); ac.turnOff();
    }
}
