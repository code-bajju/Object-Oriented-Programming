public class Basic {

    static String Student_name;
    static float Student_Sallery;

    static void set(String n, float p) {
        Student_name = n;
        Student_Sallery = p;
    }

    static void get() {
        System.out.println("Student name is: " + Student_name);
        System.out.println("Student CTC is: " + Student_Sallery);
    }

    public static void main(String args[]) {

    }
}
