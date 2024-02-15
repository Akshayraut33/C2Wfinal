class SwitchDemo3{
	public static void main(String []args){
		char data='B';		
		System.out.println("Before switch");
		switch(data){
			case 'A':
			System.out.println("A");
			break;
			case 'B':
			System.out.println("B");
			break;
			/*case 66:
			System.out.println("66");*/
			//Duplicate not accepted
			case 'C':
			System.out.println("C");
			break;
			default:
			System.out.println("Default state");
		}
		System.out.println("After switch");
	}
}
