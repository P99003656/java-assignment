package project1;

import java.util.Date;

public class Player {
private String name;
private Date dateOfBirth;
private String skill;
private int noOfMatches;
private int runs;
private int wickets;
private String nationality;
private Double powerRating;


public Player() {
	super();
	// TODO Auto-generated constructor stub
}
public Player(String name, Date dateOfBirth, String skill, int noOfMatches, int runs, int wickets, String nationality,
		Double powerRating) {
	super();
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.skill = skill;
	this.noOfMatches = noOfMatches;
	this.runs = runs;
	this.wickets = wickets;
	this.nationality = nationality;
	this.powerRating = powerRating;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getSkill() {
	return skill;
}
public void setSkill(String skill) {
	this.skill = skill;
}
public int getNoOfMatches() {
	return noOfMatches;
}
public void setNoOfMatches(int noOfMatches) {
	this.noOfMatches = noOfMatches;
}
public int getRuns() {
	return runs;
}
public void setRuns(int runs) {
	this.runs = runs;
}
public int getWickets() {
	return wickets;
}
public void setWickets(int wickets) {
	this.wickets = wickets;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public Double getPowerRating() {
	return powerRating;
}
public void setPowerRating(Double powerRating) {
	this.powerRating = powerRating;
}
@Override
public String toString() {
	return "Player [name=" + name + ", dateOfBirth=" + dateOfBirth + ", skill=" + skill + ", noOfMatches=" + noOfMatches
			+ ", runs=" + runs + ", wickets=" + wickets + ", nationality=" + nationality + ", powerRating="
			+ powerRating + "]";
}




}
