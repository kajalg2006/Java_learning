public class Employee2 {
     String name;
   int age;
   
   Employee2(String name , int age){
    this.name=  name;
    this.age= age;
   }

    public String toString() {
        return name + " ~ " + age;
    }

    public boolean equals(Object obj){

        boolean flag =false;
       if( obj instanceof Employee2){
        Employee2 a= this;
        Employee2 b = (Employee2)obj;
       
        String nm1= a.name;
        String nm2 = b.name;

         flag = nm1.equals(nm2);
       }
        return flag;
    }

    public int hashCode(){
        int  code  =0; 
        String abc = "abcdefghijklmnopqrstuvwxyz";

        for( int i =0; i < name.length(); i++){
            code += abc.indexOf(name.charAt(i));
        }
        return code;
    }

}
