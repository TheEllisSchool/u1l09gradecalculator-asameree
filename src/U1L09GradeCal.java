import java.util.ArrayList;

import javax.swing.JOptionPane;
public class U1L09GradeCal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create array list
		ArrayList<Double> grades = new ArrayList<Double>();
		Double sGrade = 0.0;
		while (sGrade != -1){
		String input = JOptionPane.showInputDialog(null, "Add one Grade (Percent): ");
		sGrade = Double.parseDouble(input);
		
		if (sGrade == -1) {
			break;
		}else
			grades.add(sGrade);
		}
		
		//String letterGrade;
		System.out.println(grades);
		//find the average in everything in the list

		//find the lowest score using the loop save the index of the lowest value
		Double average = average(grades);
		String letterGrade = letterGRADe(average);
		System.out.println("avg: " + average + " grade: " + letterGrade);
		
		double lowVal = 110.0;
		
			for (int i = 0; i < grades.size(); i++) {
			
			int index;
			if (grades.get(i) < lowVal) {
				lowVal = grades.get(i);
			}
		}
			
		
		//remove the lowest --> score grades.remove(index)
		if (grades.contains(lowVal)){
			grades.remove(lowVal);
		}else {
			grades.remove(lowVal);
		}
		System.out.println(grades);
			//then calculate the average
		/*
		for (int i = 0; i < grades.size(); i++) {
			total = total + grades.get(i);
			System.out.println("total " + total);
			average = total/grades.size();
			letterGrade = letterGRADe (average);
			System.out.println("avg " + average + "grade " + letterGrade);
		}
		*/
		average = average(grades);
		letterGrade = letterGRADe(average);
		System.out.println("avg: " + average + " grade: " + letterGrade);
	}
	//String letterGrade;
	
	public static double average (ArrayList grades){
		double total = 0;
		double average = 0;
		for (int i = 0; i < grades.size(); i++) {
			total = total + (double) grades.get(i);
			average = total/grades.size();
			//String letterGrade = letterGRADe (average);
			//System.out.println("avg" + average + "grade" + letterGrade);
		}
			return average;
	}
	public static String letterGRADe (double average){
		String letterGrade;
		if (average > 90){
		letterGrade = "A";
		}
		
		ElseIf (average > 80);{
		letterGrade = "B";
		}
		
		ElseIf (average > 70);{
		letterGrade = "C";
		} 
		
		ElseIf (average > 60);{
		letterGrade = "D";
		}
		if (average < 50){
		letterGrade = "F";
		}
		return letterGrade;
	}

	private static void ElseIf(boolean b) {
		// TODO Auto-generated method stub
		
	}
}


