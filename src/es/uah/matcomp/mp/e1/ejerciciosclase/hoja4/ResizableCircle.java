package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

public class ResizableCircle extends Circle5 {


    public ResizableCircle(double radius) {
        super(radius);
    }


    @Override
    public String toString() {
        return "ResizableCircle[" + "radius=" + radius + ']';
    }

    public void resize(int percent) {
        radius *= percent / 100;
    }
}
