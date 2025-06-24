class Y {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        System.out.println("Default Thread's Info: ");
        System.out.println("Name: " + x.getName());
        System.out.println("ID: " + x.getId());
        System.out.println("Priority: " + x.getPriority());
    }    
}