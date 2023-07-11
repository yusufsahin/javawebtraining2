import model.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        try {

            Person person = new Person(1, "John", "Doe", 30);
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.ser"));
            outputStream.writeObject(person);
            outputStream.close();

            ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("person.ser"));
            Person restoredPerson= (Person) inputStream.readObject();

            System.out.println("Id : "+ restoredPerson.getId());
            System.out.println("Firstname : "+ restoredPerson.getFirstname());
            System.out.println("Lastname : "+ restoredPerson.getLastname());
            System.out.println("Age : "+ restoredPerson.getAge());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}