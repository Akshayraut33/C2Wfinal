class SwitchDemo2{
	public static void main(String [] args){
		int num = 2;
		System.out.println("Before Switch");
		switch(num){
			case 1:
			System.out.println("1");
			break;
			case 2:
			System.out.println("2");
			break;
			case 3:
			System.out.println("3");
			break;
			default:
			System.out.println("Default state");
		}
		System.out.println("After switch");
	}
}
