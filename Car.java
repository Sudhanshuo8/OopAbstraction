package interface1;

class Car implements Vehicles,Motors{
	
	
	public void Start()
	{
		System.out.println("Starts without kick");
	}
    
	public void Play()
	{
		System.out.println("porsh motors");
	}
	

}
