class E2 {
    public static void main(String[] args) {

        Animal[] arr = new Animal[6];

        arr[0] = new Animal();
        arr[1] = new Dog();
        arr[2] = new Cat();
        arr[3] = new Cow();
        arr[4] = new Bdog();
         LivingBeing t = new Dog();
         arr[5] = (Animal)t;
        for (Animal next : arr)
            System.out.println(next);
    }
}
