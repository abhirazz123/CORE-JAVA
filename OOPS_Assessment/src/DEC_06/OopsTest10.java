package DEC_06;
class NITX {
    static String val = "NareshIT";  // ✅ made static
    String language;
    String faculty;
    String student;

    public NITX(String language, String faculty, String student) {
        this.faculty = faculty;
        this.language = language;
        this.student = student;
    }

    static public String get() {
        return val;  // ✅ works now
    }

    public void getValues() {
        // ✅ use instance variables via `this`
        System.out.println(this.faculty + " " + this.language + " " + this.student);
    }
}

class OopsTest10 {
    public static void main(String[] args) {
        System.out.println("Welcome to " + NITX.get());  // Welcome to NareshIT
        NITX obj = new NITX("Java", "Naresh", "IT");
        obj.getValues();  // Naresh Java IT
    }
}
