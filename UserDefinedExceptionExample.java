package practical;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) throws InvalidAgeException {
        if (age < 0 || age > 100) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

public class UserDefinedExceptionExample {
    public static void main(String[] args) {
    	System.out.println("User Defined Exception:");
        try {
            Person person1 = new Person("Prakriti", 22);
            System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
            
            Person person2 = new Person("Aahana", -15);
            System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
        } 
        catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

