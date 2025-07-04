import java.util.TreeSet;
import java.util.Scanner;
import java.util.Comparator;
class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Press 1 for NameAscSort\n2 for NameDscSort\n3 for AgeAscSort\n4 for AgeDscSort: ");

        int val = sc.nextInt();
        Comparator comp = null;

        if(val == 1) 
            comp = new NameAscSort();
        else if(val == 2)
            comp = new NameDscSort();
        else if(val == 3)
            comp = new AgeAscSort();
        else if(val == 4)
            comp = new AgeDscSort();
        else
            System.exit(0);


        TreeSet<User1> set = new TreeSet<User1>(comp);

        

        set.add(new User1("om", 12));
        set.add(new User1("raj", 8));
        set.add(new User1("golu", 14));
        set.add(new User1("vivek", 9));
        set.add(new User1("mayank", 10));

        System.out.println(set);

    }
}

class NameAscSort implements Comparator {
    public int compare(Object a, Object b) {
        User1 x = (User1)a;
        User1 y = (User1)b;

        String nm1 = x.name;
        String nm2 = y.name;

        return nm1.compareTo(nm2);
    }
}

class AgeAscSort implements Comparator {
    public int compare(Object a, Object b) {
        User1 x = (User1)a;
        User1 y = (User1)b;

        Integer ag1 = x.age;
        Integer ag2 = y.age;

        return ag1.compareTo(ag2);
    }
}


class AgeDscSort implements Comparator {
    public int compare(Object a, Object b) {
        User1 x = (User1)a;
        User1 y = (User1)b;

        Integer ag1 = x.age;
        Integer ag2 = y.age;

        return ag2.compareTo(ag1);
    }
}

class NameDscSort implements Comparator {
    public int compare(Object a, Object b) {
        User1 x = (User1)a;
        User1 y = (User1)b;

        String nm1 = x.name;
        String nm2 = y.name;

        return nm2.compareTo(nm1);
    }
}
