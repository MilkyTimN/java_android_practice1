package hw7;

public class Cat {
    private String name;
    private int needFood;
    private boolean isHungry;

    public Cat(String name, int needFood, boolean isHungry) {
        this.name = name;
        this.needFood = needFood;
        this.isHungry = isHungry;
    }

    public String getName() {
        return name;
    }

    public int getNeedFood() {
        return needFood;
    }

    public boolean isHungry() {
        return isHungry;
    }



    public void eat(Plate plate){
        if (isHungry != true) {
            System.out.printf("Now cat %s do NOT need food, it well-fed \n", name);
            return;
        }
        if (needFood < 0) {
            System.out.println("Need food can NOT be negative \n");
            return;
        }
        if (!plate.isEnoughFood(needFood)){
            System.out.printf("Sorry, not enough food for cat %s \n", name);
            if (isHungry){
                System.out.printf("Cat %s is hungry \n", name);
            }
            return;
        }
        if (plate.isEnoughFood(needFood)) {
            System.out.printf("Cat %s eats %d food \n", name, needFood);
            plate.decrease(needFood);
            isHungry = false;
            System.out.printf("Now cat %s is NOT hungry \n", name);
        }
    }
}
