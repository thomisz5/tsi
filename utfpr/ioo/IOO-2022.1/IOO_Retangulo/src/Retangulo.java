public class Retangulo {
    private double base;
    private double altura;

    public Retangulo() {
        // base = 1;
        //altura = 1;
        this(1);
    }

    public Retangulo(double lado) {
        // setBase(lado);
        //setAltura(lado);
        this(lado, lado);
    }

    public Retangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return (base * 2) + (altura * 2);
    }

    public boolean eQuadrado() {
        return base == altura;
    }

    public boolean temAreaMaiorQue(double area) {
        return getArea() >area;//area informada como parametro para esse metodo
    }

    public boolean temAreaMaiorQue(Retangulo r){
        return getArea()> r.getArea();
    }
}
