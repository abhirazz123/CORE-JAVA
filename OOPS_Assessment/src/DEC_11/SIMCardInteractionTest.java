package DEC_11;
interface SIMCardInterface{
	String getphonenumber();
	String getprovidername();
	void activate();
	void deactivate();
}
class Jio implements SIMCardInterface{
	private String phoneNumber;
	private boolean isActive = false;
	public Jio(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String getphonenumber() {
		return phoneNumber;
	}
	@Override
	public String getprovidername() {
		return "jio";
	}
	@Override
	public void activate() {
		isActive = true;
		System.out.println("Jio SIM activated.");

	}
	@Override
	public void deactivate() {
		isActive = false;
		System.out.println("Jio SIM deactivate.");

	}

}
class Airtel implements SIMCardInterface{
	private String phoneNumber;
	private boolean isActive = false;

	public Airtel(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String getphonenumber() {

		return phoneNumber;
	}

	@Override
	public String getprovidername() {
		return "Airtel";
	}

	@Override
	public void activate() {
		isActive = true;
		System.out.println("Airtel SIM activated.");

	}

	@Override
	public void deactivate() {
		isActive = false;
		System.out.println("Airtel SIM deactivate.");

	}
}
class BSNL implements SIMCardInterface{private String phoneNumber;
private boolean isActive = false;

public BSNL(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


@Override
public String getphonenumber() {

	return phoneNumber;
}

@Override
public String getprovidername() {
	return "BSNL";
}

@Override
public void activate() {
	isActive = true;
	System.out.println("BSNL SIM activated.");

}

@Override
public void deactivate() {
	isActive = false;
	System.out.println("BSNL SIM deactivate.");

}
}
interface	MobilePhoneInterface{
	void InsetSIM(SIMCardInterface sim);
	void RemoveSIM();
	void MakCALL(String number);
	void sendText(String number, String message);

}
class MobilePhone implements MobilePhoneInterface{
	private SIMCardInterface simCard;
	@Override
	public void InsetSIM(SIMCardInterface sim) {
		if(simCard != null) {
			System.out.println("A SIM is already inserted. Remove it first.");
		}else {
			simCard = sim;
			sim.activate();
			System.out.println(sim.getprovidername() + "  SIM inserted with number: " + sim.getphonenumber());
		}

	}

	@Override
	public void RemoveSIM() {
		if(simCard == null) {
			System.out.println("No SIM to remove.");
		}else {
			simCard.deactivate();
			System.out.println(simCard.getprovidername() + " SIM removed.");
			simCard = null;
		}

	}

	@Override
	public void MakCALL(String number) {
		if(simCard != null) {
			System.out.println("Calling " + number + " using " + simCard.getprovidername() + " SIM.");
		}else {
			System.out.println("Insert a SIM card fist to make a call.");
		}

	}

	@Override
	public void sendText(String number, String message) {
		if(simCard != null) {
			System.out.println("Sending message to " + number + ": " + message + " via " + simCard.getprovidername());
		}else {

			System.out.println("Insert a SIM card first to send a text.");
		}

	}

}
public class SIMCardInteractionTest {
	public static void main(String[] args) {
		 SIMCardInterface jio = new Jio("9876543210");
	        SIMCardInterface airtel = new Airtel("8765432109");
	        SIMCardInterface bsnl = new BSNL("7654321098");

	        MobilePhone phone = new MobilePhone();

	        phone.InsetSIM(jio);
	        phone.MakCALL("1234567890");
	        phone.sendText("1234567890", "Hello from Jio!");
	        phone.RemoveSIM();

	        phone.InsetSIM(airtel);
	        phone.MakCALL("1112223333");
	        phone.RemoveSIM();

	        phone.InsetSIM(bsnl);
	        phone.sendText("9998887777", "BSNL message test");
	        phone.RemoveSIM();
	}


}
