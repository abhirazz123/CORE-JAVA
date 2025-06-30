package DEC_06;

class NIT7 {
    public int nit() {
        return 10;
    }

    protected int nit1() {
        return 5;
    }
}

class NITI extends NIT7 {
    @Override
    public int nit() {
        return super.nit(); // returns 10
    }

    public int nit1() {
        return 15;
    }

    private int nit2() {
        return 20;
    }
}

class NITII extends NITI {
    @Override
    public int nit() {
        return 0;
    }
//     int nit1() {
//		return 50;
//    	
//    }
}

public class OopsTest7 {
    public static void main(String[] args) {
        NIT7 object = new NIT7();     
        NIT7 object1 = new NITI();    
        NIT7 object2 = new NITII();    
        NITI object3 = new NITII();   

        System.out.println(
            object.nit()     // NIT7.nit() → 10
          + object1.nit1()   // NITI.nit1() → 15
          + object1.nit()    // NITI.nit() → NIT7.nit() → 10
          + object3.nit1()   // NITI.nit1() → 15
          + object2.nit1()   // NITI.nit1() → 15
        );
        // Total: 10 + 15 + 10 + 15 + 15 = 65
    }
}
