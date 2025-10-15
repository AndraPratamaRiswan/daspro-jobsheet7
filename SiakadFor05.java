import java.util.Scanner;

public class SiakadFor05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int mhs = 10, lulus = 0, tdkLulus = 0, i;
        i=1;
        double nilai, tertinggi = 0, terendah = 100;
        //for (int i = 1; i < 10; i++){
            //System.out.print("Masukan nilai mahasiswa ke-" + i + ": ");
            //nilai = sc.nextDouble();
           // if (nilai > tertinggi){
                //tertinggi = nilai;
            //}
            //if (nilai < terendah){
               // terendah = nilai;
            //}
        //}

        while (i <= mhs){
            System.out.print("Masukan Nilai Mahasiswa ke-"+ i +": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
            if (nilai >= 60){
                lulus++;
            }else {
                tdkLulus++;
            }
            i++;
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Banyak mahasiswa yang lulus: "+ lulus);
        System.out.println("Banyak mahasiswa yang tidak lulus: "+ tdkLulus);
    }
}