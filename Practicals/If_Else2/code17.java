public class code17 {
    public static void main(String[] args) {
        int selling=500;
        int buying=300;
        int val=selling-buying;
        if(val>0)
        {
            System.out.println( val +" rs profit ");
        }
        else if(val==0)
        {
            System.out.println("no profit or loss");
        }
        else {
            System.out.println(val+ " rs loss");
        }
    }
}
