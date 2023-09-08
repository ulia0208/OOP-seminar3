package task1;

public class Program {
    public static void main(String[] args) {



        Animal[] animals={
                new Cat("Barsik"),
                new Cat("Murka"),
                new Cat("Murzik"),

                new Dog("Sharik",500,20),
                new Dog("Tuzik",700,25),
                new Dog("Zhuchka",600,15),
        };

        for(Animal animal:animals){

            System.out.printf("%d - %s\n", animal.getId(), animal.getName());

            animal.run(200);
            animal.swim(50);

        }

        System.out.println(" Счетчик идентификатора обьектов: "+Animal.getIdCounter());
        System.out.println(" Было создано: "+Animal.getCounter()+" животных");
        System.out.println(" Было создано: "+Cat.getCounter()+" котов");
        System.out.println(" Было создано: "+Dog.getCounter()+" собак");



    }
}