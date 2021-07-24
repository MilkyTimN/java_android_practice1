package hw8;

public class Cat implements Actionable{
    private String name;
    private Integer distance;
    private Double maxJumpMeters;

    public Cat(String name, Integer distance, Double maxJumpMeters) {
        this.name = name;
        this.distance = distance;
        this.maxJumpMeters = maxJumpMeters;
    }

    public String getName() {
        return name;
    }

    public Integer getDistance() {
        return distance;
    }

    public Double getMaxJumpMeters() {
        return maxJumpMeters;
    }

    @Override
    public void run() {
        System.out.println("Cat runs");
    }

    @Override
    public void jump() {
        System.out.println("Cat jumps");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
