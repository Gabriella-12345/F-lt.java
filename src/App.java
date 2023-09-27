public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Fält_1");
        int []siff = new int[5];
        siff[0] = 8;
        siff[1] = 4;
        siff[2] = 6;
        siff[3] = 3;
        siff[4] = 9;

        System.out.println("siffera 1" + siff[0]);
        System.out.println("siffera 2" + siff[1]);
        System.out.println("siffera 3" + siff[2]);
        System.out.println("siffera 4" + siff[3]);
        System.out.println("siffera 4" + siff[4]);

        System.out.println("Antal element i siff = "+ siff.length);
        System.out.println(( + siff[0] + siff[1] + siff[2]+ siff[3] + siff[4])/siff.length); 

        System.out.println("Fält_2");
        int []sif = new int [5];

        sif[0] = 18;
        sif[1] = 14;
        sif[2] = 16;
        sif[3] = 13;
        sif[4] = 19; 

        System.out.println("siffera 1" + sif[0]);
        System.out.println("siffera 2" + sif[1]);
        System.out.println("siffera 3" + sif[2]);
        System.out.println("siffera 4" + sif[3]);
        System.out.println("siffera 4" + sif[4]);

        System.out.println("Antal element i sif = "+ sif.length);
        System.out.println(( + sif[0] + sif[1] + sif[2]+ sif[3] + sif[4])/sif.length);

        // System.out.println(siff[] + sif[]);

        int []fyra = new int[4];
        siff[0] = 1;
        siff[1] = 1;
        siff[2] = 1;
        siff[3] = 1;

        System.out.println("siffera 1" + siff[0]);
        System.out.println("siffera 2" + siff[1]);
        System.out.println("siffera 3" + siff[2]);
        System.out.println("siffera 4" + siff[3]);

        System.out.println(fyra[0] + fyra[1] + fyra[2] + fyra[3]);
    }
}
