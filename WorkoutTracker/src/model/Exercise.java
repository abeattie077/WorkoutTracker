package model;

public class Exercise {
	//Attributes
	private String name;
	private String description;
	private int reps;
	private double weightLBS;
	private double weightKG;
	
	//Constructors
	public Exercise() {
		this.name = "";
		this.description = "";
	}
	public Exercise (String name, String description, int reps, double weight, boolean isLBS) {
		setName(name);
		setDescription(description);
	}
	
	//Getters
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.description;
	}

	//Setters
	public void setName(String name) {
		if (name == null && name.strip().isEmpty()) {
			throw new IllegalArgumentException("The name cannot be empty.");	
		}
		else {
			this.name = name.strip();
		}
	}
	public void setDescription(String description) {
		if (description == null && description.strip().isEmpty()) {
			throw new IllegalArgumentException("The description cannot be empty");	
		}
		else {
			this.description = description.strip();
		}
	}
}
