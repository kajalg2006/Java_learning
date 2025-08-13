class M {
    public static void main(String[] args) {
        Animal[] x = new Animal[4];

        x[0] = new Cat();
        x[1] = new Dog();
        x[2] = new Cow();
        x[3] = new BDog();

        for(Animal next : x) {
            System.out.println(next);
        }
    }    
}