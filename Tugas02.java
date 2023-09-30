package tp02;

import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        //Input nama
        String nama = x.nextLine();
        //Input Tahun Kelahiran
        int kelahiran = x.nextInt();
        //Menentukan usia pada tahun ini
        int tahunIni = 2023;
        int a = tahunIni-kelahiran;
        //Output Nama dan Usia
        System.out.println("Halo, " + nama + ".");
        System.out.println("Ternyata usiamu masih " + a + " Tahun ya!");

        x.close();
    }
}
