class NestedDemo8{
        public static void main(String [] args){
                int num=1;
		char ch='A';
		
                for(int i=1;i<=4;i++){
                       	if(i%2==1){
		       		for(int j=1;j<=3;j++){
                                	System.out.print(num++ +" ");
                        	}
                        	System.out.println();
			}
			else{
				for(int j=1;j<=3;j++){
					System.out.print(ch++ + " ");
				}
				System.out.println();
			}
                }
        }
}
/* 1 2 3
 * A B C
 * 4 5 6
 * D E H
 * */
