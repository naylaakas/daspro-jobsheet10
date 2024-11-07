import java.util.Scanner;

public class TUGAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] survey = new int[10][6];

        System.out.println("Masukkan nilai survei (1-5) untuk setiap responden dan pertanyaan:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                int nilai;
                do {
                    System.out.print("  Pertanyaan " + (j + 1) + ": ");
                    nilai = scanner.nextInt();
                    if (nilai < 1 || nilai > 5) {
                        System.out.println("  Nilai harus antara 1 dan 5. Silakan masukkan lagi.");
                    }
                } while (nilai < 1 || nilai > 5);
                survey[i][j] = nilai;
            }
        }

        System.out.println("\nHasil Survei:");
        System.out.print("          ");
        for (int j = 0; j < 6; j++) {
            System.out.print("P" + (j + 1) + " ");
        }
        System.out.println();
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Responden " + (i + 1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.print(survey[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nRata-rata untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            double rataRataResponden = total / 6.0;
            System.out.println("Responden " + (i + 1) + ": " + rataRataResponden);
        }

        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }
            double rataRataPertanyaan = total / 10.0;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRataPertanyaan);
        }

        int totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / 60.0;
        System.out.println("\nRata-rata keseluruhan: " + rataRataKeseluruhan);

        scanner.close();
    }
}