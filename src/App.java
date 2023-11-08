public class App {
    public static void main(String[] args) throws Exception {
        int varv =2;
        while(varv<6)
        {
            System.out.println(varv);
            varv++;
        } 

        for (int runda=0; runda<6; runda++)
        {
            System.out.println(runda);
        }

        varv=2;
        do{
            System.out.println(varv);
            varv++;
        }
        while(varv<6);

    }
}
