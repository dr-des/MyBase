package logic;

import java.util.Date;

public class Cartridge {
    private int id;
    private int check_id;
    private int zip_id;
    private int count;

    public void setCheckId(int check) {
        this.check_id = check;
    }

    public void setZip_id(int zip_id) {
        this.zip_id = zip_id;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCheck() {
        return check_id;
    }

    public int getZip_id() {
        return zip_id;
    }

    public int getCount() {
        return count;
    }

    public Cartridge() {
    }
}
