import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên sinh viên: ");
        String fullName = sc.nextLine();
        String major;
        do {
            System.out.println("Nhập ngành: ");
            major = sc.nextLine();
            if (major.equalsIgnoreCase("it")){
                SinhVienIT sinhVienIT = new SinhVienIT();
                sinhVienIT.setFullName(fullName);
                sinhVienIT.setMajor(major);
                double java;
                double html;
                double css;
                do {
                    System.out.println("Nhập điểm JAVA: ");
                    java = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập điểm HTML: ");
                    html = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập điểm CSS: ");
                    css = Double.parseDouble(sc.nextLine());
                    sinhVienIT.setJava(java);
                    sinhVienIT.setHtml(html);
                    sinhVienIT.setCss(css);
                    if (0 <= java && java <= 10 && 0 <= html && html <= 10 && 0 <= css && css <= 10
                    ) {
                        break;
                    }
                    System.out.println("Nhập điểm không chính xác, mời nhập lại");
                } while (0 > java || java > 10 || 0 > html || html > 10 || 0 > css || css > 10);
                sinhVienIT.xuat();
            } else if (major.equalsIgnoreCase("biz")) {
                SinhVienBiz sinhVienBiz = new SinhVienBiz();
                sinhVienBiz.setFullName(fullName);
                sinhVienBiz.setMajor(major);
                double marketing;
                double sales;
                do {
                    System.out.println("Nhập điểm Marketing: ");
                    marketing = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập điểm Sales: ");
                    sales = Double.parseDouble(sc.nextLine());
                    sinhVienBiz.setMarketing(marketing);
                    sinhVienBiz.setSales(sales);
                    if (0 <= marketing && marketing <= 10 && 0 <= sales && sales <= 10) {
                        break;
                    }
                    System.out.println("Nhập điểm không chính xác, mời nhập lại");
                } while (0 > marketing || marketing > 10 || 0 > sales || sales > 10 );
                sinhVienBiz.xuat();
            }
            if (major.equalsIgnoreCase("it") || major.equalsIgnoreCase("biz")){
                break;
            }
            System.out.println("Không tìm thấy ngành này, mời nhập lại");

        } while (major != "");

    }
}