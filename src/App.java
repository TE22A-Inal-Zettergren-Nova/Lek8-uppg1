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
        int v = 0;

        for(int g=0; g < tal.length; g++)
        {
            System.out.println("Skriv in tal: ");
            tal[g] = tb.nextInt();
        }
        System.out.println(" ");
       
        v = tal[0];
        tal[0] = tal[4];
        tal[4] = v;

        v = tal[1];
        tal[1] = tal[3];
        tal[3] = v;

        for(int g: tal)
        {
            System.out.println(g);
        }

        //Figurer//
        System.out.println("Skriv ett tal: ");
        int talet = tb.nextInt();

        System.out.println("Hur många rader: ");
        int rader = tb.nextInt();

        for(int i=0; i<rader;i++)
        {
            System.out.println(" ");
            for(int j=0; j<talet; j++)
            {
            
            System.out.print("*");
            }
        }








        

       
        
    }
}
