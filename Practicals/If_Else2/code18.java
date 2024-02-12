public class code18 {
    public static void main(String[] args) {
        double mark=85.00;
        if(mark>=75.00)
        {
            System.out.println("first class with distincation");
        }
        else if(mark>=60.00 && mark<75.00)
        {
            System.out.println("First class");
        }
        else if(mark>=50.00 && mark<60.00)
        {
            System.out.println("second class");
        }
        else if(mark>=35 && mark<50)
        {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
    }
}
