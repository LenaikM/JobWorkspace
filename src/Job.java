import java.util.ArrayList;

public class Job {

	public static void main(String[] args) {
		
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("ligne 1");
		liste.add("ligne 2");
		liste.add("ligne 3");
		liste.add("ligne 5");
		liste.add("ligne 6");
		
		
		for(String l : liste) {
			System.out.println(l);
		}
	}
}
