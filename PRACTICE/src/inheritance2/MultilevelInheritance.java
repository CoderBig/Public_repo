package inheritance2;

public class MultilevelInheritance {

	public static void main(String[] args) {
		WhatsApp3 w3 = new WhatsApp3();
		w3.textmsg();
		w3.audiocall();
		w3.videocall();
		
		System.out.println("*****************************");
		
		WhatsApp2 w2 = new WhatsApp2();
w2.textmsg();
w2.audiocall();
System.out.println("*****************************");

WhatsApp1 w1 = new WhatsApp1();
w1.textmsg();
	}

}
