package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public static void printHalfPyramid(int cathetusLength) {
for (int i=1; i<=cathetusLength; i++)
{for (int j=0;j<cathetusLength-i;j++)
{System.out.print(" ");}
    for (int k=0;k<i;k++)
    {System.out.print("*");}
{System.out.println();}
    }}

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
