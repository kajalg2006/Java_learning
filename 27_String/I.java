class I {
    public static void main(String[] args) {
        String name1 = new String("ajeet");
        String name2 = new String("ajeet");
        
        int age1 = 32;
        int age2 = 32;

        Employee a = new Employee(name1, age1);
        Employee b = new Employee(name2, age2);

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }    
}