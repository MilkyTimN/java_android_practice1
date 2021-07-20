package hw8;

public class Person implements Actionable{
    private String name;
    private Integer distance;
    private Double maxJumpMeters;

    public Person(String name, Integer distance, Double maxJumpMeters) {
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
        System.out.println("Person runs");
    }

    @Override
    public void jump() {
        System.out.println("Person jumps");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
