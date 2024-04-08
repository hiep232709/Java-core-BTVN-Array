package JavaCoreBTVNArray;

import java.util.Scanner;

public class MenuTruyCapHaiBai {
    public static void chuanHoaHovaTen(){

    }

    public static void taoMang(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Hay nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu o vi tri " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Ta co mang nhu sau: arr = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("\n+======================================+");
        System.out.println("Thay doi cac phan tu la so chan trong mang tang len mot don vi");
        System.out.print("Mang sau khi thay doi: arr = ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] + 1;
            } else {
                arr[i] = arr[i];
            }
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n********* BANG CAC CHUC NANG *********");
        System.out.println("1 - Chuan hoa Ho va Ten nhap vao");
        System.out.println("2 - Tao mang va thay doi mang");
        System.out.println("4 - Ket thuc");
        System.out.println("**************************************");

        System.out.print("Nhap lua chon chuc nang: ");
        int choose = sc.nextInt();
        switch (choose){
            case 1: {
                System.out.println("!!===========================!!");
                System.out.println("CHAY CHUC NANG CHUAN HOA HO VA TEN NHAP VAO");
                chuanHoaHovaTen();
                break;
            }
            case 2: {
                System.out.println("!!===========================!!");
                System.out.println("CHAY CHUC NANG TAO MANG VA THAY DOI MANG");
                taoMang();
                break;
            }
            default:{
                System.out.println("!!===========================!!");
                System.out.println("Ket thuc lua chon");
                break;
            }
        }
    }
}
