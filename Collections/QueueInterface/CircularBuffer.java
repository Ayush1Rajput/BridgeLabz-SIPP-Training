package Collections.QueueInterface;

public class CircularBuffer {
    static class Buffer {
        private int[] buffer;
        private int front;
        private int rear;
        private int size;
        private int count;

        // Constructor to initialize buffer with given size
        public Buffer(int size) {
            this.buffer = new int[size];
            this.front = 0;
            this.rear = 0;
            this.size = size;
            this.count = 0;
        }

        // Insert an element into the buffer
        public void insert(int value) {
            if (count == size) {
                // Buffer is full, overwrite the oldest element (front)
                front = (front + 1) % size;
            } else {
                count++;
            }

            buffer[rear] = value;
            rear = (rear + 1) % size;
        }

        // Display the contents of the buffer
        public void display() {
            System.out.print("Buffer: [");
            for (int i = 0; i < count; i++) {
                System.out.print(buffer[(front + i) % size]);
                if (i < count - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        Buffer buffer = new Buffer(3);  

        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.display();  

        
        buffer.insert(4);
        buffer.display();  

        buffer.insert(5);
        buffer.display();  
    }
}
