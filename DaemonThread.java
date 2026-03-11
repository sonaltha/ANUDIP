package prac2;
/*DaemonThread is thread which serivces to user thread & it have lowest priority
 * */
class isAliveMethod extends Thread{
	public void run() {
		try {
			Thread.sleep(50000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class YieldM extends Thread{
	public void run() {
		System.out.println(" hi it is me");
		Thread.yield();
	}
}
public class DaemonThread extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Thread is Daeomon");
		}
		else {
			System.out.println("This is not a Daemon Thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread t1=new DaemonThread();
		DaemonThread t2=new DaemonThread();
		DaemonThread t3=new DaemonThread();
		isAliveMethod t4=new isAliveMethod();
		
//		t3.setDaemon(true);
//		t3.start();
//		t1.start();
//		t2.start();
		System.out.println(t4.isAlive());
		t4.start();
		System.out.println(t4.isAlive());
	}

}
