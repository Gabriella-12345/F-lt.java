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
        System.out.println((siff[0] + siff[1] + siff[2]+ siff[3] + siff[4])/siff.length);

        // System.out.println("Fält 2");
    }
}
