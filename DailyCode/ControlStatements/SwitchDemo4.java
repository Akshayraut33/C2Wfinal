class SwitchDemo5{
	public static void main(String [] args){
		String friends="Kanha";
                System.out.println("Before Switch");	
		switch(friends){
			case "Ashish":
			System.out.println("Ashish");
			break;
			case "Kanha":
			System.out.println("BMC Software");
			break;
			case "Rahul":
			System.out.println("Infosys");
			break;
			case "Badhe":
			System.out.println("IBM");
			break;
			default:
			System.out.println("Default state");
		}
		System.out.println("After switch");
	}
}
