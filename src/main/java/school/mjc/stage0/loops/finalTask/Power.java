package school.mjc.stage0.loops.finalTask;

public class Power {
    public static void printPower(int numberToPrint, int power) {
int rez=1;
int i = 0;
        for (i=0;i<power;i++)
{rez*=numberToPrint;}
System.out.println(rez);
    }

    public static void main(String[] args) {
        new Power().printPower(-10, 4);
    }
}
