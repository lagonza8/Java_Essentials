package com.codewithmosh.state;

public class Canvas2 {

    private Tool currentTool;

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }
    // with this implementation, adding a new class is easy, just make sure it implements the interface
    //  no changes would have to be made to this class as longs as the method signatures in the interface don't change
}
