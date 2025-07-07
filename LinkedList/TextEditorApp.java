// Shivangi Tomar – Undo/Redo Text Editor using Doubly Linked List

class TextState {
    String content;
    TextState prev, next;

    TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

class TextEditor {
    TextState head = null, current = null;
    int maxStates = 10;
    int stateCount = 0;

    void type(String newContent) {
        TextState newState = new TextState(newContent);

        // Cut forward history if user typed after undo
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
        }

        if (head == null) {
            head = newState;
        } else {
            current.next = newState;
            newState.prev = current;
        }

        current = newState;
        stateCount++;

        // Maintain only last 10 states
        if (stateCount > maxStates) {
            head = head.next;
            head.prev = null;
            stateCount--;
        }
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed.");
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed.");
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    void showCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Editor is empty.");
        }
    }
}

public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.type("Hello");
        editor.type("Hello World");
        editor.type("Hello World from Shivangi");

        editor.showCurrentState();

        editor.undo();
        editor.showCurrentState();

        editor.undo();
        editor.showCurrentState();

        editor.redo();
        editor.showCurrentState();

        editor.type("Hello Universe!");
        editor.showCurrentState();

        editor.redo(); // should not redo since we typed new content
    }
}
