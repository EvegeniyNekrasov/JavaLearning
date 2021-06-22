public class Wall {
    private double width;
    private double height;

    public Wall(){
        this(0,0);
    }

    public Wall(double width, double height) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0) {
            width = 0;
        }
        this.width = width;
    }

    public double getHeight() {
        if(height < 0) {
            height = 0;
        }
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
