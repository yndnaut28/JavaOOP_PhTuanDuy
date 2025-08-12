/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BTVN;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class BTVN_11_08_2025 {
    static void out(Object s) {
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        ArrayList<Integer> ds = new ArrayList<>();
        int id;
        do{
            out("MENU");
            out("1. Nhap so moi");
            out("2. In ra day so");
            out("3. Sap xep tang dan");
            out("4. Tim gia tri lon nhat");
            out("5. Thoat");
            out("Nhap chuc nang: ");
            
            id = sc.nextInt();
            switch(id){
                case 1:
                    out("Nhap so nguyen: ");
                    int num = sc.nextInt();
                    ds.add(num);
                    break;
                case 2:
                    out("Danh sach so da them: " + ds);
                    break;
                case 3:
                    Collections.sort(ds);
                    out("Danh sach sau sap xep: " + ds);
                    break;
                case 4:
                    if(ds.isEmpty()){
                        out("Khong co gia tri nao");
                    }
                    else{
                        int max = Collections.max(ds);
                        out("Gia tri lon nhat cua day so: " + max);
                        break;
                    }
                case 5:
                    out("GOOD BYE");
                    break;
            }
        }
        while(id != 5);
        sc.close();
    }

}
