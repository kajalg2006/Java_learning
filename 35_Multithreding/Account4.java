class Account4 {
    private int balance;
    String acNum;
    String acType;

    Account4(int balance, String acNum, String acType) {
        this.balance = balance;
        this.acNum = acNum;
        this.acType = acType;
    }
    
    public synchronized void withdraw(int amount) {
        balance = balance - amount;
    }

    public synchronized int getBalance() {
        return balance;
    }

    String getAcNum() {
        return acNum;
    }

    String getAcType() {
        return acType;
    }
}