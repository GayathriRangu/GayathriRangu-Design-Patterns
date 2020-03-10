package adapterImplementation;

public class School {

	public static void main(String[] args) {
	Pen pen=new PenAdapter();
		AssignmentWork assignment=new  AssignmentWork();
		assignment.setPen(pen);
assignment.writeAssignment("I am tired to write the assig");

	}

}
