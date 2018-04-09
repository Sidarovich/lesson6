package epm.com.jdk3;

public class Example8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group gr = new Group(15);
		final GroupLogic grLogic = new GroupLogic();
		final StudentLojic stLogic = new StudentLojic();
		Student st1 = new Student("Ivan", "Ivanov", 5);
		st1.setMark(4.0);
		st1.setMark(5.0);
		Student st2 = new Student("Vasia", "Pupkin", 5);
		st2.setMark(5.1);
		st2.setMark(5.1);
		Student st3 = new Student("Petia", "Sidorov", 5);
		st3.setMark(2.0);
		st3.setMark(4.0);
		gr.add(st1);
		gr.add(st2);
		gr.add(st3);
		System.out.println(" количество студентов в группе : " + gr.getCountOfStudents());
		System.out.println("a) средний балл учебной группы : " + grLogic.getAvrMark(gr));
		
		System.out.println("б) средний балл каждого студента : ");
		int countst=0;
		for (Student s : gr.getStudents()) {
			if (countst<gr.getCountOfStudents()) {
			System.out.println(" " + s.getSurname() + " " + s.getName() + " : " + stLogic.getAvrMark(s));
			countst++;
			} else {break;};
		}
		System.out.println("в) число отличников : " + grLogic.getCountAStudent(gr));
		System.out.println("г) количество студентов, имеющих \"2\": " + grLogic.getCountBadStudent(gr));
	}

}