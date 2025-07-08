class User implements Comparable<User> {
     String name;
    Integer age;

    User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(User obj) {
        return this.name.compareTo(obj.name);
    }
}