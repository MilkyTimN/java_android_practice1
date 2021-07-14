package hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int amount){
        food += amount;
        System.out.printf("Added %d food, now on the plate %d food \n", amount, food);
    }

    public boolean isEnoughFood(int amount){
        if (food < amount){
            return false;
        } return true;
    }
    public void decrease(int amount){
            food -= amount;
            System.out.printf("On plate left %d food \n", food);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
