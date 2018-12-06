package priv.lint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyQueue myQueue = new MyQueue();
        try {
            Object poll = myQueue.poll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
