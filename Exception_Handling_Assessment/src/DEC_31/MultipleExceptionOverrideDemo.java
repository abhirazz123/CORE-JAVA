package DEC_31;

class ParentClass {
    public void loadingClass(String className) throws ClassNotFoundException {
        // Attempt to load the class
        Class<?> cls = Class.forName(className);
        System.out.println("Class loaded successfully: " + cls.getName());
    }
}

class ChildClass extends ParentClass {
    @Override
    public void loadingClass(String className) {
        if (className == null || className.trim().isEmpty()) {
            throw new IllegalArgumentException("Class name cannot be empty");
        }

        try {
            super.loadingClass(className);
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading class in ChildClass. Converting to unchecked exception.");
            throw new RuntimeException("Unchecked Exception: RuntimeException from ChildClass", e);
        }
    }
}

public class MultipleExceptionOverrideDemo {
    public static void main(String[] args) throws IllegalArgumentException {
        ChildClass child = new ChildClass();

        if (args.length == 0) {
            System.out.println("Please provide a class name as a command-line argument.");
            return;
        }

        String inputClassName = args[0];

        try {
            child.loadingClass(inputClassName);
        } catch (RuntimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
