package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public static void printTable(int numberTableToPrint){
if (numberTableToPrint>=0){int rezult =1;
        for (int i=1; i<=10; i++)
        {rezult=i*numberTableToPrint;
        System.out.println(i+" x "+numberTableToPrint+ " = "+rezult);}}

    }
    public static void main (String[]args)
    {int numberTableToPrint=5;
    printTable(numberTableToPrint);}
}
