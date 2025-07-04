import java.util.TreeSet;
import java.util.Scanner;
import java.util.Comparator;

class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Press 1 for NameAscSort\n2 for NameDscSort\n3 for AgeAscSort\n4 for AgeDscSort: ");

        int val = sc.nextInt();
        Comparator<User1> comp = null;

        sc.close();

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


class NameAscSort implements Comparator<User1> {
    public int compare(User1 a, User1 b) {
        return a.name.compareTo(b.name);
    }
}

class NameDscSort implements Comparator<User1> {
    public int compare(User1 a, User1 b) {
        return b.name.compareTo(a.name);
    }
}

class AgeAscSort implements Comparator<User1> {
    public int compare(User1 a, User1 b) {
        return a.age.compareTo(b.age);
    }
}

class AgeDscSort implements Comparator<User1> {
    public int compare(User1 a, User1 b) {
        return b.age.compareTo(a.age);
    }
}