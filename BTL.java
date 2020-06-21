package com.DNV.BTL;

import BreezyGUI.*;

public interface Diagram
{
    public:
        void draw();
        //diagrams Iterable<Drawable>;
}



public class Point
{
    public:
        //Constructor
        Point()
        {
            x = 0;
            y = 0;
        }
        Point(double x_, double y_)
        {
            x = x_;
            y = y_;
        }
        //Methods
        double getX(){return x;}
        double getY(){return y;}
        void setX(double x1){x = x1;}
        void setY(double y1){y = y1;}
        String toString(){"x=" + x + ", y=" + y;}

        /* check equality between this point and another 
        * given it's x and y coords */
        public boolean equals(double x1, double y1){
            return(this.x == x1 && this.y == y1);
        }
        
        /* check equality between this point and another */
        public boolean equals(Point p){
            return equals(p.getX(), p.getY());
        }
    
    private:
        double x;
        double y; 
}

public class Line
{
    public:
        //Constructor

        Point(Point start, Point end)
        {
            startPoint = start;
            endPoint = end;
        }
        //Methods
        double getendPoint(){return endPoint;}
        double getstartPoint(){return startPoint;}
        void setstartPoint(double start){startPoint = start;}
        void setendPoint(double end){endPoint = end;}

        void draw(Graphics g,int x1, int y1, int x2, int y2)
        {
            g.drawLine(x1, y1, x2, y2);
        }

        public boolean equals(Point x1, Point y1){
            return(this.startPoint == x1 && this.endPoint == y1);
        }
        
        public boolean equals(Line l){
            return equals(l.getstartPoint(), p.getendPoint());
        }

        private:
            Point startPoint;
            Point endPoint;

}

public abstract class Shape implements Drawable {
    public abstract double getPerimeter();
    public abstract double getArea();
}

public class Circle
{
    public:
        //Constructor

        Circle(Point c, double r)
        {
            center = c;
            radius = r;
        }
        //Methods
        double getRadius(){return radius;}
        double getCenter(){return center;}
        void setRadius(double r){radius = r;}
        void setCenter(Point c){center = c;}

        double getPerimeter() {return 3.14 * radius;}
        double getArea() {return 3.14 * radius * radius;}

        void draw(Graphics g,int x, int y, int width, int length)
        {
            g.drawOval(x, y, width, length); 
        }

        public boolean equals(Point x1, double y1){
            return(this.center == x1 && this.radius == y1);
        }
        
        public boolean equals(Line l){
            return equals(l.getCenter(), p.getRadius());
        }

        private:
            Point center;
            double radius;

}

public class Rectangle
{
    public:
        //Constructor

        Circle(Point lt, double h, double w)
        {
            leftTop = lt;
            height = h;
            width = w;
        }
        //Methods
        Point getLeftTop(){return leftTop}
        double getHeight(){return height;}
        double getWidth(){return width;}
        void setLeftTop(Point lt){leftTop = lt;}
        void setHeight(double h){height = h;}
        void setWidth(double w){width = w;}

        double getPerimeter() {return 2*(height + width);}
        double getArea() {return height * width;}

        void draw(Graphics g,int x, int y, int width, int length)
        {
            g.drawRect(x, y, width, length); 
        }

        public boolean equals(Point x1, double y1){
            return(this.center == x1 && this.radius == y1);
        }
        
        public boolean equals(Line l){
            return equals(l.getCenter(), p.getRadius());
        }

        private:
            Point leftTop;
            double height;
            double width;

}

public class Square extends Rectangle
{
    Square(Point p, double side){
        leftTop = p;
        height = side;
        width = side;
    }

    public double getSide(){
        return getWidth();
    }
    
    void draw(Graphics g,int x, int y, int width, int length)
    {
            g.drawRect(x, y, width, length); 
    }
}
            
