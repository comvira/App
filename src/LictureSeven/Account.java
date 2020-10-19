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
        amount = this.amount - withdraw;// снимаем деньги со счёта
    }

    public float getAmount() {
        return this.amount;// возвращает сумму счёта
    }

    public void setAmount(float amount) {
        this.amount = this.amount + amount;// добавить деньгт на счёт
    }

    public void transfer(Long id, float amount){
        this.amount = this.amount - amount; // перевод на другой счёт
        Account account = new Account(id);
        account.setAmount(amount);
    }
}
