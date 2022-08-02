import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner scanner;
    private Evento evento;

    public InterfaceTexto() {
        scanner = new Scanner(System.in);
        evento = new Evento();
    }

    public void executar() {
        evento.setString(scanner.next());
        evento.setDay_i(scanner.nextInt());
        evento.setHour_i(scanner.nextInt());
        evento.setString(scanner.next());
        evento.setMinute_i(scanner.nextInt());
        evento.setString(scanner.next());
        evento.setSecond_i(scanner.nextInt());
        evento.setString(scanner.next());
        evento.setDay_f(scanner.nextInt());
        evento.setHour_f(scanner.nextInt());
        evento.setString(scanner.next());
        evento.setMinute_f(scanner.nextInt());
        evento.setString(scanner.next());
        evento.setSecond_f(scanner.nextInt());


        System.out.print(evento.getDay() + " dia(s)\n");
        System.out.print(evento.getHour() + " hora(s)\n");
        System.out.print(evento.getMinute() + " minuto(s)\n");
        System.out.print(evento.getSecond() + " segundo(s)\n");
    }
}

class Evento {
    private String string;
    private int tempoDeEvento;
    private int day_i, day_f, hour_i, hour_f, minute_i, minute_f, second_i, second_f;
    private int day = 0, hour = 0, minute = 0, second = 0;
    private boolean bool_h = false, bool_m = false, bool_s = false;


    public void setDay_f(int day_f) {
        this.day_f = day_f;
    }

    public void setDay_i(int day_i) {
        this.day_i = day_i;
    }

    public void setSecond_f(int second_f) {
        this.second_f = second_f;
    }

    public void setHour_f(int hour_f) {
        this.hour_f = hour_f;
    }

    public void setHour_i(int hour_i) {
        this.hour_i = hour_i;
    }


    public void setMinute_f(int minute_f) {
        this.minute_f = minute_f;
    }

    public void setMinute_i(int minute_i) {
        this.minute_i = minute_i;
    }



    public void setSecond_i(int second_i) {
        this.second_i = second_i;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }


    public int getTempoDoEvento() {
        if (hour_i > hour_f)
            bool_h = true;
        if (minute_i > minute_f)
            bool_m = true;
        if (second_i > second_f)
            bool_s = true;

        while (day_i != day_f) {
            day++;
            day_i++;
        }

        while (hour_i != hour_f) {
            hour++;
            hour_i++;
            if (hour_i == 25)
                hour_i = 1;
        }

        while (minute_i != minute_f) {
            minute++;
            minute_i++;
            if (minute_i == 61)
                minute_i = 1;
        }

        while (second_i != second_f) {
            second++;
            second_i++;
            if (second_i == 61)
                second_i = 1;
        }

        if (bool_h == true)
            day--;
        if (bool_m == true)
            hour--;
        if (bool_s == true)
            minute--;

        return 's';
    }
}