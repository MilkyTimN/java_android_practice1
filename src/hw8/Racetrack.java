package hw8;

public class Racetrack implements RunOnTrack{
    private Integer distance;

    public Racetrack(Integer distance) {
        this.distance = distance;
    }

    @Override
    public void runOnTrack(Actionable actionable) {
        System.out.println(actionable + " run");
    }
}
