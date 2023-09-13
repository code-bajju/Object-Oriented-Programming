public class Basic {

    static String Employee_name;
    static float Employee_salary;

    static void set(String n, float p) {
        Employee_name = n;
        Employee_salary = p;
    }

    static void get() {
        System.out.println("Student name is: " + Employee_name);
        System.out.println("Student CTC is: " + Employee_salary);
    }

    public static void main(String args[]) {
        AlisaAndBajrang.set("Alisa and Bajrang", 10000.0f);
        AlisaAndBajrang.get();
    }
}
