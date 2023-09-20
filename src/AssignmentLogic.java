import java.util.Scanner;

public class AssignmentLogic {
    private Assignment[] assignments = new Assignment[50];
    private static DriverLogic driverLogic;
    private static BusLogic busLogic;

    public AssignmentLogic(DriverLogic driverLogic, BusLogic busLogic) {
        this.driverLogic= driverLogic;
        this.busLogic = busLogic;
    }

    public void assignmentBus() {
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
            int temp = 0;
            for (int j = 0; j < numbuses; j++) {
                System.out.println("thông tin cho tuyến thứ " + (j + 1));
                System.out.print("nhập id của tuyến: ");
                int busId;
                Buses buses1 = null;
                do {
                    busId = new Scanner(System.in).nextInt();
                    buses1= busLogic.searchIdBus(busId);
                    if (buses1 == null) {
                        System.out.println("Không tồn tại tuyến nào có id: " + busId + " ,vui lòng nhập lại id: ");
                    }
                } while (buses1 == null);

                System.out.println("Tài xế chạy tuyến " + busId + " bao nhiêu lượt");
                int quantity;

                do {
                    quantity = new Scanner(System.in).nextInt();
                    temp = temp + quantity;
                    if (temp <= 15) {
                        break;
                    }
                    System.out.println("quá số lượt(<=15), vui long nhập lại: ");
                } while (true);
                BusAssignment detail = new BusAssignment(buses1, quantity);
                details[count] = detail;
                count++;


                Assignment assignment = new Assignment(driver, details);
                saveAssignment(assignment);
            }


        }
    }

    private void saveAssignment(Assignment assignment) {
         for (int i = 0; i < assignments.length; i++) {
            if (assignments[i]== null){
                assignments[i]=assignment;
                break;
            }
        }
    }
    public void showAssignment(){
        for (int i = 0; i < assignments.length; i++) {
            if (assignments[i]!= null){
                System.out.println(assignments[i]);
            }
        }
    }

}
