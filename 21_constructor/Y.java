 class Y3 {
    Y3(int x){

    }
}
class Y extends Y3{
    int q =22;

    Y(){
        super(12);
        //super(q);
    }
}

// Y.java:11: error: cannot reference q before supertype constructor has been called
//         super(q);
//               ^
// 1 error