package Stack_Queue_HashMap.HashMap_Hashing;

import java.util.Scanner;

class CustomHashMap {

    private class Entry {
        int key;
        int value;
        Entry next;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private final int SIZE = 10;
    private Entry[] buckets;

    public CustomHashMap() {
        buckets = new Entry[SIZE];
    }

    private int getBucketIndex(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = getBucketIndex(key);
        Entry head = buckets[index];

        // Update if key already exists
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                System.out.println("Key " + key + " updated with value " + value);
                return;
            }
            head = head.next;
        }

        // Insert at beginning of list
        Entry newEntry = new Entry(key, value);
        newEntry.next = buckets[index];
        buckets[index] = newEntry;
        System.out.println("Key " + key + " inserted with value " + value);
    }

    public int get(int key) {
        int index = getBucketIndex(key);
        Entry head = buckets[index];

        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }

        return -1; // Key not found
    }

    public void remove(int key) {
        int index = getBucketIndex(key);
        Entry head = buckets[index];
        Entry prev = null;

        while (head != null) {
            if (head.key == key) {
                if (prev == null) {
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                System.out.println("Key " + key + " removed.");
                return;
            }
            prev = head;
            head = head.next;
        }

        System.out.println("Key " + key + " not found.");
    }

    public void display() {
        System.out.println("\nCurrent HashMap:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            Entry head = buckets[i];
            if (head == null) {
                System.out.println("null");
            } else {
                while (head != null) {
                    System.out.print("[" + head.key + " → " + head.value + "] -> ");
                    head = head.next;
                }
                System.out.println("null");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomHashMap map = new CustomHashMap();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Put (Insert/Update)");
            System.out.println("2. Get (Retrieve)");
            System.out.println("3. Remove");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            int key, value;

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    key = scanner.nextInt();
                    System.out.print("Enter value: ");
                    value = scanner.nextInt();
                    map.put(key, value);
                    break;
                case 2:
                    System.out.print("Enter key to retrieve: ");
                    key = scanner.nextInt();
                    int result = map.get(key);
                    if (result == -1) {
                        System.out.println("Key not found.");
                    } else {
                        System.out.println("Value for key " + key + ": " + result);
                    }
                    break;
                case 3:
                    System.out.print("Enter key to remove: ");
                    key = scanner.nextInt();
                    map.remove(key);
                    break;
                case 4:
                    map.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
