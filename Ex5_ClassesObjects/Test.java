public class Test {
    public static void main(String[] args) {
        // String id, String fullName, String address, String email, String phoneNumber
//        Student student = new Student("B22DCCN123", "Tran Trung Phong", "Hanoi",
//                "trungxmail@jmail.com", "0123456789");
//        student.gotoSchool();
//        student.doHomework("Math");
//        student.payFee("Math", 3500f);
//        String info = student.showInfo();
//        System.out.println(info);

        Subject math = new Subject("M001", "Tran Dang Minh", "Math", 4, 4, 4);
        System.out.println("So tin chi: " + math.getAmountOfInfo());
        System.out.println(math);
    }
}
