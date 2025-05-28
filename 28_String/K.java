public class K {
    public static void main(String[] args) {
        
        String x = "mohan99is4a567good89boy";
        
        String[] y = x.split("\\d\\d");
        
        for(String next : y)
        System.out.println(">"+next+"<");
    }
}
