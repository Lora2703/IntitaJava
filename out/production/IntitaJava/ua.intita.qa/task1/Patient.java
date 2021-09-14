package task1;

public class Patient {
    private int id;
    private String surname;
    private String name;
    private String address;
    private String phone;
    private int numberMedCart;
    private String diagnose;

    public Patient (int id, String surname, String name, String address, String phone, int numberMedCart, String diagnose){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.numberMedCart = numberMedCart;
        this.diagnose = diagnose;
    }

    public int getNumberMedCart() {
        return numberMedCart;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
