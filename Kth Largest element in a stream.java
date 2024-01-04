import java.util.*;

public class Solution {

    public static class Kthlargest {

        PriorityQueue<Integer> pq;

        int n;

        Kthlargest(int k, int []arr) {

            this.n = k;

            pq = new PriorityQueue<>(k);

            for(int num:arr)

            {

                pq.add(num);

            }

        }

 

        int add(int num) {

            if(pq.size()<n)

            pq.add(num);

            else if(pq.peek()<num)

            {

                pq.poll();

                pq.add(num);

            }

            return pq.peek();

 

        }

    }

}
