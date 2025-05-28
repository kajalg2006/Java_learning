public class F1 {
    public static void main(String[] args) {
        
        LivingBeing t = new LivingBeing();
        Animal[] arr = {new Animal(), new Dog(), new Cat(), new Cow(), new Bdog(), (Animal)t};
        for (Animal next : arr)
            System.out.println(next);
    }
}
