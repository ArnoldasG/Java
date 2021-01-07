package Exercises.OOP.Constructors.LessonGettersandSetters;

public class WallArea {
    private double height;
    private double width;

    public WallArea() {
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return height * width;
    }

    public void setHeight(double height) {
        if (height < 0) {
            setWidth(0.0);
        } else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if (width < 0) {
            setHeight(0.0);
        } else {
            this.width = width;
        }
    }

    public WallArea(double height, double width) {
        if (height < 0) {
            setHeight(0.0);
        } else {
            this.height = height;
        }
        if (width < 0) {
            setWidth(0.0);
        } else {
            this.width = width;
        }

        }
    }

