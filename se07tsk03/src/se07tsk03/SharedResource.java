package se07tsk03;

import java.util.ArrayList;
import java.util.List;

public class SharedResource {
    private volatile List<Integer> list;
    private volatile boolean canRead;

    public SharedResource() {
	list = new ArrayList<Integer>();
    }

    public synchronized void setElement(Integer element) {
	list.add(element);
    }

    public synchronized Integer getELement() {
	if (list.size() > 0) {
	    return list.remove(0);
	}
	return null;
    }

    public synchronized boolean isCanRead() {
	return canRead;
    }

    public synchronized void setCanRead(boolean canRead) {
	this.canRead = canRead;
    }
}
