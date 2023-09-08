package task1;

public abstract class Animal {
    protected String name;
    protected int maxRun;
    protected int maxSwim;

    private  int id;

    static int counter;

    private static int idCounter;

    public static int getIdCounter(){
        return idCounter;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public static int getCounter() {
        return counter;
    }

    {
        System.out.println("initializer - Animal");

        id=++idCounter;
        counter++;

    }


    static {
        System.out.println("initializer - static - Animal");
        idCounter=1000;

    }
    public Animal(String name, int maxRun, int maxSwim) {
        System.out.println("Constructor - Animal");
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distance){
        if(distance<maxRun){
            System.out.printf("%s пробежал %d метров\n",name,distance);
        }
        else {
            System.out.printf("%s не смог пробежать %d метров\n",name,distance);

        }
    }
    public void swim(int distance){

        if(distance<maxSwim){
            System.out.printf("%s проплыл %d метров\n", name, distance);
        }
        else {
            System.out.printf("%s не смог проплыть %d метров\n", name, distance);

        }
    }

}
