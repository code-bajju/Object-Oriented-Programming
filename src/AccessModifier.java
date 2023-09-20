public class AccessModifier {
    public static void main(String[] args) {
        student detail = new student();
       detail.setName("bajrang Gour");
        System.out.println(detail.getName());
//        System.out.println(.rollNo);
    }
}
class student{
    int rollNo;

    private String name ;
    public void setName(String bajju){
        name = bajju;
    }
    public String getName(){
        return name;
    }
    public void setRollNo(int roll){
        rollNo = roll;
    }
    public int getRollNo(){
        return rollNo;
    }

}

//class section
//    student group = new student();
////    group.name= "bajrang" ;
//
//}
