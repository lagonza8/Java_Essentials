package com.codewithmosh.state;

public class Canvas1 {

    private ToolType currentTool;

    public void mouseDown() {
        if(currentTool == ToolType.SELECTION)
            System.out.println("Selection icon");
        else if(currentTool == ToolType.BRUSH)
            System.out.println("Brush icon");
        else if(currentTool == ToolType.ERASER)
            System.out.println("Eraser icon");
        // If we ever added a new tool we would need a new branch of this else-if
    }

    public void mouseUp() {
        if(currentTool == ToolType.SELECTION)
            System.out.println("Draw dashed rectangle");
        else if(currentTool == ToolType.BRUSH)
            System.out.println("Draw a line");
        else if(currentTool == ToolType.ERASER)
            System.out.println("Erase something");
        // If we ever added a new tool we would need a new branch of this else-if
        // Every time we add a new tool we would have to update this class as well...
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
