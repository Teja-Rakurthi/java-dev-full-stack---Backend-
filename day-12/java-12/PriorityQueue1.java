import java.util.*;
public class PriorityQueue1 {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<6; i++){
            int num= sc.nextInt();
            pq.offer(num);
            if(pq.size()>3){
                pq.poll();
            }
        }
        System.out.println(pq);
    }
}