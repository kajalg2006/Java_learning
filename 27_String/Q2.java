class Q2 {
    public static void main(String[] args) {
        // String x = "internationalization";
        String x = "instantiationi";

        int index = 0;

        while((index = x.indexOf('i', index)) != -1) 
            System.out.println(index++);
        
    }    
}