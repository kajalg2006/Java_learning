class A1{
    void info(){
        System.out.println("info in parent A1");
    }
}

class A2 extends A1{
    void info(){
        System.out.println("info in child A2");
    }


}

class O {
    public static void main(String[] args) {
        A2 a= new A2();

        a.info();
    }
    
}
