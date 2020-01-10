public class HelloWorld {
	void execute(){
		 System.out.println("Hello, World!"); 
	}
	void info(){
		 System.out.println("Hello,"); 
	}
    public static void main(String[] args) {
      HelloWorld l = new HelloWorld();
	  HelloWorld i = new HelloWorld();
		l.execute();
		i.info();
    }
}