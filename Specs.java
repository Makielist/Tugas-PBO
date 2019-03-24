public class Specs
{
	public static void main (String []args)
	{
		Motor Specs = new Motor();
		
		Specs.setBrand("Honda");
		Specs.setType("CB 150R");
		Specs.setYear(2018);
		Specs.setEngine("1 Cylinder, 4 Stroke, DOHC, 4 valve");
		Specs.setCapacity(149.4);
		Specs.setPower(16.6);
		Specs.setTorque(13.8);
		Specs.setTopspeed(140);
		Specs.setCooling("Liquid");
		Specs.setFuelCapacity(12);
		Specs.setFrame("Diamond (Truss)");
		Specs.setFrontTyre("100/80");
		Specs.setRearTyre("130/70");
		Specs.setPrice(28000000);
		
		
		System.out.println("||\t\tSpesifikasi Motor\t\t");
		System.out.println("||Brand\t\t: "+Specs.getBrand());
		System.out.println("||Type\t\t: "+Specs.getType());
		System.out.println("||Year\t\t: "+Specs.getYear());
		System.out.println("||Engine\t: "+Specs.getEngine());
		System.out.println("||Capacity\t: "+Specs.getCapacity()+"cc");
		System.out.println("||Power\t\t: "+Specs.getPower()+"HP");
		System.out.println("||Torque\t: "+Specs.getTorque()+"Nm");
		System.out.println("||Top Speed\t: "+Specs.getTopspeed()+"KM/h");
		System.out.println("||Cooling System: "+Specs.getCooling());
		System.out.println("||Fuel Capacity\t: "+Specs.getFuelCapacity()+"L");
		System.out.println("||Frame\t\t: "+Specs.getFrame());
		System.out.println("||Front Tyre\t: "+Specs.getFrontTyre());
		System.out.println("||Rear Tyre\t: "+Specs.getRearTyre());
		System.out.println("||Price\t\t: Rp."+Specs.getPrice());	
		
		
	}
}