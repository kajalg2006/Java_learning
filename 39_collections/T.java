// Hint: equals() and hashCode() are commented in Student.java

import java.util.HashMap;

class T{
    public static void main(String[] args) {
        
    
      HashMap<Student,String> map = new HashMap<Student,String>();
        
        map.put(new Student("mohan", 20), "Global");
        map.put(new Student("vikram", 18), "SRIT");
        map.put(new Student("suresh", 21), "GGCT");
        map.put(new Student("ranveer", 19), "JEC");
        map.put(new Student("mukesh", 22), "GGITS");

        System.out.println(map);
    }
}