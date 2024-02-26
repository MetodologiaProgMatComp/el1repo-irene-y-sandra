package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + ']';
    }
    public double getPerimeter(){
        double distancia1;
        double distancia2;
        double distancia3;
        distancia1 = v1.distance(v2);
        distancia2 = v2.distance(v3);
        distancia3 = v3.distance(v1);
        return (distancia1 + distancia2 + distancia3);
    }
    public String getType(){
        double distancia1;
        double distancia2;
        double distancia3;
        String triangulo = "";
        distancia1 = v1.distance(v2);
        distancia2 = v2.distance(v3);
        distancia3 = v3.distance(v1);
        if (distancia1 != distancia2 && distancia2 != distancia3 && distancia1!=distancia3){
            triangulo = "Scalene";
        }
        if (distancia1==distancia2||distancia2==distancia3||distancia1==distancia3){
            triangulo = "Isosceles";
        }
        if (distancia1 == distancia2 && distancia2 == distancia3){
            triangulo = "Equilateral";
        }
        return triangulo;
    }
}