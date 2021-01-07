package main.java.Lessons.OOP.Composition.Exercises.Two;

public class Bed {
    private String style;
    private int pillows;
    private int heights;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int heights, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.heights = heights;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    public void make() {
        System.out.println("Bed is being made");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    private int getHeights() {
        return heights;
    }

    private int getSheets() {
        return sheets;
    }

    private int getQuilt() {
        return quilt;
    }

}
