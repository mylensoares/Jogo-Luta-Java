public class Main {
    public static void main(String[] args) throws Exception {
        Lutador l[] = new Lutador[6];
        Luta M01 = new Luta();

        l[0] = new Lutador("Jhon", "França", 
                                31, 1.75f, 80.2f, 11, 2,
                                2, 100);
                                
        l[1] = new Lutador("Taylor", "EUA", 
        28, 1.90f, 80.2f, 17, 5, 1, 100);


        M01.marcarLuta(l[0], l[1]);

    }


    



}
