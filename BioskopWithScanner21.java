import java.util.Scanner;
public class BioskopWithScanner21 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int kolom, baris, menu;
        String nama, next;

        while(true) {
            System.out.println("-------------");
            System.out.println("PILIHAN MENU ");
            System.out.println("1. input data");
            System.out.println("2. output");
            System.out.println("3. exit");
            System.out.print("Masukkan pilihan menu : ");
            menu = sc.nextInt();

        if (menu == 1) {
            while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.next();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            while (baris < 1 || baris > (penonton.length) || kolom < 1  || kolom > penonton[0].length || penonton[baris-1][kolom-1] != null) {
                System.out.println("INPUT TIDAK VALID!");
                System.out.print("Masukkan baris : ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom : ");
                kolom = sc.nextInt();
            }

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
            }
        }
        else if (menu == 2) {
            System.out.println("Daftar Penonton");
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                        System.out.printf("*** \t");
                    } else {
                        System.out.printf("%s \t ", penonton[i][j]);
                    }
                }
                System.out.println();
            }
            break;
        } else {
            break;
            }
        }
    }
}
