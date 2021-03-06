package logic;

import java.util.Date;

    public class Check {
        private int id;//идентификатор заказа
        private int customer;//идентификатор клиента
        private Date date1;//дата приема
        private Date date2;//дата исполнения
        private Date date3;//дата отдачи(закрытие заказа)
        private enum State{NEW, DONE, CLOSED}; //NEW - новый/не обработанный заказ, DONE - готовый заказ, CLOSED - отданный заказ.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date) {
        this.date1 = date;
    }

    public void setDate2(Date date) {
        this.date2 = date;
    }

    public Date getDate2() {
            return date2;
        }

    public Check() {
    }
}
