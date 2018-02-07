package cn.itcast.demo1;

public class DeadLock implements Runnable{
	private int i=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			if(i%2==0){
				synchronized (LockA.locka) {
					System.out.println("if....locka");
					synchronized (LockB.lockb) {
						System.out.println("if....lockb");
					}
				}
			}else{
				synchronized (LockB.lockb) {
					System.out.println("else.....lockb");
					synchronized (LockA.locka) {
						System.out.println("else....locka");
					}
				}
			}
			i++;
		}
	}

}
