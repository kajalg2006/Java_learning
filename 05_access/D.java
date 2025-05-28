class  D{
    static int y = 20;
    public static void main(String[] args) {
        System.out.println(y);
        System.out.println(D.y);
        System.out.println(D1.y);
    }
}

class D1{
    static int y = 80;
}
