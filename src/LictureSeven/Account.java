package LictureSeven;

public class Account {
    private Long id; // номер счёта
    private String  holder; //владелец счёта
    private float amount; // сумма на счёте

    public Account(Long id) {
        this.id = id;
    }
    public Account(Long id, String holder) {
        this.id = id;
        this.holder = holder;
    }

    public Account(Long id, String holder, float amount) {
        this.id = id;
        this.holder = holder;
        this.amount = amount;
    }

    public void withdraw(float withdraw){
        amount = this.amount - withdraw;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float amount) {
        this.amount = this.amount + amount;
    }

    public void transfer(Long id, float amount){
        this.amount = this.amount - amount;
        Account account = new Account(id);
        account.setAmount(amount);
    }
}
