
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockedWorker implements Runnable{

	private BlockedWorker nextWorker;
	BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<Integer>();
	int [] input;
	int count;
	public BlockedWorker(int [] input) {
		this.input = input;
	}
	public void setNextWorker(BlockedWorker nextWorker) {
		this.nextWorker = nextWorker;
	}
	
	public void startWork() {
		
		try {
			if(count < input.length) {
				blockingQueue.put(input[count]);
				count++;
			}
			
		} catch (InterruptedException e) {
		}
	}

	@Override
	public void run() {
		try {
			while(count < input.length) {
				int popVal = blockingQueue.take();
				System.out.println(Thread.currentThread().getName()+": "+popVal);
				Thread.sleep(10);
				nextWorker.startWork();
			}
			
		} catch (InterruptedException e) {
		}
		
	}
}
