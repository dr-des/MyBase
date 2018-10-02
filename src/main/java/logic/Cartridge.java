package logic;

import java.util.Date;

public class Cartridge {
    private int id;
    private int check;
    private int customer_id;
    private int zip_id;
    private int count;
    private Date date;

    public void setCheck(int check) {
        this.check = check;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setZip_id(int zip_id) {
        this.zip_id = zip_id;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCheck() {
        return check;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public int getZip_id() {
        return zip_id;
    }

    public int getCount() {
        return count;
    }

    public Date getDate() {
        return date;
    }

    public Cartridge() {
    }
}
