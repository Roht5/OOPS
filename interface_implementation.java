
// Interface: Device
interface Device {
    // Actions that any device must have
    void turnOn();
    void turnOff();
}
interface Movable {
    // Actions that any device must have
    void turnOn();
    void turnOff();
}

// Phone class follows the Device interface
class Phone implements Device,Movable {
    // Implementation of turnOn for Phone
    public void turnOn() {
        System.out.println("Phone turns on");
    }
    

    // Implementation of turnOff for Phone
    public void turnOff() {
        System.out.println("Phone turns off");
    }
}

// TV class follows the Device interface
class TV implements Device {
    // Implementation of turnOn for TV
    public void turnOn() {
        System.out.println("TV turns on");
    }

    // Implementation of turnOff for TV
    public void turnOff() {
        System.out.println("TV turns off");
    }
}

public class interface_implementation {
    public static void main(String[] args) {
        // Create objects of Phone and TV
        Phone myPhone = new Phone();
        TV myTV = new TV();

        // Use methods defined in the interface
        myPhone.turnOn(); // Phone turns on
        myPhone.turnOff(); // Phone turns off

        myTV.turnOn(); // TV turns on
        myTV.turnOff(); // TV turns off
    }
}
