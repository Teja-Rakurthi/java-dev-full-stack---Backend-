import java.util.*;
public class Dequeue1 {
    public static void main(String[] args){
        Deque<String> dq=new ArrayDeque<>();
        dq.push("Google");
        dq.push("youtube");
        dq.push("Instagram");

        System.out.println("present: "+dq.peek() );
        System.out.println("remove: "+dq.pop() );
        System.out.println("now: "+dq.peek() );
    }
}