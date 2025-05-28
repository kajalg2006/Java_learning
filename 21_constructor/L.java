class YA {
    int x = 89;

    void aaa() {
        System.out.println("aaa() method in class YA");
    }
}

class YB extends YA {
    boolean y = false;

    void bbb() {
        System.out.println("bbb() method in class YB");
    }
} 

class YC extends YB {
    char z = 'R';

    void ccc() {
        System.out.println("ccc() method in class YC");
    }
}


class L {
    public static void main(String[] args) {
        YC h = new YC();

        System.out.println(h.x);
        System.out.println(h.y);
        System.out.println(h.z);

        h.aaa();
        h.bbb();
        h.ccc();
    }
}