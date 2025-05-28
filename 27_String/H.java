public class H {
    public static void main(String[] args) {
        Student x=  new Student("om",9);
        
        Student y=  new Student("om",9);
      
         System.out.println(x == y);
         System.out.println(x.equals(y));
    }
}
