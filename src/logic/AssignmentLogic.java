package logic;

import entity.Assignment;
import entity.BusAssignment;
import entity.Buses;
import entity.Driver;

import java.util.Scanner;

public class AssignmentLogic {
    private Assignment[] assignments = new Assignment[50];
    private static DriverLogic driverLogic;
    private static BusLogic busLogic;

    public AssignmentLogic(DriverLogic driverLogic, BusLogic busLogic) {
        this.driverLogic = driverLogic;
        this.busLogic = busLogic;
    }

    public void assignmentBus() {
        if (driverLogic.isEmptyDriver()&& busLogic.isEmptyBus()){
            System.out.println("chưa có thông tin");
            return;
        }
        System.out.println("Có bao nhiêu lái xe được phân công");
        int numDriver = new Scanner(System.in).nextInt();
        for (int i = 0; i < numDriver; i++) {
            System.out.println("nhập thông tin cho tài xế thứ " + (i + 1));
            System.out.print("nhập id của lái xe được phân công: ");
            int driverId;
            Driver driver = null;
            do {
                driverId = new Scanner(System.in).nextInt();
                driver = driverLogic.searchIdDriver(driverId);
                if (driver == null) {
                    System.out.println("Không tồn tại tài xế có id: " + driverId + " ,vui lòng nhập lại id: ");
                }
            } while (driver == null);

            System.out.println("tài xế chạy bao nhiêu tuyến: ");
            int numbuses = new Scanner(System.in).nextInt();
            BusAssignment[] details = new BusAssignment[numbuses];


            int count = 0;

            for (int j = 0; j < numbuses; j++) {
                System.out.println("thông tin cho tuyến thứ " + (j + 1));
                System.out.print("nhập id của tuyến: ");
                int busId;
                Buses buses1 = null;
                do {
                    busId = new Scanner(System.in).nextInt();
                    buses1 = busLogic.searchIdBus(busId);
                    if (buses1 == null) {
                        System.out.println("Không tồn tại tuyến nào có id: " + busId + " ,vui lòng nhập lại id: ");
                    }
                } while (buses1 == null);
                System.out.println("Tài xế chạy tuyến " + busId + " bao nhiêu lượt");
                int totalDriver = 0;
                int quantity;
                do {
                    quantity = new Scanner(System.in).nextInt();
                    if (quantity <= 15-totalDriver) {
                        break;
                    }
                    System.out.println("tổng số lượt vượt quá(<=15), vui lòng nhập lại: ");
                } while (true);

                BusAssignment detail = new BusAssignment(buses1, quantity);
                details[count] = detail;
                count++;


                for (int k = 0; k < details.length; k++) {
                    totalDriver += details[k].getTurn();
                }


                Assignment assignment = new Assignment(driver, details, totalDriver);
                saveAssignment(assignment);
            }
        }
    }

    private void saveAssignment(Assignment assignment) {
        for (int i = 0; i < assignments.length; i++) {
            if (assignments[i] == null) {
                assignments[i] = assignment;
                break;
            }
        }
    }

    public void showAssignment() {
        for (int i = 0; i < assignments.length; i++) {
            if (assignments[i] != null) {
                System.out.println(assignments[i]);
            }
        }
    }

    public void searchByDriverName() {
        System.out.println("Nhập tên bạn muốn tìm kiếm: ");
        String nameDriver = new Scanner(System.in).nextLine();
        for (int i = 0; i < assignments.length; i++) {
            if (assignments[i] != null && assignments[i].getDriver().getName().toLowerCase().contains(nameDriver.toLowerCase()))
                ;
        }

    }


    public void sortByDriverName() {
        if (isEmptyAssignment()){
            System.out.println("chưa có thông tin");
            return;
        }
        for (int i = 0; i < assignments.length - 1; i++) {
            if (assignments[i] == null) {
                continue;
            }
            for (int j = i + 1; i < assignments.length; i++) {
                if (assignments[j] != null &&
                        assignments[i].getDriver().getName().compareToIgnoreCase(assignments[j].getDriver().getName()) > 0) {
                    Assignment temp = assignments[i];
                    assignments[i] = assignments[j];
                    assignments[j] = temp;
                }
            }
        }
        showAssignment();
    }

    public boolean isEmptyAssignment() {
        for (int i = 0; i < assignments.length; i++) {
            if (assignments[i]!=null){
                return false;
            }
        }
        return true;
    }

    public void sortByTotal() {
        if (isEmptyAssignment()){
            System.out.println("chưa có thông tin");
            return;
        }
        for (int i = 0; i < assignments.length - 1; i++) {
            if (assignments[i] == null) {
                continue;
            }
            for (int j = i + 1; i < assignments.length; i++) {
                if (assignments[j] != null &&
                        assignments[i].getTotalTurn() > assignments[j].getTotalTurn()) {
                    Assignment temp = assignments[i];
                    assignments[i] = assignments[j];
                    assignments[j] = temp;
                }
            }
        }
        showAssignment();
    }
}
