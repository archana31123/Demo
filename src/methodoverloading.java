public class methodoverloading implements Shape {

    // this method accepts int
    public void display(int a){
        System.out.println("Got Integer data.");
    }

    // this method  accepts String object
    public  void display(String a){
        System.out.println("Got String object.");
    }

    public void funmethodoverloading() {
        display(1);
        display("Hello");
    }
    public void functionoverriding() {
    	
    }

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("rectangle...");
		
	};
}