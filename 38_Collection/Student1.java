class Student1 {
    String name;
    int age;
    
    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public boolean equals(Object obj) {
        return this.name.equals(((Student1)obj).name);
    }
}
