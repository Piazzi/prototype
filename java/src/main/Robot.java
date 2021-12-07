package main;

public class Robot implements Cloneable{

    private int serialNumber;
    private String name;
    private String releaseDate;

    public Robot(int serialNumber, String name, String releaseDate) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.releaseDate = releaseDate;
    }

    @Override
    public Robot clone() throws CloneNotSupportedException {
        Robot robotClone = (Robot) super.clone();
        return robotClone;
    }

    public String toString() {
        return "Robot{" +
                "serialNumber: "+serialNumber+
                ", name: "+name+
                ", releaseDate: "+releaseDate+
                "}";
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }


}
