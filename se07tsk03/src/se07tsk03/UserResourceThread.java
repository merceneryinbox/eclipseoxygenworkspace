package se07tsk03;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UserResourceThread {

    public static void main(String[] args) throws InterruptedException {
	Lock rLock = new ReentrantLock();
	SharedResource res = new SharedResource();
	IntegerSetterGetter t1 = new IntegerSetterGetter("1", res);
	IntegerSetterGetter t2 = new IntegerSetterGetter("2", res);
	IntegerSetterGetter t3 = new IntegerSetterGetter("3", res);
	IntegerSetterGetter t4 = new IntegerSetterGetter("4", res);
	IntegerSetterGetter t5 = new IntegerSetterGetter("5", res);
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	Thread.sleep(100);
	t1.stopThread();
	t2.stopThread();
	t3.stopThread();
	t4.stopThread();
	t5.stopThread();
	t1.join();
	t2.join();
	t3.join();
	t4.join();
	t5.join();
	System.out.println("main");
    }
}

class IntegerSetterGetter extends Thread {
    private volatile SharedResource resource;
    private boolean run;
    private Random rand = new Random();

    Lock rLock = new ReentrantLock();

    public IntegerSetterGetter(String name, SharedResource resource) {
	super(name);
	this.resource = resource;
	run = true;
    }

    public void stopThread() {
	run = false;
    }

    @Override
    public void run() {
	int action;
	rLock.lock();
	try {
	    while (run) {
		action = rand.nextInt(1000);
		if (action % 2 == 0) {
		    getIntegersFromResource();
		} else {
		    setIntegersIntoResource();
		}
	    }
	    rLock.unlock();
	    System.out.println("Поток " + getName() + " завершил работу.");
	} catch (InterruptedException e) {

	    e.printStackTrace();
	}
    }

    private synchronized void getIntegersFromResource() throws InterruptedException {
	Integer number;
	rLock.lock();
	try {
	    System.out.println("Поток " + getName()
			       + " хочет извлечь число.");
	    number = resource.getELement();
	    while (number == null && !resource.isCanRead()) {
		System.out.println("Поток " + getName()
				   + " ждет пока очередь заполнится.");

		resource.wait();
		System.out
			  .println("Поток " + getName() + " возобновил работу.");
		number = resource.getELement();
	    }
	    rLock.unlock();
	    System.out
		      .println("Поток " + getName() + " извлек число " +
			       number);
	    resource.setCanRead(false);
	} catch (Exception eIgnore) {
	    // TODO: handle exception
	}
    }

    private synchronized void setIntegersIntoResource() throws InterruptedException {
	Integer number = rand.nextInt(500);
	rLock.lock();
	try {
	    if (!resource.isCanRead()) {
		resource.setElement(number);
		System.out.println("Поток " + getName() + " записал число "
				   + number);
		rLock.unlock();
		resource.notify();
	    }
	} catch (Exception eIgnore) {
	}
    }
}