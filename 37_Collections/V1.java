import java.util.ArrayList;
class V1 {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<Student1>();

        Student1 a = new Student1("jay", 23);
        Student1 b = new Student1("raghav", 18);
        Student1 c = new Student1("golu", 9);
        Student1 d = new Student1("vikramaditya", 12);
        Student1 e = new Student1("om", 17);


        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        
    }
}
