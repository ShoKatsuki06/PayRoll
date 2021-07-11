package sample_main;

public class Workman {

	private String id;
	private String name;
	private String workplace;
	private int worksalary;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	public int getWorksalary() {
		return worksalary;
	}
	public void setWorksalary(int worksalary) {
		this.worksalary = worksalary;
	}

	public Workman(String id,String name,String workplace,int worksalary) {
		this.id = id;
		this.name = name;
		this.workplace = workplace;
		this.worksalary = worksalary;

	}
}
