package JavaCoreBTVNArray;

import java.util.Scanner;

public class ArrayBai2 {
    //    Câu 2: Viết chương trình thực hiện:
//    Tạo mảng số nguyên gồm n phần tử với n nhập vào từ bàn phím
//    Nhập các phần tử mảng
//    In mảng ra màn hình
//    Thay đổi các phần tử là số chẵn trong mảng tăng lên 1 phần tử
//    Ví dụ : [1,4,7,6,2,3] -> [1,5,7,7,3,3]
    public static void main(String[] args) {
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
}
