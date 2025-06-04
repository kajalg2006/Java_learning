class R {
    public static void main(String[] args) {
         try {
            throw new ArithmeticException("Ghapla Ho gaya");
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
