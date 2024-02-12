 



class q14
{

 public static void main(String ar[])
 {
    int x=14;
    int y=22;
    System.out.println(++x + y++); // 15 + 22 37 

    System.out.println(x++ + ++y + ++x + ++x); // 15 + 24 + 17 +18= 74 
    System.out.println(y++ + ++x + ++x); // 24 + 19 + 20 63 
 }

}
