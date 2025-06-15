public class Account {
    private int balance;
    String acNum;
    String acType;

    Account(int balance, String acNum, String acType) {
        this.balance = balance;
        this.acNum = acNum;
        this.acType = acType;
    }

    public /*synchronized*/ void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                balance = balance - amount;
            }
        }
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
