
public class Job {

	private String name;
	private String category;
	
	
	//constructeur
	public Job(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	//getters et setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
		
	}
}
