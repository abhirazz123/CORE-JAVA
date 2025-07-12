package DEC_14;


public interface NIT14 {
    String myInterface(String a);   // ✅ Abstract method

    @Override
    String toString();              // ✅ Inherited from Object (doesn't count)
    
    // ❌ wait() and notify() removed
}
