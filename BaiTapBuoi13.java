import java.util.Scanner;

public class BaiTapBuoi13 {
    public void chuanhoaten(String ten)
    {
        Scanner sc= new Scanner(System.in);
        ten = ten.trim();
        ten = ten.replaceAll("\\s+"," ");
        ten = ten.toLowerCase();
        ten = ten.replace(ten.valueOf(ten.charAt(0)),ten.valueOf(ten.charAt(0)).toUpperCase());
        for (int i = 0; i < ten.length(); i++) {
            char kyTu = ten.charAt(i);
            if (Character.isSpaceChar(kyTu)) {
                ten = ten.replace(ten.valueOf(ten.charAt(i+1)),ten.valueOf(ten.charAt(i+1)).toUpperCase());
            }
        }
        System.out.print("Họ tên đã chuẩn hóa: "+ten);

    }

    public boolean ktrChu (String ten) {
        for (int i = 0; i < ten.length(); i++) {
            char kyTu = ten.charAt(i);
            if (!Character.isLetter(kyTu) & !Character.isSpaceChar(kyTu)){
                return false;
            }
        }
            return true;

    }
    public boolean ktrSpace (String ten) {
        for (int i = 0; i < ten.length(); i++) {
            char kyTu = ten.charAt(i);
            if (!Character.isSpaceChar(kyTu)) {
                return true;
            }
        }
        return false;
    }
}
