package com.sekirin;

public class Main {

    public static void main(String[] args) {

        //1)
        Author a1 = new Author("Alex", "aale@asd.rs");
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.toString());
        //2)
        Book b1 = new Book("Java для таких, как я", a1, 200, 99);
        System.out.println(b1);
        b1.setPrice(300);
        b1.setQty(89);
        System.out.println(b1);
        System.out.println("Название: " + b1.getName());
        System.out.println("Автор: " + b1.getAuthor());
        System.out.println("Цена: " + b1.getPrice());
        System.out.println("Год: " + b1.getQty());

        Book moreB2 = new Book("Java для опытных", new Author("Ivanov", "asdasd@sdfsdf"),20, 40);
        System.out.println(moreB2);
        //3)
        Point p1 = new Point(1,2);
        System.out.println(p1);
        Point p2 = new Point();
        System.out.println(p2);

        p1.setX(3);
        p1.setY(4);
        System.out.println(p1);
        System.out.println("X:" + p1.getX());
        System.out.println("Y:" + p1.getY());

        p1.setXY(5,6);
        System.out.println(p1);
        System.out.println("X:" + p1.getXY()[0]);
        System.out.println("Y:" + p1.getXY()[1]);

        p2.setXY(10,11);
        //System.out.printf("Расстояние:", p1.distance(10,11));
//        System.out.printf("Расстояние:", p1.distance(p2));
//        System.out.printf("Расстояние:", p2.distance(p1));
//        System.out.printf("Расстояние:", p1.distance());

        //4)
        Point p3 = new Point(1,2);
        Point p4 = new Point(5,6);

        Line l1 = new Line(p3, p4);
        System.out.println(l1);
        System.out.println("Угол наклона прямой к оси Х: ");
        System.out.println(l1.getGradient());


        //6)
        Point p5 = new Point(2,4);
        Point p6 = new Point(10,11);

        Line l2 = new Line(p5,p6);
        System.out.println(l1.intersects(l2)); //false можно проверить построив отрезки на графике

    ///////////////////////////////
        ///НАСЛЕДОВАНИЕ///

        //Test Cylinder

        Cylinder cylinder1 = new Cylinder();
        System.out.println("Радиус:" + cylinder1.getRadius() + " Высота:" + cylinder1.getHeight() +
                 " Площадь основания:" + cylinder1.getArea() + " Объем:" + cylinder1.getVolume());
        System.out.println(cylinder1.toString());
        Cylinder cylinder2 = new Cylinder(5.0, 2.0);
        System.out.println("Радиус:" + cylinder2.getRadius() + " Высота:" + cylinder2.getHeight() +
                " Площадь основания:" + cylinder2.getArea() + " Объем:" + cylinder2.getVolume());

        System.out.println(cylinder2.toString());

        System.out.println("Площадь поверхности cylinder2: "+ cylinder2.getArea());

        Point3D point1 = new Point3D(1,2,3);
        System.out.println(point1.toString());
        Point3D point2 = new Point3D(new Point(2,4),1);
        System.out.println(point2.toString());
        System.out.println(point2.distance());

        point2.multiplyByScalar(4); //1ый доп. метод

        System.out.println(point2.toString());
        System.out.println(point2.distance()); //2ой доп. метод
    }
}
