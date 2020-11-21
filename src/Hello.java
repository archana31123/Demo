
interface Shape{
	void draw();
}
public class Hello  implements Shape{

	@Override
	public void draw() {		
		System.out.println("Circle...");
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, world! by Archana");
		methodoverloading obj = new methodoverloading();
		obj.funmethodoverloading();
		}

}
