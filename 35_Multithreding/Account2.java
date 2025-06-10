class Account2 {
    int balance;
    String acNum;
    String acType;

    Account2(int balance, String acNum, String acType) {
        this.balance = balance;
        this.acNum = acNum;
        this.acType = acType;
    }
    
    void withdraw(int amount) {
        if(balance >= amount) {
            try{ Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
            
            balance = balance - amount;
        }
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