public class Laptope{
	String cpu="Intel";// variables
	int Ram=2;
	void laptopinfo(){ // method
		 System.out.println("Hello, World!"); 
	}
    public static void main(String[] args) {
		Laptope l= new Laptope();  // default constructor
		l.laptopinfo(); // calls method
		System.out.println(l.Ram); // calls variables
		System.out.println(l.cpu);  // calls variables
    }
}