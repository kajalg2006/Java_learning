 class W1 {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            
            int[] y = {12, 45, 67};
            System.out.println(y[i]);

            String x = "om";
            System.out.println(x.charAt(i));

        }  catch(NumberFormatException e) {
            System.out.println(e);        
            System.out.println("NFE");
        // } catch(IndexOutOfBoundsException e) {
        //     System.out.println(e);
        //     System.out.println("IOBE");
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("SIOBE");
        }
    }    
}


// PS C:\Users\Dell\OneDrive\文档\kajal's Folder\java_course\31_Exception_Handling> javac W1.java
// W1.java:18: error: exception StringIndexOutOfBoundsException has already been caught
//         } catch(StringIndexOutOfBoundsException e) {
//           ^
// 1 error
