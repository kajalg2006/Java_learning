class K {
    public static void main(String[] args) {
        Animal[] y = new Dog[2];

        y[0] = new Dog();
        y[1] = new Cat();
    }    
}



// Exception in thread "main" java.lang.ArrayStoreException: Cat
//         at K.main(K.java:6)