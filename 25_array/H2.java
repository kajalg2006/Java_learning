public class H2 {
    public static void main(String[] args) {
        Animal[] x = new Dog[2];

        x[0] = new Dog();
        x[1] = new Cat();
    }    
}
// Exception in thread "main" java.lang.ArrayStoreException: Cat
//         at H2.main(H2.java:6)
