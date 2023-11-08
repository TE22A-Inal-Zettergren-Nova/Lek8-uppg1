import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         /*WHILE-LOOP */
        int varv =2;
        while(varv<6)
        {
            System.out.println(varv);
            varv++;
        } 

        /*FOR-LOOP */
        System.out.println("");
        for (int runda=0; runda<6; runda++)
        {
            System.out.println(runda);
        }

        /*DO-SATS */
        System.out.println("");
        varv=2;
        do{
            System.out.println(varv);
            varv++;
        }
        while(varv<6);

        /*Ny while loop */
        System.out.println("");
        int s = 5;

        while(s>-1)
        {
            System.out.println(s);
            s--;
        }

        /*Ny for loop */
        System.out.println("");
        for(int f=5; f>-1; f--){
            System.out.println(f);
        }

        /*ARRAY */
        Scanner tb = new Scanner(System.in);
        int[] tal = new int[5];

        for(int g=0; g < tal.length; g++)
        {
            System.out.println("Skriv in tal: ");
            tal[g] = tb.nextInt();
        }
        System.out.println(" ");
        for(int g: tal)
        {
            System.out.println(g);
        }




        

        

    }
}
