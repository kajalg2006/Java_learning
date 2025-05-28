class D {
    public static void main(String[] args) {
        System.out.println("start");

        Animal a = new Cat();

        Dog b = (Dog)a;

        System.out.println("end");
    }
}

class Animal {}
class Cat extends Animal {}
class Dog extends Animal {}

// start
// Exception in thread "main" java.lang.ClassCastException: class Cat cannot be cast to class Dog (Cat and Dog are in unnamed module of loader 'app')
//         at D.main(D.java:7)