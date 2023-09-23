import java.util.Scanner;

public class Main {
    private static DriverLogic driverLogic =new DriverLogic();
    private static BusLogic busLogic = new BusLogic();
    private static AssignmentLogic assignmentLogic = new AssignmentLogic(driverLogic,busLogic);
    public static void main(String[] args) {
        while (true){
            printMenu();
            int functionChoice= chooseFunction();
            switch (functionChoice){
                case 1:
                    driverLogic.inputDriver();
                    driverLogic.showDriver();
                    break;
                case 2:
                    busLogic.inputBuses();
                    busLogic.showBuses();
                    break;
                case 3:
                    assignmentLogic.assignmentBus();
                    assignmentLogic.showAssignment();
                    break;
                case 4:
                    showSortMenu();
                    break;
                case 5:
                    assignmentLogic.sortByTotal();
                    break;
                case 6:
                    break;
                case 7:
                    return;
            }
        }

    }

    private static void showSortMenu() {
        System.out.println("Sắp xếp danh tài xế được phân công:");
        System.out.println("1. Theo tên tài xế");
        System.out.println("2. Theo tổng số lượt giảm dần");
        System.out.println("3. Quit");
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 3) {
                break;
            }
            System.out.println("Chức năng không hợp lệ, vui long chọn lại");
        } while (true);
        switch (functionChoice){
            case 1:
                assignmentLogic.sortByDriverName();
                break;
            case 2:
                assignmentLogic.sortByTotal();
                break;
            case 3:
                break;
        }


    }

    private static int chooseFunction() {
        System.out.println("Xin mời lựa chọn chức năng: ");
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 7) {
                break;
            }
            System.out.println("Chức năng không hợp lệ, vui long chọn lại");
        } while (true);
        return functionChoice;
    }

    private static void printMenu() {
        System.out.println("------PHẦN MỀM QUẢN LÝ LÁI XE BUS------");
        System.out.println("1. Nhập lái xe mới và in thông tin");
        System.out.println("2. Nhập tuyến mới và in danh sách các tuyến");
        System.out.println("3. Nhập danh dách phân công và in danh sách đó ");
        System.out.println("4. Sắp xếp danh sách phân công theo họ tên lái xe");
        System.out.println("5. Sắp xếp danh sách phân công theo số lượng tuyến(giảm dần)");
        System.out.println("6. Lập bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe");
        System.out.println("7. Thoát!");

    }
    

}
