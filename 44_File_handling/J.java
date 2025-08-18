import java.io.File;

class J {
    public static void main(String[] args) {
        File file = new File("dholakpur");

        System.out.println("dholakpur exists?"+file.exists());

        boolean flag = file.mkdir();

        System.out.println("folder dholkapur created? : " + flag);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("dholakpur exists?: " + file.exists());
    }
}
