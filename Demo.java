class OS {
	OS(){
		System.out.println("OS is installed");
	}
	void checkOS() {
		System.out.println("OS is still executing");
	}

}
class Chargerr{
	String name;
	Chargerr(String s){
		name= s;
		System.out.println("Charger created");
	}
	void getCharger() {
		System.out.println("Charger can be used for charging");
	}
}
class Mobilee{
	OS o = new OS();
	Mobilee(){
		System.out.println("Mobile is Created with OS installed");
	}
	void hasA(Chargerr c)
	{
		System.out.println("Charger acquired");
		System.out.println("Chargerused for charging");
		
	}
	
}
class Demo{
	public static void main(String[] args)
	{
		Mobilee m= new Mobilee();
		Chargerr c = new Chargerr("iphone");
		m.hasA(c);
		m.o.checkOS();
		c.getCharger();
		System.out.println();
		m=null;
		System.out.println(m);
		c.getCharger();
				
	}
	
}