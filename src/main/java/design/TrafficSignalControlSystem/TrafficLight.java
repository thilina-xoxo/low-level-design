package design.TrafficSignalControlSystem;

public class TrafficLight {
    private String id;
    private LightState state;

    public TrafficLight(String id, LightState state) {
        this.id = id;
        this.state = state;
    }

    public void setState(LightState state) {
        this.state = state;
    }

    enum LightState {
        RED, GREEN, YELLOW
    }

}
