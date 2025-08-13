class O {
    public static void main(String[] args) {
        LivingBeing abc = new BDog();

        Animal[] x = new Animal[4];

        x[0] = new Cat();
        x[1] = new Dog();
        x[2] = new Cow();
        x[3] = abc;

        for(Animal next : x) {
            System.out.println(next);
        }
    }    
}


// O.java:10: error: incompatible types: LivingBeing cannot be converted to Animal
//         x[3] = abc;
//                ^
// 1 error