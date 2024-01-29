package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public static void printPyramid(int cathetusLength) {


        for (int i=1;i<=cathetusLength;i++)
        {
            for (int j=cathetusLength;j>i;j--)
            {System.out.print(" ");}
            for (int k=0;k<i;k++)
            {System.out.print(i-k);}
            for (int m=0;m<(i*2-1)/2;m++)
            {System.out.print(m+2);}
            //for (int l=cathetusLength;l>i;l--)
        //{System.out.print(" ");}

        {System.out.println();}}
        //System.out.println();
    }

    //public static void main(String[] args) {
      //  new Pyramid().printPyramid(5);
    //}
    public static void main (String[]args)
    {
        int cathetusLength=6;
        printPyramid(cathetusLength);
    }
}
