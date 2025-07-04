class User {
    String name;
    int age;
    
    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ~ " + age;
    }

    public boolean equals(Object obj){
         boolean flag = false;
        if(obj  instanceof User){
            User a = this;
            User b = (User)obj;
            
            System.out.println(a + " ^^^^ " + b);

            String nm1 = a.name;
            String nm2 = b.name;

            int ag1 = a.age;
            int ag2 = b.age;

            flag = nm1.equals(nm2) && ag1 == ag2;

        }
        return flag;
    }

     public int hashCode() {
        int code = 0;

        String abc = " abcdefghijklmnopqrstuvwxyz";

        for(int i=0;i<name.length();i++) {
            code += abc.indexOf(name.charAt(i));
        }   

        code += age;

        System.out.println(code + " ~~~~" + this);

        return code;
    }

}
