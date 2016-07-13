
public class Main {

	public static void main(String args[]){
		Thread t = new Thread(new Runnable(){
			public void run(){
				new Main().method();
			}
		});
		
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				new Main().method();
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				new Main().method();
			}
		});
		
		t.start();
		t1.start();
		t2.start();
		
	}
	
	void method(){
		synchronized(Main.class){
			
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println(" inside synchronized block");
		}
	}
}

enum Employee{
	Lavan,Kumar;
	 String s="";
	
	Employee(){
		s = "";
	}
}