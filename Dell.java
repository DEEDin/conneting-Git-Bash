public class Dell{
	String cpu="intel i6"; //instance variable
	int ram=4; // static variable //static variables are used directly in static blocks..
void infos(){ // method
	String value="Bazinga"; // local variable
	System.out.println("This is Dell xps 2 in 1, " + value);
	}
public static void main(String[] args){
	Dell l=new Dell(); // default constructor
	l.infos();	// calls method
	System.out.println(l.cpu); // calls vairables
	System.out.println(l.ram); // calls variables
	}	
}