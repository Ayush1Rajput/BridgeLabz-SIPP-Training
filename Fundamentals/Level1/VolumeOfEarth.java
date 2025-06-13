package Fundamentals.Level1;


class VolumeOfEarth{
	public static void main (String [] args){
		//Create a variable to store radius of earth in km.
		int radius = 6378;
		
		//Compute volume of earth and store in volume variable
		double volumeInKilometers = Math.PI * Math.pow(radius,3) * 4/3;
		double volumeInMiles = volumeInKilometers * 1.6 ;
		
		//Display volume of earth
		System.out.println("The volume of earth in cubic kilometers is "+volumeInKilometers
			+" and cubic miles is "+ volumeInMiles );
	}
}
