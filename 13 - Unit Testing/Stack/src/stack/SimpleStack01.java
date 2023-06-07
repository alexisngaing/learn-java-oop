package stack;

/**
 *
 * @author yamacat
 */
public class SimpleStack01 {
    private int[] arr = null;
    private int MAX = 5;
    private int top = -1;
    private int size = 0;

    public SimpleStack01 () {
	     this.arr = new int[MAX];
    }
    public boolean isFull() {
	     return (size == MAX); //top==MAX-1
    }

    public boolean isEmpty() {
	     return (size == 0); //top==-1
    }

    public int getSize() {
        return size;
    }

    public String push(int e) {
	     if (isFull())
            throw new IllegalArgumentException("Stack Overflow");

	     size++;
	     arr[++top] = e;
        return "Element " + e + " inserted succesfully";
    }

    public int pop() {
        int result;
	     if(isEmpty()){
            throw new java.util.NoSuchElementException("Stack Underflow");
	     }
	     size--;
	     result = arr[top];
	     this.top--;
	     return result;
    }
}
