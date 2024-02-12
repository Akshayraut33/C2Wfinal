public class code14 {
    public static void main(String[] args) {
        float marks=85.00f;
        if(marks>85.00)
        {
            System.out.println("medical");
        }
        else if(marks<=85.00 && marks>75.00)
        {
            System.out.println("Engineering");
        }
        else if(marks<=75.00 && marks>=65.00)
        {
            System.out.println("pharmacy");
        }
        else
        {
            System.out.println("Anything that you want ");
        }

    }
}
