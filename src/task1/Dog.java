package task1;

public class Dog extends Animal{
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    {
        System.out.println("initializer - Dog");
        counter++;

    }
    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        System.out.println("Constructor - Dog");

    }

//    @Override
//    public void swim(int distance) {
//    }
}
