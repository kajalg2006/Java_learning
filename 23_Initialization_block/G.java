class G {
    {
        System.out.println("H");
    }

    {
        System.out.println("T");
    }

    {
        System.out.println("A");
    }

    G() {
        System.out.println("D");
    }

    public static void main(String[] args) {
        G x = new G();
    }
}
