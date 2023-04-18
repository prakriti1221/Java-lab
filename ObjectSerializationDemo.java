package filehandling;

import java.io.*;

public class ObjectSerializationDemo {
  public static void main(String[] args) {
    // Create an object to serialize
    Person person = new Person("Prakriti", 22);

    // Serialize the object to a file
    try {
      FileOutputStream fo = new FileOutputStream("person.ser");
      ObjectOutputStream out = new ObjectOutputStream(fo);
      out.writeObject(person);
      out.close();
      fo.close();
      System.out.println("Serialized data saved in person.ser");
    } 
    catch (IOException e) {
      e.printStackTrace();
    }

    // Deserialize the object from the file
    try {
      FileInputStream fin = new FileInputStream("person.ser");
      ObjectInputStream in = new ObjectInputStream(fin);
      Person deserializedPerson = (Person) in.readObject();
      in.close();
      fin.close();
      System.out.println("Deserialized data:");
      System.out.println(deserializedPerson);
    } 
    catch (IOException e) {
      e.printStackTrace();
    } 
    catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}

@SuppressWarnings("serial")
class Person implements Serializable {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + "]";
  }
}

