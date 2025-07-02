import java.util.LinkedList;
class C {
    public static void main(String[] args) {
        // As a Stack:
        LinkedList<String> list = new LinkedList<String>();

        list.push("mohan");
        list.push("raj");
        list.push("mukund");
        list.push("neelesh");
        list.push("ratan");

        System.out.println(list);

        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());

        System.out.println(list);
    }
}
