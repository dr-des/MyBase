package logic;

public class Customer {
    private int id;
    private String name;
    private String phone;
    private String info;

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getInfo() {
        return info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
