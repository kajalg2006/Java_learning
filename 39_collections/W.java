import java.util.HashMap;

// Hint: equals() and hashCode() are commented in Student.java
class W {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<Student,String>();
        
        map.put(new Student("mohan", 20), "Global");
        map.put(new Student("vikram", 18), "SRIT");
        map.put(new Student("suresh", 21), "GGCT");
        map.put(new Student("ranveer", 19), "JEC");
        map.put(new Student("mukesh", 22), "GGITS");
        map.put(new Student("suresh", 21), "HEC");

        System.out.println(map);

        Student s = new Student("suresh", 21);
        System.out.println(map.containsKey(s));
    }
}