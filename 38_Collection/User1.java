class User1 implements Comparable {
    String name;
    int age;
    
    User1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ~ " + age;
    }

    public int compareTo(Object obj) {
        return this.name.compareTo(((User1)obj).name);
    }
}