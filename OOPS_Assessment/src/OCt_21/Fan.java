package OCt_21;
public class Fan {
	String name ;
	String coil;
	int wings;
	
	public Fan(String name, String coil, int wings) {
		this.name = name;
		this.coil = coil;
		this.wings = wings;
	}
	public void	switchOn (){
		System.out.println( name + "fan is now ON.");
	}
	public void switchOff () {
		System.out.println(name + "fan is now OFF.");
		
	}
	
	public void getFanDetails() {
		  System.out.println("Fan [Name: " + name + ", Coil: " + coil + ", Wings: " + wings + "]");
	}
	public static void main(String[] args) {
		Fan F = new Fan("Toffan", "Copper", 3);
		F.switchOff();
		F.switchOn();
		F.getFanDetails();
		
	}

}
