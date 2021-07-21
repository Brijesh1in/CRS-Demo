package beans;

public class Customer {

    private int id;
    private String name;
    private String address;
    private int pinCode;
    
    public Customer(int id , String name, String address , int pinCode){
        this.id = id;
        this.name = name;
        this.address = address;
        this.pinCode = pinCode;
        
    }

    public int getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
