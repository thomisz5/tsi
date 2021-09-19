//thomas sá capucho

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Anos anos;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        anos = new Anos();
    }

    public void executar() {
        anos.setT(scanner.nextInt());

        for (int i = 1; i <= anos.getT(); i++) {
            anos.setPA(scanner.nextInt());
            anos.setPB(scanner.nextInt());
            anos.setG1(scanner.nextDouble());
            anos.setG2(scanner.nextDouble());
            System.out.println(anos.getLogica());
        }
    }

    class Anos {
        private int T, PA, PB, anos;
        private double G1, G2;

        public void setT(int t) {
            this.T = t;
        }

        public void setG1(double g1) {
            this.G1 = g1;
        }


        public void setG2(double g2) {
            this.G2 = g2;
        }

        public void setPA(int PA) {
            this.PA = PA;
        }

        public void setPB(int PB) {
            this.PB = PB;
        }

        public double getG1() {
            return G1;
        }

        public double getG2() {
            return G2;
        }


        public int getPA() {
            return PA;
        }

        public int getPB() {
            return PB;
        }

        public int getT() {
            return T;
        }

        public void setAno(int anos) {
            this.anos = anos;
        }


        public String getLogica() {
            anos = 0;
            while (PB >= PA) {
                PA += (PA * G1) / 100;
                PB += (PB * G2) / 100;
                anos++;
                if (anos > 100) {
                    break;
                }
            }
            if (anos > 100)
                return ("Mais de 1 seculo.");

            return (anos + " anos");
            
        }
    }
}