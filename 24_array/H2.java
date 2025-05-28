class H2{
    public static void main(String[] args) {
        Student[] x = new Student[3];
        
        x[0] = new Student("mohan", 12);

        System.out.println(x[0] instanceof Student);
    }
}