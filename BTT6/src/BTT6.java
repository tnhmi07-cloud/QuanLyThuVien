
import java.util.Scanner;
import java.util.ArrayList;

public class BTT6 
{
    protected String maSach, tenSach, tacGia;
    protected int namXuatBan, soLuong;
    protected double donGia;
    protected Scanner sc = new Scanner(System.in);

    public BTT6() {}
    public BTT6(String maSach, String tenSach, String tacGia,
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
        namXuatBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
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

    // bai 1: nhap so luong 5 cuon sach
    public static void bai1() 
    {
        Scanner sc = new Scanner(System.in);
        int[] soLuong = new int[5];
        int tong = 0;
        int max;
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();
        }
        System.out.println("\nSo luong 5 cuon sach:");
        max = soLuong[0];
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Sach thu " + (i + 1) + ": " + soLuong[i]);
            tong += soLuong[i];
            if (soLuong[i] > max) {max = soLuong[i];}
        }
        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + max);
    }

    // bai 2: ArrayList luu ma sach
    public static void bai2() 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> maSach = new ArrayList<>();
        int chon;
        do 
        {
            System.out.println("\n===== MENU MA SACH =====");
            System.out.println("1. Them ma sach");
            System.out.println("2. Hien thi ma sach");
            System.out.println("3. Tim ma sach");
            System.out.println("4. Xoa ma sach");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) 
            {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    maSach.add(sc.nextLine());
                    break;

                case 2:
                    for (String ma : maSach) {System.out.println(ma);}
                    break;

                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    if (maSach.contains(maTim)) {System.out.println("Tim thay ma sach!");} 
                    else {System.out.println("Khong tim thay!");}
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    if (maSach.remove(maXoa)) {System.out.println("Da xoa ma sach!");} 
                    else {System.out.println("Khong tim thay ma sach!");}
                    break;

                case 0:
                    System.out.println("Thoat bai 2!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } 
        while (chon != 0);
    }

    // bai 3 va bai 4: ArrayList luu thong tin sach
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> danhSachSach = new ArrayList<>();
        int chon;
        do 
        {
            System.out.println("\n MENU QUAN LY SACH ");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) 
            {
                case 1:
                    BTT6 sach = new BTT6();
                    sach.Nhap();
                    String thongTin = sach.maSach + "|" + sach.tenSach + "|"
                            + sach.tacGia + "|" + sach.namXuatBan + "|"
                            + sach.donGia + "|" + sach.soLuong;

                    danhSachSach.add(thongTin);
                    System.out.println("Them sach thanh cong!");
                    break;

                case 2:
                    for (String s : danhSachSach) 
                    {
                        String[] tt = s.split("\\|");
                        System.out.println("\nMa sach: " + tt[0]);
                        System.out.println("Ten sach: " + tt[1]);
                        System.out.println("Tac gia: " + tt[2]);
                        System.out.println("Nam xuat ban: " + tt[3]);
                        System.out.println("Don gia: " + tt[4]);
                        System.out.println("So luong: " + tt[5]);
                        System.out.println("Thanh tien: "
                                + (Double.parseDouble(tt[4])
                                * Integer.parseInt(tt[5])));
                    }
                    break;

                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;
                    for (String s : danhSachSach) 
                    {
                        String[] tt = s.split("\\|");
                        if (tt[0].equalsIgnoreCase(maTim)) 
                        {
                            System.out.println(s);
                            timThay = true;
                        }
                    }
                    if (!timThay) {System.out.println("Khong tim thay sach!");}
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    timThay = false;
                    for (int i = 0; i < danhSachSach.size(); i++) 
                    {
                        String[] tt = danhSachSach.get(i).split("\\|");
                        if (tt[0].equalsIgnoreCase(maXoa)) 
                        {
                            danhSachSach.remove(i);
                            System.out.println("Xoa sach thanh cong!");
                            timThay = true;
                            break;
                        }
                    }
                    if (!timThay) {System.out.println("Khong tim thay sach!");}
                    break;

                case 5:
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();
                    timThay = false;
                    for (int i = 0; i < danhSachSach.size(); i++) 
                    {
                        String[] tt = danhSachSach.get(i).split("\\|");
                        if (tt[0].equalsIgnoreCase(maSua)) 
                        {
                            BTT6 sachSua = new BTT6();
                            sachSua.Nhap();
                            String thongTinSua = sachSua.maSach + "|"
                                    + sachSua.tenSach + "|"
                                    + sachSua.tacGia + "|"
                                    + sachSua.namXuatBan + "|"
                                    + sachSua.donGia + "|"
                                    + sachSua.soLuong;
                            danhSachSach.set(i, thongTinSua);
                            System.out.println("Sua sach thanh cong!");
                            timThay = true;
                            break;
                        }
                    }
                    if (!timThay) {System.out.println("Khong tim thay sach!");}
                    break;

                case 6:
                    int tongSL = 0;
                    for (String s : danhSachSach) 
                    {
                        String[] tt = s.split("\\|");
                        tongSL += Integer.parseInt(tt[5]);
                    }
                    System.out.println("Tong so luong sach: " + tongSL);
                    break;

                case 7:
                    double tongGT = 0;
                    for (String s : danhSachSach) 
                    {
                        String[] tt = s.split("\\|");
                        tongGT += Double.parseDouble(tt[4])
                                * Integer.parseInt(tt[5]);
                    }
                    System.out.println("Tong gia tri sach: " + tongGT);
                    break;

                case 8:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } 
        while (chon != 8);
    }
}
