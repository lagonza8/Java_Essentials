package com.codewithmosh.memento;

public class Editor {
    private String content;
    //private String previousContent;
    //private String title;

    public EditorState createState() {
        return new EditorState((content));
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void undo() {
    }
}
