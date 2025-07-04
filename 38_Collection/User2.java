class User2 implements Comparable {
    String name;
    int age;
    
    User2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ~ " + age;
    }

    public int compareTo(Object obj) {
        User2 a = this;
        User2 b = (User2)obj;
        
        String nm1 = a.name;
        String nm2 = b.name;
                
        return nm1.compareTo(nm2);
    }
}