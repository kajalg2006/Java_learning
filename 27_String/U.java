class U {
    public static void main(String[] args) {
        String x = "om is a good boy and he is my best friend and he is in class 10th and he lives on an island and he likes mishti";

        int index = 0;

        while((index = x.indexOf("is", index)) != -1)
            System.out.println(index++);
    }    
}