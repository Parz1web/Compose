package com.sekirin;

public class Line {
    Point begin;
    Point end;

    public Line(int x1, int y1, int x2, int y2){
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    ///Begin
    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public int[] getBeginXY(){
        return begin.getXY();
    }
    public void setBeginXY(int x, int y){
        begin.setXY(x,y);
    }

    ////// ENd
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public int[] getEndXY(){
        return end.getXY();
    }
    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }

    @Override
    public String toString() {
        return "Отрезок[начало=" + begin +", конец=" + end + ']';
    }

    public double getLength(){
        return begin.distance(end);
    }
    //4)
    public double getGradient(){
        return Math.atan((end.getY()-begin.getY())/(end.getX()-begin.getX()))*100;
    }

    //6)
    public boolean intersects(Line another){

        int x1, y1, x2, y2, x3, y3, x4, y4;

        x1 = end.getX();
        y1 = end.getY();
        x2 = begin.getX();
        y2 = begin.getY();
        x3 = another.getEndX();
        y3 = another.getEndY();;
        x4 = another.getBeginX();
        y4 = another.getBeginY();
        double x = ((x1*y2-x2*y1)*(x4-x3)-(x3*y4-x4*y3)*(x2-x1))/((y1-y2)*(x4-x3)-(y3-y4)*(x2-x1));
        double y = ((y3-y4)*x-(x3*y4-x4*y3))/(x4-x3);
       return (((x1 <= x) && (x2 >= x) && (x3 <= x) && (x4 >= x)) || ((y1 <= y) && (y2 >= y) && (y3 <= y) && (y4 >= y)));

    }

}
