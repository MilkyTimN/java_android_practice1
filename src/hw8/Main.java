package hw8;

public class Main {
    public static void main(String[] args) {
        Actionable cat = new Cat("Murzik", 1000, 3.3);
        Actionable person = new Person("Adam", 742, 2.1);
        Actionable robot = new Robot("AR2110", 500, 1.0);
        Wall wall = new Wall(2.0);
        Racetrack racetrack = new Racetrack(300);

        wall.jumpOver(cat);

        Actionable[] actionables = {cat,person,robot};
        Obsatcleable[] obsatcleables = {wall, racetrack};

        for (Actionable a: actionables) {
            wall.jumpOver(a);
            racetrack.runOnTrack(a);
        }


    }
}
