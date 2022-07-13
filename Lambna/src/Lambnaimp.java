import java.util.ArrayList;
import java.util.List;

interface Greeting{
	public String say();
}
interface Good{
	public String ask();
}
interface Add{
	public int addition(int a);
}
interface Concat{
	public String concat(String a,String b);
}
public class Lambnaimp {

	public static void main(String[] args) {
		Greeting obj=()->{	return "Ata Maaji Satakli !"
				+ "";	};		// Lambna Function
		System.out.println(obj.say());
		
		Good objt=()->{ return "Baburao Rocks !! ";};
		System.out.println(objt.ask());
		
		Add num=(number)->number+5;
		System.out.println("Age of Baburao "+num.addition(55));
	
		Concat naam=(first,last)-> first+" "+last;
		System.out.println("Baburao Ka beta "+ naam.concat("Chulbul", "Panday"));
		
		String[] students ={"Rahul","Ajay","Shankar","Vishesh","Khushi"};
			
		List<String> student=new ArrayList<String>();
		
		for(String name:students) {
			System.out.println(name);
			student.add(name);}
		System.out.println("+++++++++++++++lambna++++++++++++");
		
		student.forEach((Naam)->System.out.println(Naam));
	}
	

}
