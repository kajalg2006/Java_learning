class Account1 {
    int balance;
    String acNum;
    String  acType;

    Account1(int balance, String acNum, String acType) {
        this.balance = balance;
        this.acNum = acNum;
        this.acType = acType;
    }


    void withdraw(int amount){
      balance = balance -amount;
    }

     int getBalance() {
        return balance;
    }

    String getAcNum() {
        return acNum;
    }

    String getAcType() {
        return acType;
    }
}
