package demo;

public class Student implements Comparable<Student> {

	private int rno;
	private String name;
	private int marks;

	public Student(int rno, String name, int marks) {
		super();
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return this.rno + "\t" + this.name + "\t" + this.marks;
	}

	@Override
	public int compareTo(Student o) {
		if (this.marks > o.marks) {
			return -1;
		} else if (this.marks < o.marks) {
			return 1;
		}
		return 0;
	}

}
