package java8;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class main3 {
	public static void main(String args[]) {
	int arr[]= {3,5,7,8,9,1,4,6};
	Arrays.stream(arr).
	forEach((i)->System.out.println(i));
	
	Arrays.stream(arr).
	filter((i)->i%2==0).
    forEach((i)->System.out.println(i));
	
	int salary[]= {300000,10000,1000,57000,78000};
	 Arrays.stream(salary).
	 filter((sal)->sal>50000).
	 forEach((sal)->System.out.println(sal));
	 
	 String names[]= {"alt ","  hema","maha  "};
	 Arrays.stream(names).forEach((name)->System.out.println(name.trim()));
	 
	List<Double> salaries = new ArrayList<>();
     salaries.add(55000.0);
     salaries.add(60000.0);
     salaries.add(7000.0);
     salaries.add(84000.0);
     salaries.add(90000.0);

     salaries.stream()
             .map(sal -> sal * 1.05)
             .forEach(salBon -> System.out.println("Sal with 5% Bon: " + salBon)); 
	 


}
	
}
