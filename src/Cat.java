public class Cat extends Animal {
    int fleas;

    @Override
    public void sleep() {
        System.out.println("Кошка спит");
        meow();
    }

    private void meow() {
        System.out.println("Кошка мяукает");
    }

    public Cat(int fleas) {
        this.fleas = fleas;
    }
}
