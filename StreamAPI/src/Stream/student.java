package Stream;

public class student {
	int id;
	String name;
	double marks;
	
	public student() {
		
	}

	public student(int id, String name, double marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof student) {
			return ((student)o).id ==this.id;
			
		}
		return false;
		
	}
	
	
	
	

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
   

}
 