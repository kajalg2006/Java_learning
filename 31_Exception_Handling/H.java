class D {
    public static void main(String[] args) {
        System.out.println("start");

        Animal a = new Cat();

        try{
            Dog b = (Dog)a;
        }catch(ClassCastException e){
            System.out.println("some problem");

        }
        System.out.println("end");
    }
}

class Animal {}
class Cat extends Animal {}
class Dog extends Animal {}