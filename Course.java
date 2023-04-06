package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Embedded;
import javax.persistence.Table;

@Entity(name = "entities.Course")
@Table(name = "CourseDetails")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "title", length = 50)
	private String title;
	@Column(name = "Coursefee", length = 50)
	private int Coursefee;
	@Embedded
	private Location l;
	public Course(int id, String title, int coursefee, Location l) {
		super();
		this.id = id;
		this.title = title;
		Coursefee = coursefee;
		this.l = l;
	}
	public Course() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCoursefee() {
		return Coursefee;
	}
	public void setCoursefee(int coursefee) {
		Coursefee = coursefee;
	}
	public Location getL() {
		return l;
	}
	public void setL(Location l) {
		this.l = l;
	}
	
}