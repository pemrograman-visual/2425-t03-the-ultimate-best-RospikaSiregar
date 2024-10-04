// 12S24008 - ROSPIKA SARAH YOSEFIN SIREGAR
// 12S24013 - ADRYAN JULIANTO PANJAITAN

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judulbuku, penulis, kategori, formatbukuelektronik, penerbit, tub, kategoridiskon;
        int tahunterbit, stokbuku;
        double hargapembelian, minimummargin, rating, diskon;

        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                judulbuku = input.nextLine();
                penulis = input.nextLine();
                tahunterbit = input.nextInt();
                penerbit = input.nextLine();
                formatbukuelektronik = input.nextLine();
                hargapembelian = input.nextDouble();
                minimummargin = input.nextDouble();
                diskon = minimummargin / hargapembelian * -1;
                if (diskon > 0.4) {
                    kategoridiskon = "Once in a lifetime";
                } else {
                    if (diskon > 0.2) {
                        kategoridiskon = "Never come twice";
                    } else {
                        kategoridiskon = "No regret";
                    }
                }
                stokbuku = input.nextInt();
                rating = input.nextDouble();
                if (rating >= 4.7 && rating <= 5.0) {
                    kategori = "Best Pick";
                } else {
                    if (rating >= 4.5 && rating < 4.7) {
                        kategori = "Must Read";
                    } else {
                        if (rating >= 4.0 && rating < 4.5) {
                            kategori = "Recommended";
                        } else {
                            if (rating >= 3.0 && rating < 4.0) {
                                kategori = "Average";
                            } else {
                                if (rating < 3.0 && rating >= 0) {
                                    kategori = "Low";
                                }
                            }
                        }
                    }
                }
                if (kategoridiskon.equals("Once in a lifetime") && kategori.equals("Best pick")) {
                    tub = "The ultimate best";
                } else {
                    tub = "---";
                }
                System.out.println(iSBN + "|" + judulbuku + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbukuelektronik + "|" + hargapembelian + "|" + minimummargin + "|" + stokbuku + "|" + rating + "|" + kategori + "|" + kategoridiskon + "|" + tub);
            }
        } while (!iSBN.equals("---"));
    }
}
