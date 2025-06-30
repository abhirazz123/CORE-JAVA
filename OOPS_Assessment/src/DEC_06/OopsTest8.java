package DEC_06;

class NIT8 {
    String name;

    public NIT8(String name) {
        this.name = name;
    }
}

class NITIII extends NIT8 {
    String programmingLanguage;

    public NITIII(String name, String programmingLanguage) {
        super(name);
        this.programmingLanguage = programmingLanguage;
    }
}

class NITIV extends NIT8 {
    String faculty;

    public NITIV(String name, String faculty) {
        super(name);
        this.faculty = faculty;
    }
}

public class OopsTest8 {
    public static void main(String[] args) {
        NIT8 nit = new NIT8("Project");
        System.out.println(nit.name + " ");

        NITIII nit3 = new NITIII("JAVA", "NareshIT");
        System.out.println(nit3.name + " " + nit3.programmingLanguage);

        NITIV nit4 = new NITIV("Naidu", "Narayana"); 
        System.out.println(nit4.name + " " + nit4.faculty);
    }
}
