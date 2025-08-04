package homework.EqualsHashcodeGenericsEnum;
//14. Create a simulation of a traffic light system using an enum to represent the different states of a traffic light.
public class TrafficLight {
    public enum LightState {
        RED, YELLOW, GREEN
    }

    private LightState currentState;

    public TrafficLight() {
        this.currentState = LightState.RED; // Initial state
    }

    public void changeLight() {
        switch (currentState) {
            case RED:
                currentState = LightState.GREEN;
                break;
            case GREEN:
                currentState = LightState.YELLOW;
                break;
            case YELLOW:
                currentState = LightState.RED;
                break;
        }
    }

    public LightState getCurrentState() {
        return currentState;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        System.out.println("Current State: " + trafficLight.getCurrentState());

        trafficLight.changeLight();
        System.out.println("After change: " + trafficLight.getCurrentState());

        trafficLight.changeLight();
        System.out.println("After change: " + trafficLight.getCurrentState());

        trafficLight.changeLight();
        System.out.println("After change: " + trafficLight.getCurrentState());
    }
}
