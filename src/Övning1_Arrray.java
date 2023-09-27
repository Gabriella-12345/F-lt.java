public class Övning1_Arrray {
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
        System.out.println("siffera 5" + siff[4]+"\n");

        System.out.println("Antal element i siff = "+ siff.length);
        System.out.print("Medelvärdet:");
        System.out.println(( + siff[0] + siff[1] + siff[2]+ siff[3] + siff[4])/siff.length+"\n\n"); 

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
        System.out.println("siffera 5" + sif[4]+"\n");
        
        System.out.println("Antal element i sif = "+ sif.length);
        System.out.print("Medelvärdet:");
        System.out.println(( + sif[0] + sif[1] + sif[2]+ sif[3] + sif[4])/sif.length);

        int sum_siff = siff[0]+siff[1]+siff[2]+siff[3]+siff[4];
        int sum_sif = sif[0]+sif[1]+sif[2]+sif[3]+sif[4];
        System.out.println("Summan av fält 1 och 2 är lika med:" + sum_sif+sum_siff+"\n\n");

        int []fyra = new int[4];
        fyra[0] = 2;
        fyra[1] = 4;
        fyra[2] = 6;
        fyra[3] = 8;

        System.out.println("siffera 1" + fyra[0]);
        System.out.println("siffera 2" + fyra[1]);
        System.out.println("siffera 3" + fyra[2]);
        System.out.println("siffera 4" + fyra[3]+"\n");
        
        System.out.println("Antal element i fyra = "+ fyra.length);
        System.out.print("Alla fält i fyra adderat blir:");
        System.out.print(fyra[0] + fyra[1] + fyra[2] + fyra[3]);
    }
}
