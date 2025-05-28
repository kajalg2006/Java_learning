 class E1 {
    public static void main(String[] args) {

        Animal[] arr = new Animal[6];

        arr[0] = new Animal();
        arr[1] = new Dog();
        arr[2] = new Cat();
        arr[3] = new Cow();
        arr[4] = new Bdog();
        // LivingBeing t = new Dog();
        // arr[5] = t;
        for (Animal next : arr)
            System.out.println(next);
    }

}

// E1.java:12: error: incompatible types: LivingBeing cannot be converted to
// Animal
// arr[5] = t;
// ^
// 1 error
