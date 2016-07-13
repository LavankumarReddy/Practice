
public class BlockedTest {

	public static void main(String[] args) {
		
		int [] arr1 = {1, 5, 9, 13, 17, 21, 25, 29};
		int [] arr2 = {2, 6, 10, 14, 18, 22, 26, 30};
		int [] arr3 = {3, 7, 11, 15, 19, 23, 27, 31};
		int [] arr4 = {4, 8, 12, 16, 20, 24, 28, 32};
		
		BlockedWorker worker1 = new BlockedWorker(arr1);
		BlockedWorker worker2 = new BlockedWorker(arr2);
		BlockedWorker worker3 = new BlockedWorker(arr3);
		BlockedWorker worker4 = new BlockedWorker(arr4);
		
		worker1.setNextWorker(worker2);
		worker2.setNextWorker(worker3);
		worker3.setNextWorker(worker4);
		worker4.setNextWorker(worker1);
		
		
		Thread t1 = new Thread(worker1, "T1");
		Thread t2 = new Thread(worker2, "T2");
		Thread t3 = new Thread(worker3, "T3");
		Thread t4 = new Thread(worker4, "T4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		worker1.startWork();

	}

}
