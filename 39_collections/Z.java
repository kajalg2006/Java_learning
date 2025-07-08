import java.util.TreeMap;

class Z {
    public static void main(String[] args) {
        TreeMap<Student,College> map = new TreeMap<Student,College>();
        
        map.put(new Student("mohan", 20), new College("Global"));
        map.put(new Student("vikram", 18), new College("SRIT"));
        map.put(new Student("suresh", 21), new College("GGCT"));
        map.put(new Student("ranveer", 19), new College("JEC"));
        map.put(new Student("mukesh", 22), new College("GGITS"));
        map.put(new Student("suresh", 21), new College("HEC"));

        System.out.println(map);
    }
}

// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable (Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//         at java.base/java.util.TreeMap.put(TreeMap.java:785)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at Z.main(Z.java:7)