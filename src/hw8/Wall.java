package hw8;

public class Wall implements JumpOver {
    private Double height;

    public Wall(Double height) {
        this.height = height;
    }

    @Override
    public void jumpOver(Actionable actionable) {
        System.out.println(actionable + " jumped");
    }
}
