class O {
    int  y = 45;
    public static void main(String[] args) {
        O x = new O();
        x.y= 46;
        
        O b = new O();
        b.y= 47;
        O c = new O();
        c.y= 48;

        x.pro();
        b.pro();
        c.pro();

    }
    void pro(){
        System.out.println(y);
    }
}
