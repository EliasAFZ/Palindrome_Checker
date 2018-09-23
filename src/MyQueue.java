import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * holds all the abstract methods and cleaner implementaion to manage Queue
 * @author Elias
 */
public class MyQueue implements Queue {

    private char[] queueArray;
    private int queueSize;
    private char queueOutput;
    private int front, rear, numberOfItems;

    /**
     * constructor initializes data
     */
    MyQueue() {
        front = rear = numberOfItems = 0;
        queueSize = 1;
        queueArray = new char[queueSize];
        
    }
    
    /**
     * add method adds a char to the queue array and maintains size if needed
     * @param input
     */
    public void add(char input) {
        if (rear == queueSize) {
            queueSize = queueSize * 2;
            char[] newArray = new char[queueSize];
            System.arraycopy(queueArray, 0, newArray, 0, rear);
            queueArray = newArray;
        }
        if (rear != queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
        }
    }

    /**
     * removes and returns value at the front of the queue
     * @return queueOutput
     */
    @Override
    public Object remove() {
        if (numberOfItems > 0) {
            queueOutput = queueArray[front];
            front++;
            numberOfItems--;
        }
        return queueOutput;
    }

    @Override
    public boolean offer(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object poll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object element() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray(Object[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
