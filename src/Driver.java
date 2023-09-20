import java.util.Scanner;

public class Driver extends Person {
    private int id;
    private static int ID_AUTO=10000;
    private Level level;

    public Driver() {
        this.id = ID_AUTO;
        ID_AUTO++;
    }

    @Override
    public String toString() {
        return "Driver{" +
                " id=" + id +
                " Name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", level=" + level +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdAuto() {
        return ID_AUTO;
    }

    public static void setIdAuto(int idAuto) {
        ID_AUTO = idAuto;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public void inputInfo() {
//        System.out.println("Nhập id:");
//        this.setId(new Scanner(System.in).nextInt());
//        System.out.println("Nhập tên:");
//        this.setId(new Scanner(System.in).nextInt());
//        System.out.println("Nhập địa chỉ:");
//        this.setAddress(new Scanner(System.in).nextLine());
//        System.out.println("Nhập số điện thoại:");
//        this.setPhone(new Scanner(System.in).nextLine());
        super.inputInfo();
        System.out.println("Nhập level, chọn 1 trong các level sau:");
        System.out.println("1. Level A");
        System.out.println("2. Level B");
        System.out.println("3. Level C");
        System.out.println("4. Level D");
        System.out.println("5. Level E");
        System.out.println("6. Level F");
        int a;
        do {
            a = new Scanner(System.in).nextInt();
            if (a>0&&a<7){
                break;
            }
            System.out.println("vui long nhập lại");
        }while (true);
        switch (a) {
            case 1 -> this.setLevel(Level.A);
            case 2 -> this.setLevel(Level.B);
            case 3 -> this.setLevel(Level.C);
            case 4 -> this.setLevel(Level.D);
            case 5 -> this.setLevel(Level.E);
            case 6 -> this.setLevel(Level.F);
        }
    }

}
