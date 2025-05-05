package NOV_18.Access_modifiers.M2;

import NOV_18.Access_modifiers.M1.Test;
public class ELC extends Test{
	public static void main(String[] args) {
		ELC E = new ELC();
		System.out.println("x: "+E.x);
		//x variable is accessible because declared withProtected AM. 
		
	}

}
