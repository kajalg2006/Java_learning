import java.util.ArrayList;

class N {
    public static void main(String[] args) {
        ArrayList<Animal> x = new ArrayList<Animal>();

        x.add(new Cat());
        x.add(new Dog());
        x.add(new Cow());
        x.add(new BDog());
        x.add(new Animal());

        System.out.println(x);
    }
}