class SwitchDemo5{
        public static void main(String [] args){
                int num=2;
                System.out.println("Before Switch");
                switch(num){
                        case 1:
                        System.out.println("One");
			break;
                        case 2:
                        System.out.println("Two");
			break;
                        case 3:
                        System.out.println("Three");
			break;
			default:
			System.out.println("In default state");
                }
                System.out.println("After Switch");
        }
}

