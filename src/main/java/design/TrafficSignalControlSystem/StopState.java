package design.TrafficSignalControlSystem;

public class StopState extends State{

    public StopState(TrafficSignalSystem trafficSignalSystem) {
        super(trafficSignalSystem);
    }

    @Override
    public String onStop() {
        return null;
    }

    @Override
    public String onReady() {
        return null;
    }

    @Override
    public String onGo() {
        return null;
    }
}
