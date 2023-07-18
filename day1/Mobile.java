package week1.day1;


public class Mobile {

	public void makeCall() {
		System.out.println("Make calls");
	}
	
	void sendMsg()  {
		System.out.println("Send Msg");
	}
	  public static void Mobilemodel(String name, float weight) {
		
		  System.out.println(name+"\n"+weight);
	  }
	  public static void Fullycharged(boolean fullycharged, int cost) {
	
		  System.out.println(fullycharged+"\n"+cost);
	  }
	  
	  
	  public static void main(String[] args) {
		Mobile n=new Mobile();
		System.out.println("This is my mobile");
		n.makeCall();
		n.sendMsg();
		n.Mobilemodel("Mobile name Samsung Galaxy", 1.1f);
		n.Fullycharged(true, 13000);
	  }
	}
	  
	
	  
		
		
