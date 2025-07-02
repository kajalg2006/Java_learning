import java.util.LinkedList;
class A {
    public static void main(String[] args) {
        //As a List:
        LinkedList<String> list  = new LinkedList<String>();

        list.add("mohan");
        list.add("sohan");
        list.add("rohan");
        list.add("tohan");
        list.add("mohan");

        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println(list);

        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));

        System.out.println(list);

    }
}
