import java.util.TreeMap;

class A {
    public static void main(String[] args) {
        TreeMap<Student1,College> map = new TreeMap<Student1,College>();
        
        map.put(new Student1("mukesh", 20), new College("Global"));
        map.put(new Student1("vikram", 18), new College("SRIT"));
        map.put(new Student1("suresh", 21), new College("HEC"));
        map.put(new Student1("ranveer", 19), new College("JEC"));
        map.put(new Student1("mohan", 22), new College("GGITS"));
        map.put(new Student1("suresh", 21), new College("GGCT"));

        System.out.println(map);
    }
}