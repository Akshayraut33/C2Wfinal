class ForBreakDemo3{
        public static void main(String [] args){
                for(int i=1;i<=100;i++){
                        if(i%5==0 && i%4==0){
                                System.out.println("Helloo");
				continue;
                        }
                        System.out.println(i);
                }
        }
}

