package net.p4c;

public class Address {
    private String streetAddress;
    private String city;
    private String stateCode;
    private int zip;


    public void setStreetAddress(String sAdd)
    {
        this.streetAddress = sAdd;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getZip() {
        return zip;
    }
}
