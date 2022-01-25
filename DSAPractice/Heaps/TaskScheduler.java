import java.util.*;

class TaskScheduler {
    public static void main(String[] args) {
        char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
        int n = 2;
        System.out.println(leastInterval(tasks, n));
    }

    public static int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> task_counter = new HashMap<>();
        for (Character task : tasks) {
            task_counter.put(task, task_counter.getOrDefault(task, 0) + 1);
        }

        //print hashmap
        for (Map.Entry<Character, Integer> entry : task_counter.entrySet()) {
            System.out.print("["+entry.getKey()+" : "+entry.getValue()+"]");
        }
        System.out.println();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(task_counter.values());

        System.out.println("priority que in the start:"+Arrays.toString(pq.toArray()));


        int time = 0;
        while (pq.size() > 0) {

            List<Integer> add_back = new ArrayList<>();

            for (int i = 0; i <= n; i++) {

                if (pq.size() > 0) {
                    System.out.println("priority que in the start of loop in if:"+Arrays.toString(pq.toArray()));
                    int count = pq.poll();
                    count--;
                    System.out.println("count:"+count);
                    if (count > 0) {
                        add_back.add(count);
                    }
                }
                System.out.println("add back list:"+Arrays.toString(add_back.toArray()));

                time += 1;
                System.out.println("time:"+time);
                if (pq.size() == 0 && add_back.size() == 0) {
                    break;
                }
                System.out.println("priority que in the end of the loop:"+Arrays.toString(pq.toArray()));
                System.out.println("-------------------------------------------------");
            }
            pq.addAll(add_back);

        }
        return time;
    }
}