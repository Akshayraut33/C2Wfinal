class NestedDemo9{
        public static void main(String [] args){
               
                for(int i=1;i<=4;i++){
			char ch1='A';
			char ch2='a';
                        if(i%2==1){
                                for(int j=1;j<=3;j++){
                                        System.out.print(ch1++ +" ");
                                }
                                System.out.println();
                        }
                        else{
                                for(int j=1;j<=3;j++){
                                        System.out.print(ch2++ + " ");
                                }
                                System.out.println();
                        }
                }
        }
}


