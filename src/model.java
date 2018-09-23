import java.util.Stack;

/**
 * Model class handles all calculations related to the program
 * @author Elias
 */
public class model {

    private String cleanInput;
    private boolean palinCheckVal;
    private char stackOutput;
    private char queueOutput;
    private Stack stack;
    private MyQueue queue;

    /**
     *  constructor initializes data
     */
    public model() {
        stack = new Stack();
        queue = new MyQueue();
        palinCheckVal = false;
    }

    /**
     * load method takes in a string and begins to load onto the stack and queue
     * @param _userInput
     */
    public void load(String _userInput) {
        stack = new Stack();
        queue = new MyQueue();
        palinCheckVal = false;
        cleanInput = _userInput.replaceAll("[^a-zA-Z]", "");
        for (int i = 0; i < cleanInput.length(); i++) {
            stack.push(cleanInput.charAt(i));
            queue.add(cleanInput.charAt(i));
        }
    }

    /**
     * checks for a palindrome by iterating through the stack and queue
     */
    public void palinCheck() {
        for (int i = 0; i < cleanInput.length(); i++) {
            stackOutput = (char) (stack.pop());
            queueOutput = (char) queue.remove();
            if (stackOutput == queueOutput) {
                palinCheckVal = true;
            }
            if (!(stackOutput == queueOutput)) {
                palinCheckVal = false;
                break;
            }
        }
    }

    /**
     * returns the boolean value of whether or not a there is a palindrome
     * @return palinCheckVal
     */
    public boolean getPalinVal() {
        return palinCheckVal;
    }
}
