class K {
    class A {
        private void pro() {
            System.out.println("~~Some More Info");

        }
    }

    public static void main(String[] args) {
        K k = new K();

       A a = k.new A();
       a.pro();
    }
}