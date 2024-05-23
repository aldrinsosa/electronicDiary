package logic;

public class User {
    private String dni = "";
    private String fName = "";
    private String sName = ""; 
    private String address = "";
    private String phone = "";
    private String birth = "";
    public User (){
        
    }
    public User (String dni, String fName, String sName, String address, String phone, String birth){
        this.dni = dni;
        this.fName = fName;
        this.sName = sName;
        this.address = address;
        this.phone = phone;
        this.birth = birth;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
    
}
