abstract class RescueRobot {
    String robotId;

    RescueRobot(String robotId) {
        this.robotId = robotId;
    }

    void powerOn() {
        System.out.println(robotId + " powered on");
    }

    abstract void performMission();
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class AmphibiousDrone extends RescueRobot implements Flyable, Swimmable {
    AmphibiousDrone(String robotId) {
        super(robotId);
    }

    @Override
    void performMission() {
        System.out.println("Executing search and rescue operation");
    }

    @Override
    public void fly() {
        System.out.println("Patrolling airspace");
    }

    @Override
    public void swim() {
        System.out.println("Navigating water surface");
    }
}

public class RescueRobotDemo {
    public static void main(String[] args) {
        AmphibiousDrone drone = new AmphibiousDrone("Rescue-X1");
        drone.powerOn();
        drone.fly();
        drone.swim();
        drone.performMission();
    }
}