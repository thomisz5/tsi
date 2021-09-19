public class ZB extends WA {
    public ZB() {
        a+=5;
        b+=5;
    }

    public int fbb() {
        faa();
        return a+b;
    }

    public void faa() {
        try {
            if(a > 10)
                throw new Exception();
        } catch(Exception e) {
            a=b=0; return;
        }
        finally {
            a+=3;
            b+=3;
        }
    }
}