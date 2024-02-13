package Practicals.If_Else3;

public class code8 {
    public static void main(String[] args) {
        int x=65;
        char ch='B';
        if(x==ch && x+1>ch)
        {
            System.out.println(" "+ch+ch);
        }
        else if(++x>=ch)
        {
            System.out.println(ch);
        }
        else
        {
            System.out.println(x++);
        }
    }
}
