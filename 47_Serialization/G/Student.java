import java.io.Serializable;

class Student implements Serializable {
    String name;
    int age;
    transient Address address; 
}

// We don't have Address.java... we can't mark the class Address Serializable.. 
// we only have the Address.class(We don't have source code... so we can't edit it)
// To just ignore or skip the member we can apply transient keyword ... 

// Now serialization process will ignore such transient variable...
// java.io.NotSerializableException: Address
//         at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1197)
//         at java.base/java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1582)
//         at java.base/java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1539)
//         at java.base/java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1448)
//         at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1191)
//         at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:354)
//         at A.main(A.java:22)