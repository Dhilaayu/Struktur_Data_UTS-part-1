package com.mycompany.uts1_strukturdata;
public class UTS1_StrukturData {
    public static void main(String[] args) {
        String[] nama = {
            "PRINCESS RUBY CINTA", "SALMA SALSABILA", "PUTRI NURAINI", "ZULFA ULIN NUHA", 
            "PUTRI AULIA PERMATASARI", "FATIYA MEILINDASARI", "SEPTY PASYA RAHAYU", 
            "LUTHFIA ZULFA FADHILA", "DHILA AYU LESTARI", "CINDY PUSPA ALFANI","RIKE DYAH MAISORA"
        };
        long[] nim = {
            25161562008L, 25161562009L, 25161562014L, 25161562015L, 
            25161562016L, 25161562019L, 25161562025L, 25161562028L,
            25161562029L, 25161562030L, 25161562031L
        };
        int[] nilai = {
            95, 88, 90, 75, 77, 89, 80, 79, 96, 87,85
        };
        //=========== BUBLE SORT ===========
        for (int i = 0; i < nilai.length - 1; i++){
            for (int j = 0; j < nilai.length - 1; j++){
                if (nilai[j] < nilai[j + 1]){
                    int tempNilai = nilai[j];
                    nilai[j] = nilai[j+1];
                    nilai[j+1] = tempNilai;
                    
                    String tempNama = nama[j];
                    nama[j] = nama[j+1];
                    nama[j+1] = tempNama;
                    
                    long tempNim = nim[j];
                    nim[j] = nim[j+1];
                    nim[j+1] = tempNim;
                }
            }
        }
        //output
        System.out.println("\n              ==== BUBLE SORT ===               ");
        System.out.println("==================================================");
        System.out.printf("%-25s %-15s %-5s\n", "NAMA", "NIM", "NILAI");
        System.out.println("==================================================");

        for (int i = 0; i < nilai.length; i++) {
        System.out.printf("%-25s %-15s %-5d\n", nama[i], nim[i], nilai[i]);
        }
        System.out.println("==================================================");
        

        //=========== INSERTION SORT ===========
        String[] namaA = nama.clone();
        long[] nimA = nim.clone();
        int[] nilaiA = nilai.clone();
        
        for (int i = 0; i < nilai.length; i++){
            namaA[i] = nama[i];
            nimA[i] = nim[i];
            nilaiA[i] = nilai[i];
        }
        for (int i = 1; i < nilaiA.length; i++){
            int keyNilai = nilaiA[i];
            String keyNama = namaA[i];
            long keyNim = nimA[i];
            
            int b = i - 1;
            
            while ( b >= 0 && nilaiA[b] < keyNilai){
                nilaiA[b+1] = nilaiA[b];
                namaA[b+1] = namaA[b];
                nimA[b+1] = nimA[b];
                b--;         
            }     
            nilaiA[b+1] = keyNilai;
            namaA[b+1] = keyNama;
            nimA[b+1] = keyNim;
        }
        //output
        System.out.println("\n             ==== INSERTION SORT ===            ");
        System.out.println("==================================================");
        System.out.printf("%-25s %-15s %-5s\n", "NAMA", "NIM", "NILAI");
        System.out.println("==================================================");

        for (int i = 0; i < nilai.length; i++) {
        System.out.printf("%-25s %-15s %-5d\n", nama[i], nim[i], nilai[i]);
        }
        System.out.println("==================================================");
        
        //=========== SELECTION SORT ===========
        String[] namaB = nama.clone();
        long[] nimB = nim.clone();
        int[] nilaiB = nilai.clone();
        
        for (int i = 0; i < nilaiB.length - 1; i++){
        int max = i;
        
        for (int c = i + 1; c < nilaiB.length; c++){
            if (nilaiB[c] > nilaiB[max]){
                max = c;
            }
        }
        int tempNilai = nilaiB[i];
        nilaiB[i] = nilaiB[max];
        nilaiB[max] = tempNilai;
        
        String tempNama = namaB[i];
        namaB[i] = namaB[max];
        namaB[max] = tempNama;
        
        long tempNim = nimB[i];
        nimB[i] = nimB [max];
        nimB[max] = tempNim;
        }
        //output
        System.out.println("\n             ==== SELECTION SORT ===            ");
        System.out.println("==================================================");
        System.out.printf("%-25s %-15s %-5s\n", "NAMA", "NIM", "NILAI");
        System.out.println("==================================================");

        for (int i = 0; i < nilai.length; i++) {
        System.out.printf("%-25s %-15s %-5d\n", nama[i], nim[i], nilai[i]);
        }
        System.out.println("==================================================");    
    }
}
