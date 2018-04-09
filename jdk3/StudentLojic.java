package epm.com.jdk3;

public class StudentLojic {
public double getAvrMark(Student st) {
	double avr =0;
	  for(double d : st.getMarks()) {
		   avr = avr + d;	
}
	  
	  avr = avr/st.getCountOfMarks();
	  
	  return avr; 
}
public boolean getbadMarks(Student st) {
	boolean isbadMarks = false;
	int i = 0;
	  for(double d : st.getMarks()) {
		  i++;
		  if (d<2.1 ) {
			  isbadMarks=true;
			  return isbadMarks; 
		  }
		  if (i>=st.getCountOfMarks() ) {
			  return isbadMarks; 
		  }
}
	  
	  return isbadMarks; 
}
}