class G2 {
    public static void main(String[] args) {
        Order<Product<String>> x = new Order<Product<String>>();

        System.out.println(x);
    }
}