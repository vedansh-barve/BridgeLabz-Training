package com.day2.texteditor;
import java.util.*;

public class TextEditor {
	
	private String content = "";
    private Stack<stack> undoStack = new Stack<>();
    private Stack<stack> redoStack = new Stack<>();

    public void insert(String text) {
        content += text;
        undoStack.push(new stack("INSERT", text));
        redoStack.clear();   
        System.out.println("Inserted: " + text);
    }
    
    public void delete(String text) {
        if (!content.endsWith(text)) {
            System.out.println("Dlete, text not found in end.");
            return;
        }

        content = content.substring(0, content.length() - text.length());
        undoStack.push(new stack("DELETE", text));
        redoStack.clear();
        System.out.println("Deleted: " + text);
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo....");
            return;
        }

        stack action = undoStack.pop();

        if (action.type.equals("INSERT")) {
            content = content.substring(0, content.length() - action.text.length());
        } else if (action.type.equals("DELETE")) {
            content += action.text;
        }

        redoStack.push(action);
        System.out.println("Undo performed....");
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.....");
            return;
        }

        stack action = redoStack.pop();

        if (action.type.equals("INSERT")) {
            content += action.text;
        } else if (action.type.equals("DELETE")) {
            content = content.substring(0, content.length() - action.text.length());
        }

        undoStack.push(action);
        System.out.println("Redo performed....");
    }

    public void showContent() {
        System.out.println("Current Text: " + content);
    }
}
