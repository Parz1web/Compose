package com.sekirin;

public class Point3D extends Point{

    private int z;

    public Point3D(){
        super();
        z = 1;
    }
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Point3D(Point another, int z){
        super(another);
        this.z = z;
    }
    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    @Override
    public double distance() {
        return Math.sqrt(this.getX()*this.getX()+this.getY()*this.getY()+this.z*this.z);
    }

    @Override
    public String toString() {
        return "Point3D[x = " + getX() +"; y = "+ getY() +
                "; z = " + z +
                ']';
    }

    //умножение вектора на скаляр
    public void multiplyByScalar(int s) {
        this.setX(getX()*s);
        this.setY(getY()*s);
        this.z *= s;
    }
}
