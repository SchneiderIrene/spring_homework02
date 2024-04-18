package app.shop;

import org.springframework.beans.factory.annotation.Autowired;

public class Director {
    @Autowired
    private Cash cash;

    public void setCash(Cash cash) {
        this.cash = cash;
    }

    public void directorCash (){
        cash.cashMany();
        System.out.println("Директор получил прибыль");
    }
}
