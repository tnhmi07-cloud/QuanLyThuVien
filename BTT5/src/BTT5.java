
import java.util.Scanner;

public class BTT5 {
    protected String maSach, tenSach, tacGia;
    protected int namXuatBan, soLuong;
    protected double donGia;
    protected Scanner sc = new Scanner(System.in);

    public BTT5() {}
    public BTT5(String maSach, String tenSach, String tacGia,
                int namXuatBan, int soLuong, double donGia) 
    {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    public String getmaSach() {return maSach;}
    public String gettenSach() {return tenSach;}
    public String gettacGia() {return tacGia;}
    public int getnamXuatBan() {return namXuatBan;}
    public int getsoLuong() {return soLuong;}
    public double getdonGia() {return donGia;}

    public void Nhap() 
    {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = sc.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        sc.nextLine();
    }
    public double thanhTien() {return donGia * soLuong;}
    public void Xuat() 
    {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Thanh tien: " + thanhTien());
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BTT5[] ds = null;
        int n = 0;
        int chon;
        do {
            System.out.println("\n MENU ");
            System.out.println("1. Nhap n sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {

                case 1:
                    System.out.print("Nhap n: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    ds = new BTT5[n];
                    for (int i = 0; i < n; i++) 
                    {
                        System.out.println("\nNhap sach thu " + (i + 1));
                        ds[i] = new BTT5();
                        ds[i].Nhap();
                    }
                    break;

                case 2:
                    if (ds == null) {System.out.println("Vui long nhap sach truoc!");} 
                    else 
                    {
                        int tongSL = 0;
                        double tongGT = 0;
                        for (int i = 0; i < n; i++) 
                        {
                            tongSL += ds[i].soLuong;
                            tongGT += ds[i].thanhTien();
                        }
                        System.out.println("Tong so luong sach: " + tongSL);
                        System.out.println("Tong gia tri sach: " + tongGT);
                    }
                    break;

                case 3:
                    if (ds == null) {System.out.println("Vui long nhap sach truoc!");} 
                    else 
                    {
                        System.out.print("Nhap ma sach can tim: ");
                        String ma = sc.nextLine();
                        boolean timThay = false;
                        for (int i = 0; i < n; i++) 
                        {
                            if (ds[i].maSach.equalsIgnoreCase(ma)) 
                            {
                                ds[i].Xuat();
                                timThay = true;
                            }
                        }
                        if (!timThay) {System.out.println("Khong tim thay sach!");}
                    }
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } 
        while (chon != 0);
        sc.close();
    }
}
