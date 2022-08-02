public abstract class WA {
    protected int a,b;

    public WA() {
        a=b=10;
    }

    public void faa() {
        if(a < 10) b=0;
        else a=0;
    }

    public abstract int fbb();
}