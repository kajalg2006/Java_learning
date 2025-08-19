import java.io.Serializable;

class Student implements Serializable{
    String name = "yamraj";
    int age = 1000;
    transient String college = "Yamlok College";
    transient float marks = 99.99f;

}
