package tp02;

public class Tugas01 {
    public static void main(String[] args) {
          //Input suhu Celciius (C)

    float x, y, a, b;
    //Masukan Suhu yang dinginkan untuk dikonfersi
    x = 56;
    y = 42;
    //Rumus perubahan Celius ke Farenhite
    a = 1.8F;
    b = 273.15F;
    System.out.println("Celcious --> Farenhite");
    System.out.println((a*x)+32 + "F");
    System.out.println((a*y)+32 + "F");
    System.out.println("Celcius --> Kelvin");
    System.out.println(x+b + "K");
    System.out.println(y+b + "K");
    }
}
