import java.util.LinkedList;

public class ProducerConsumer {

    LinkedList<Integer> queue = new LinkedList<>();
    int queueLimit = 2;

    // Function called by producer thread
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                // producer waits if queue is full
                while (queue.size() == queueLimit)
                    wait();

                System.out.println("Producer produced-"
                        + value);

                // adding jobs to the queue
                queue.add(value++);

                // notify the consumer to start consuming
                notify();

                Thread.sleep(1000);
            }
        }
    }

    // Function called by consumer thread
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                // consumer waits if the queue is empty
                while (queue.size() == 0)
                    wait();

                // to retrieve the first job in the queue
                int val = queue.removeFirst();

                System.out.println("Consumer consumed-"
                        + val);

                // notify producer thread
                notify();

                Thread.sleep(1000);
            }
        }
    }
}

