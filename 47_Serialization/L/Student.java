import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    String name;
    int age;
    transient Address address;


    private void writeObject(ObjectOutputStream oos){
        try {
            oos.defaultWriteObject();
            oos.writeObject(address.city);
            oos.writeObject(address.state);
        } catch(IOException e) {
            e.printStackTrace();
        }

    }

    private void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            address = new Address();
            address.city = (String)ois.readObject();
            address.state = (String)ois.readObject();
        }catch(IOException e){
             e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}