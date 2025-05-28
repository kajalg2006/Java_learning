class Employee{
    String name;
    int age;
    
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        Employee a = this;
        Employee b = (Employee)obj;
        
        String nm1 = a.name;
        String nm2 = b.name;

        int ag1 = a.age;
        int ag2 = b.age;

        return nm1.equals(nm2) && ag1 == ag2;
    }
}