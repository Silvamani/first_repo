public class Queues{
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void add(int data){
            if(rear == size-1){
                System.out.println("full queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int frount = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return frount;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        while(!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}