import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args){
        Queue<String> qe=new LinkedList<>();
            qe.offer("file1");
            qe.offer("file2");
            qe.offer("file3");

            while(!qe.isEmpty()){
                System.out.println("printing "+ qe.poll());
            }
    }
}