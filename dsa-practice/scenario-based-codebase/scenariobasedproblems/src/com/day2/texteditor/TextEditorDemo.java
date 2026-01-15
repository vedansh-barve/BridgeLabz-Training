package com.day2.texteditor;

public class TextEditorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextEditor editor = new TextEditor();

        editor.insert("Hello ");
        editor.insert("World");
        editor.showContent();

        editor.undo();
        editor.showContent();

        editor.redo();
        editor.showContent();

        editor.delete("World");
        editor.showContent();

        editor.undo();
        editor.showContent();
	}

}
