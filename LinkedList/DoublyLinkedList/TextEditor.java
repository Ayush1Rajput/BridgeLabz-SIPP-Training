
public class TextEditor {

    // Inner class to represent a state of the text
    static class TextState {
        String content;
        TextState prev;
        TextState next;

        public TextState(String content) {
            this.content = content;
        }
    }

    private TextState head;
    private TextState tail;
    private TextState current;
    private final int MAX_HISTORY = 10;
    private int historySize = 0;

    // Add new text state at end (on new action/typing)
    public void addState(String content) {
        TextState newState = new TextState(content);

        // If current is not the tail, discard all redo states
        if (current != tail && current != null) {
            current.next = null;
            tail = current;
            historySize = calculateHistorySize();
        }

        if (head == null) {
            head = tail = current = newState;
            historySize = 1;
        } else {
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
            current = newState;
            historySize++;

            // Maintain history limit
            if (historySize > MAX_HISTORY) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
                historySize--;
            }
        }
    }

    // Undo (move to previous state)
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed.");
        } else {
            System.out.println("No more undo available.");
        }
    }

    // Redo (move to next state)
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed.");
        } else {
            System.out.println("No more redo available.");
        }
    }

    // Display current state of the text
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text State: \"" + current.content + "\"");
        } else {
            System.out.println("Text editor is empty.");
        }
    }

    // Helper to recalculate history size
    private int calculateHistorySize() {
        int count = 0;
        TextState temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Simulating typing and actions
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World! How");
        editor.addState("Hello World! How are");
        editor.addState("Hello World! How are you?");
        editor.displayCurrentState();

        // Performing undo operations
        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        // Performing redo operations
        editor.redo();
        editor.displayCurrentState();

        // Adding new action (discarding redo history)
        editor.addState("Hello World! How are you doing?");
        editor.displayCurrentState();

        // Testing undo beyond available states
        for (int i = 0; i < 15; i++) {
            editor.undo();
        }
        editor.displayCurrentState();

        // Testing redo beyond available states
        for (int i = 0; i < 5; i++) {
            editor.redo();
        }
        editor.displayCurrentState();
    }
}
