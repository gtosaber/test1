package cn.itcast.demo1;

public class DeadLockDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLock dl=new DeadLock();
		Thread ta=new Thread(dl);
		Thread tb=new Thread(dl);
		ta.start();
		tb.start();
	}

}
