public class Animal {

    //хвост, лапы, шерсть

    private boolean tail = true;
    public boolean getTail() {
        return tail;
    }

    public void setTail(boolean var) {
        tail = var;
    }

    private int legs = 4;
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        if (legs > 0) {
            this.legs = legs;
        }
    }

    boolean fur = true;

    //спать

    public void sleep() {
        System.out.println("Животное спит");
    }
}
