package task_two;

public class Ranner {
    public static void main(String[] args) {

        Plants[] plants = new Plants[5];
        try {
            plants[0] = new Plants(1, "blue", "cornflower");
        } catch (ColorException | TypeException e) {
            System.err.println("There is no such color or type of flower");
        }
        try {
            plants[1] = new Plants(2, "pink", "peony");
        } catch (ColorException | TypeException e) {
            System.err.println("There is no such color or type of flower");
        }
        try {
            plants[2] = new Plants(3, "black", "rose");
        } catch (ColorException | TypeException e) {
            System.err.println("There is no such color or type of flower");
        }
        try {
            plants[3] = new Plants(4, "white", "daisy");
        } catch (ColorException | TypeException e) {
            System.err.println("There is no such color or type of flower");
        }
        try {
            plants[4] = new Plants(5, "red", "violet");
        } catch (ColorException | TypeException e) {
            System.err.println("There is no such color or type of flower");
        }

        for (Plants plant : plants) {
            if (plant != null) {
                System.out.println(plant);
            }
        }
    }
}