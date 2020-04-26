// format code: Ctrl Alt L
public class Student {
    private String id;
    private String fullName;
    private String address;
    private String email;
    private String phoneNumber;

    public Student() {
    }

    public Student(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Student(String id, String fullName, String address, String email, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void gotoSchool() {
        System.out.println("I'm going to school.");
    }

    public void doHomework(String subject) {
        System.out.println("I'm doing my " + subject + " homework.");
    }

    public void payFee(String subject, float amount) {
        System.out.println("Pay fee for " + subject + ", fee: " + amount);
    }

    public boolean doFinalTest(String subject) {
        if (subject != null && subject.toLowerCase().compareTo("math") == 0) {
            return true;
        }
        return false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
