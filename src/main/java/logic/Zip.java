package logic;

public class Zip {
    private int id;
    private String type;
    private String name;
    private String manufacture;

    public Zip() {
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getManufacture() {
        return manufacture;
    }
}
