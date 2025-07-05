package LinkedList.SinglyLinkedList;

class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    public Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryManagement {
    private Item head;

    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newItem;
    }

    public void addAtPosition(int position, String itemName, int itemId, int quantity, double price) {
        if (position < 1) return;
        if (position == 1) {
            addAtBeginning(itemName, itemId, quantity, price);
            return;
        }

        Item newItem = new Item(itemName, itemId, quantity, price);
        Item current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) return;
        newItem.next = current.next;
        current.next = newItem;
    }

    public void removeByItemId(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Item current = head;
        while (current.next != null && current.next.itemId != itemId) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void updateQuantity(int itemId, int newQuantity) {
        Item current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                current.quantity = newQuantity;
                return;
            }
            current = current.next;
        }
    }

    public void searchItem(String searchKey) {
        boolean found = false;
        Item current = head;
        while (current != null) {
            if (String.valueOf(current.itemId).equals(searchKey) || current.itemName.equalsIgnoreCase(searchKey)) {
                displayItem(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }

    public void calculateTotalValue() {
        double totalValue = 0;
        Item current = head;
        while (current != null) {
            totalValue += current.price * current.quantity;
            current = current.next;
        }
        System.out.println("Total Inventory Value: ₹" + totalValue);
    }

    public void sortInventory(String sortBy, boolean ascending) {
        head = mergeSort(head, sortBy, ascending);
    }

    private Item mergeSort(Item head, String sortBy, boolean ascending) {
        if (head == null || head.next == null) return head;

        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(head, sortBy, ascending);
        Item right = mergeSort(nextOfMiddle, sortBy, ascending);

        return sortedMerge(left, right, sortBy, ascending);
    }

    private Item sortedMerge(Item a, Item b, String sortBy, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;

        int compare;
        if (sortBy.equalsIgnoreCase("name")) {
            compare = a.itemName.compareToIgnoreCase(b.itemName);
        } else {
            compare = Double.compare(a.price, b.price);
        }

        if ((ascending && compare <= 0) || (!ascending && compare >= 0)) {
            a.next = sortedMerge(a.next, b, sortBy, ascending);
            return a;
        } else {
            b.next = sortedMerge(a, b.next, sortBy, ascending);
            return b;
        }
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Item current = head;
        while (current != null) {
            displayItem(current);
            current = current.next;
        }
    }

    private void displayItem(Item item) {
        System.out.println("Item Name: " + item.itemName);
        System.out.println("Item ID: " + item.itemId);
        System.out.println("Quantity: " + item.quantity);
        System.out.println("Price: ₹" + item.price);
        System.out.println("----------------------------------");
    }
    
    
    
    
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        inventory.addAtEnd("Laptop", 101, 10, 55000);
        inventory.addAtBeginning("Mouse", 102, 50, 500);
        inventory.addAtEnd("Keyboard", 103, 30, 1500);
        inventory.addAtPosition(2, "Monitor", 104, 20, 12000);

        System.out.println("All Inventory Items:");
        inventory.displayAll();

        System.out.println("\nSearching for Item ID 103:");
        inventory.searchItem("103");

        System.out.println("\nUpdating Quantity for Item ID 104:");
        inventory.updateQuantity(104, 25);
        inventory.displayAll();

        System.out.println("\nTotal Inventory Value:");
        inventory.calculateTotalValue();

        System.out.println("\nSorting Inventory by Name (Ascending):");
        inventory.sortInventory("name", true);
        inventory.displayAll();

        System.out.println("\nSorting Inventory by Price (Descending):");
        inventory.sortInventory("price", false);
        inventory.displayAll();

        System.out.println("\nRemoving Item ID 102:");
        inventory.removeByItemId(102);
        inventory.displayAll();
    }
}


