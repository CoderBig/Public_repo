package Super_and_This;

public class This_keyword extends Sample1 {
int a =20; // Global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_keyword tk = new This_keyword();
		tk.try1();
	}
void try1() 
{int a =10;
System.out.println(a);
System.out.println(this.a);// Global variable is called using "THIS" KEYWORD
System.out.println(super.a);/* variable from other class is called using "SUPER" KEYWORD
                     It is INHERITED from sample1         
*/
}
}
