import java.util.Arrays;

class V1 {
     public static void main(String[] args) {
        User[] x = {
            new User("ketak", 8),
            new User("hitesh", 15),
            new User("sarvan", 10),
            new User("giyan", 17),
            new User("binja", 7),
            new User("ninja", 12)
        };

        for(User next : x)
            System.out.print(next + "  #  ");
            
        Arrays.sort(x);
        
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        for(User next : x)
            System.out.print(next + "  #  ");
    }
}
