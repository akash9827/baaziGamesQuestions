public class Main {
    public static void main(String[] args) throws InterruptedException {

        final ProducerConsumer pc = new ProducerConsumer();

        // Producer thread declaration
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Consumer thread declaration
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        producerThread.start();
        consumerThread.start();

        // producerThread finishes before consumerThread
        producerThread.join();
        consumerThread.join();

    }
}