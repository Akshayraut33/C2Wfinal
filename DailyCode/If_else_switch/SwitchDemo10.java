class SwitchDemo10{
        public static void main(String [] args){
                float num=1.5f;
                System.out.println("Before Switch");
                switch(num){
                        case 1.5:
                        System.out.println("1.5");
                        break;
                        case 2.0:
                        System.out.println("2");
                        break;
                        case 2.5:
                        System.out.println("2.5");
                        break;
                        default:
                        System.out.println("In default state");
                }
                System.out.println("After Switch");
        }
}
