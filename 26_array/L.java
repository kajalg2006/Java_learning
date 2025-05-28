// commandline-argument:
// >java L mohan rohan sohan

class L {
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);
        
        for(String next : args)
            System.out.println(next);
    }
}