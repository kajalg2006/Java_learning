class Q1 {
    public static void main(String[] args) {
        Employee2 x = new Employee2("mohan", 12);
        Employee2 y = new Employee2("mohan", 12);
        Employee2 z = new Employee2("hanmo", 12);
        
        // 1.
        System.out.println(x.hashCode());
        System.out.println(x.hashCode());
        System.out.println(x.hashCode());

        // 2.
        System.out.println(x.equals(y));
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());

        // 3.
        // System.out.println(x.equals(z));
        // System.out.println(x.hashCode());
        // System.out.println(y.hashCode());
    }    
}

// hashCode() contract:
// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html#hashCode()