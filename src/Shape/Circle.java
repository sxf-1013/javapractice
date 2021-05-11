package Shape;

    abstract class Shape {
        public abstract double area();
    }
    class Circle extends Shape {
        private double r;
        public Circle(double r) {
            this.r = r;
        }
        public double area() {
            return Math.PI*r*r;
        }
    }
    class Rectangle extends Shape{
        private double side1;
        private double side2;
        public Rectangle(double s1, double s2){
            side1=s1; side2=s2;
        }
        public double area(){
            return side1*side2;
        }
    }
    class Square extends Shape{
        private double side3;
        public Square(double s3){
        side3=s3;
    }
    public double area(){
        return side3*side3;
    }
}
    class Area {
        public static void main(String[] args) {
            Shape s1 = new Circle(10);
            System.out.println("圆形面积为:" + s1.area());
            Shape s2 = new Rectangle(2, 3);
            System.out.println("长方形面积为:" + s2.area());
            Shape s3 = new Square(6);
            System.out.println("正方形面积为:" + s3.area());
        }
    }

