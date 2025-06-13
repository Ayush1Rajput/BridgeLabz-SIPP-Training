

public class PenDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    
	}

}
