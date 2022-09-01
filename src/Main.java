public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal2.setLegs(5);
        animal2.setTail(false);

        System.out.println("У 1 животного " + animal1.getLegs() + " ноги");
        System.out.println("Есть ли у 1 животного хвост? " + animal1.getTail());
        System.out.println();
        System.out.println("У 2 животного " + animal2.getLegs() + " ноги");
        System.out.println("Есть ли у 2 животного хвост? " + animal2.getTail());
        animal2.sleep();
        System.out.println();


        Cat cat1 = new Cat(2);
        System.out.println("Кол-во блох " + cat1.fleas);
        cat1.sleep();
        System.out.println();

        Cat cat2 = new Cat(0);
        System.out.println("Кол-во блох " + cat2.fleas);
        cat2.fleas = 5;
    }
}
