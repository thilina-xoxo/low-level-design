package design.TrafficSignalControlSystem;

public abstract class State {
    TrafficSignalSystem trafficSignalSystem;

    public State(TrafficSignalSystem trafficSignalSystem) {
        this.trafficSignalSystem = trafficSignalSystem;
    }

    public abstract String onStop();
    public abstract String onReady();
    public abstract String onGo();
}
