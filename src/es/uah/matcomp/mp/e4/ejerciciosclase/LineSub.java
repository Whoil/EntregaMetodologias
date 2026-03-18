package es.uah.matcomp.mp.e4.ejerciciosclase;

public class LineSub extends Point{// A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    // Private variables
    Point end;               // Ending point

    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);             // construct the begin Point
        this.end = new Point(endX, endY);  // construct the end Point
    }
    public LineSub (Point begin, Point end) {  // caller to construct the Points
        super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
        this.end = end;
    }

    // Public methods
    // Inherits methods getX() and getY() from superclass Point
    public String toString() {
        return "Begin: ("+getX()+", "+getY()+") End: ("+end.getX()+", "+end.getY()+")";
    }

    //Begin and End getters;
    public Point getBegin() {
        return this;
    }
    public Point getEnd() {
        return end;
    }


    //Begin and End setters
    public void setBegin(int beginx, int beginy) {
        super.setX(beginx);
        super.setY(beginy);
    }
    public void setEnd(int endx, int endey) {
        end.setX(endx);
        end.setY(endey);
    }


    // Begin and End Y getters and X getters
    public int getBeginX() {
        return super.getX();
    }
    public int getBeginY() {
        return super.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }


    //Begin and End Y setter and X setter
    public void setBeginX(int beginX) {
        super.setX(beginX);
    }

    public void setBeginY(int beginY) {
        super.setY(beginY);
    }


    public void setEndX(int endX) {
        this.end.setX(endX);
    }
    public void setEndY(int endY) {
        this.end.setY(endY);
    }

    //Set End and Begin XY
    public void setBeginXY(int beginX, int beginY) {
        super.setXY(beginX, beginY);
    }

    public void setEndXY(int endX, int endY) {
        this.end.setXY(endX, endY);
    }
    //Method to get length
    public double getLength() {
        return end.distance(super.getX(),super.getY());
    }       // Length of the line

    //Method to get Gradient
    public double getGradient() {
        int dx= end.getX()-super.getX();
        int dy=end.getY()-super.getY();
        return Math.atan2(dy,dx);
    }  // Gradient in radians




}
