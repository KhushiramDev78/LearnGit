public class VaribleNameDemo {

    public static void main(String[] args) {
       // VALID varibles names
       int age = 25;
       int studentCount = 100;
       final int MAX_SPEED = 120; // COSTANT NAMING CONVERSIO
        System.out.println("age:"+ age);
        System.out.println("student count " + studentCount);
        System.out.println("max speed "+ MAX_SPEED);



        // ✅ Example showing case-sensitivity
        int number = 10;
        int Number = 20;  // different variable (case-sensitive)
        System.out.println("number = " + number);
        System.out.println("Number = " + Number);
    }

}
