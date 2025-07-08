 class Student1 implements Comparable<Student1>{
    String name;
    int age;
     Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ~ " + age;
    }

    public int compareTo(Student1 obj){
        return this.name.compareTo(obj.name);
    }

}
