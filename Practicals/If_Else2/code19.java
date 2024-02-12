public class code19 {
    public static void main(String[] args) {
        int num1=5;
        int num2=6;
        int num3=4;
        int max;
        int n1;
        int n2;
        if(num1>num2 && num1>num3)
        {
            max=num1;
            n1=num2;
            n2=num3;


        }
        else if(num2>num1 && num2>num3)
        {
            max=num2;
            n1=num3;
            n2=num1;

        }
        else
        {
            max=num3;
            n1=num1;
            n2=num2;
        }
        if((max*max)==((n1*n1)+(n2*n2)))
        {
            System.out.println(num1+", "+num2 +" ,"+ num3 +" is a pythogours triplate");
        }
        else
        {
            System.out.println(num1+", "+num2 +" ,"+ num3 +" is  not pythogours triplate");
        }
    }
}
