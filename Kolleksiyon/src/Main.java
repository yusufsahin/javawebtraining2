import model.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1= new Person(1,"John","Doe",30);
        Person p2= new Person(2,"Jane","Doe",27);
        Person p3= new Person(3,"Jack","Doe",8);

        List<Person> people= new ArrayList<>();

        people.add(p1);
        people.add(p2);
        people.add(p3);

        for (Person p:people) {
            System.out.println(p.getId()+"."+p.getLastname()+","+p.getFirstname()+" "+p.getAge());
        }


    }
}