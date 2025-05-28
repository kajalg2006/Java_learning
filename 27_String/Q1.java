class Q1 {
    public static void main(String[] args) {
        // String x = "internationalization";
        String x = "instantiation";

        int index = x.indexOf('i');

        while(index != -1) {
            System.out.println(index++);
            index = x.indexOf('i', index);
        }
    }    
}