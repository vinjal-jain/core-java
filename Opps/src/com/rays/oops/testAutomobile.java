package com.rays.oops;

public class testAutomobile {
	public static void main(String[] args) {
		
		automobile a = new automobile();
		
		a.setCarname("MUSTANG 1969");
		a.setColour("Black");
		a.setModeldetails("The 1969 model year restyle added more heft to the body\" with body length extended by 3.8 inches (97 mm) (the wheelbase remaining at 108 inches), width increased by almost half an inch, and the Mustang's \"weight went up markedly too\". 1969 was the first model to use quad headlamps placed both inside and outside the grille opening. The corralled grille pony was replaced with the pony and tribars logo, set off-center to the drivers side. The car was longer than previous models and sported convex rather than concave side panels. The fastback body version was renamed Sportsroof, styled as SportsRoof in Ford's literature.");
		a.setHorsepower("335 hp at 5200 rpm");
		a.setSpeedupto(450);
		a.setGear(6);
		
		System.out.println("Carname:-" + a.getCarname());
		System.out.println("Colour:-"+ a.getColour());
		System.out.println("Details:-"+ a.getModeldetails());
		System.out.println("Horsepower:-"+ a.getHorsepower());
		System.out.println("speedupto:-"+ a.getSpeedupto());
		System.out.println("Total Gear in this monster is :-"+ a.getGear() );
		
		
		a.setGear(-1);
		
		System.out.println("Monster in gear:-" + a.gear);
		
		if (a.getGear() == 1) {
			
			System.out.println("Getting Warm up");
			
		}else if (a.getGear()== 2 ) {
			
			System.out.println("Ready to go fly");
		}else if (a.getGear()== 3 ) {
			
			System.out.println("Taking off ");
			
		}else if (a.getGear()== 4 ) {
			
			System.out.println("Flying mode");
			
		}else if (a.getGear()== 5 ) {
			
			System.out.println("Beast Boost");
			
		}else if (a.getGear()== -1 ) {
			
			System.out.println("piche nikal le ");
		}
		
	}

}
