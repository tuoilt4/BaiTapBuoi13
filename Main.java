import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BaiTapBuoi13 bt = new BaiTapBuoi13();
        String hoten;
        do {
            System.out.print("Nhập họ và tên cần chuẩn hóa: ");
            hoten = sc.nextLine();
        }
        while (bt.ktrChu(hoten) ==false|| bt.ktrSpace(hoten)==false);

        bt.chuanhoaten(hoten);

    }

}
