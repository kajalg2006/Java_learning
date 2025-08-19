import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A{
    public static void main(String[] args) throws IOException{
        City city = new City();
        city.cityName = "Kanpur";

        State state = new State();
        state.stateName = "Uttar Pradesh";

        Address addr = new Address();
        addr.city = city;
        addr.state = state;

        Student student = new Student();
        student.name = "vigyan";
        student.age = 12;
        student.address = addr;

        new ObjectOutputStream(new FileOutputStream("arjun.txt")).writeObject(student);
    }
}