class R {
    public static void main(String[] args) {
        User x = new User("mohan", 12);
        User y = new User("mohan", 12);
        User z = new User("hanmo", 12);

         // 1.
        // System.out.println(x.hashCode());
        // System.out.println(x.hashCode());
        // System.out.println(x.hashCode());

        // 2.
        // System.out.println(x.equals(y));
        // System.out.println(x.hashCode());
        // System.out.println(y.hashCode());

        // 3.
        System.out.println(x.equals(z));
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
    }    
}

