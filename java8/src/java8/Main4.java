package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
    	List<User> users = new ArrayList<>();
    	 
        users.add(new User(1, "Amit", 50000.0));
        users.add(new User(2, "Priya", 60000.0));
        users.add(new User(3, "Rahul", 55000.0));
        users.add(new User(4, "Sneha", 70000.0));
        users.add(new User(5, "Vikram", 48000.0));
        users.add(new User(6, "Pooja", 62000.0));
        users.add(new User(7, "Rohit", 75000.0));
        users.add(new User(8, "Neha", 58000.0));
        users.add(new User(9, "Ankit", 54000.0));
        users.add(new User(10, "Kiran", 67000.0));
        
        /*users.stream().
        filter((e)->e.getSalary()>55000).
        forEach((u)-> System.out.println(u.toString()));*/
       // Collections.sort(users,(u1,u2)-> u1.getName().compareTo(u2.getName()) ); 
       // users.forEach((e)-> System.out.println(e.toString()));
        //Collections.sort(users, (u1, u2) -> Double.compare(u1.getSalary(), u2.getSalary()));
        //users.forEach((e) -> System.out.println(e.toString()));
     //users.stream().max((u1,u2)-> Double.compare(u1.getSalary(),u2.getSalary()));
        System.out.println( users.stream().max((u1,u2)-> Double.compare(u1.getSalary(),u2.getSalary())));


    }
}