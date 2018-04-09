package epm.com.jdk3;

public class GroupLogic {
	 private final StudentLojic stLojic = new StudentLojic();
	 private static final int MAX_MARK = 5;
	public double getAvrMark(Group gr) {
		double avr = 0;
		  for (Student st : gr.getStudents()) {
			   if (st != null) {
			    avr = avr + stLojic.getAvrMark(st)			;
			   }
			  }

			  avr = avr / gr.getCountOfStudents();

			  return avr;
			 }
	
	 public int getCountAStudent(Group gr) {
		  int count = 0;
		  int i = 0;
		  for (Student st : gr.getStudents()) {
			  i++;
		   if (st.equals(null)) {
		    return count;
		   }
//			System.out.println("сравнивается : " + i + " из " + gr.getCountOfStudents() + stLogic.getAvrMark(st) + " найдено " + count);
		   if (stLojic.getAvrMark(st) >= MAX_MARK) {
		    count++;
		   }
//		System.out.println("сравнивается : " + i + " " + stLogic.getAvrMark(st));
		   		   if (i>gr.getCountOfStudents()-1) {
		   				  return count;
		  		   }
		  }

		  return count;
		 }
	 
	 public int getCountBadStudent(Group gr) {
		  int count = 0;
		  int i = 0;
		  for (Student st : gr.getStudents()) {
			  i++;
		   if (st.equals(null)) {
		    return count;
		   }

		   if (stLojic.getbadMarks(st)) {
		    count++;
		   }

		   		   if (i>gr.getCountOfStudents()-1) {
		   				  return count;
		  		   }
		  }

		  return count;
		 }
	 
}

