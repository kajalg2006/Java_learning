class O1 {
    public static void main(String[] args) {
        LivingBeing abc = new BDog();

        Animal[] x = new Animal[4];

        x[0] = new Cat();
        x[1] = new Dog();
        x[2] = new Cow();
        x[3] = (BDog)abc;

        for(Animal next : x) {
            System.out.println(next);
        }
    }    
}