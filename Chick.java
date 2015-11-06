class Chick implements Animal 
{     
    private String myType;
	private String mySound;

	public Chick(String type, String sound){
		myType=type;
		mySound=sound;
	}
	public Chick(){
		double n=Math.random();
		myType="chick";
		if(n<=0.5)
			mySound="cluck";
		else
			mySound="cheep";
	}
	public String getSound(){return mySound;}
	public String getType(){return myType;}
}