class J {
    public static void main(String[] args) {
        String x = "mohan is a good boy";

        String[] y = x.split(" ");

        for(String next : y)
            System.out.println(">"+next+"<");
    }    
}