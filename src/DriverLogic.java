import java.util.Scanner;

public class DriverLogic {
    private Driver[] drivers = new Driver[50];

    public DriverLogic() {
    }

    public DriverLogic(Driver[] drivers) {
        this.drivers = drivers;
    }

    public void inputDriver() {
        System.out.print("Có bao nhiêu tài xế mới: ");
        int driverNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < driverNumber; i++) {
            System.out.println("Nhập thông tin cho tài xế thứ " + (i + 1));
            Driver diver = new Driver();
            diver.inputInfo();
            saveDriver(diver);
        }
    }

    private void saveDriver(Driver diver) {
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i]== null){
                drivers[i]=diver;
                break;
            }
        }
    }
    public void showDriver(){
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i]!= null){
                System.out.println(drivers[i]);
            }
        }
    }
    public Driver searchIdDriver(int driverId){
        for (int j = 0; j < drivers.length; j++) {
            if (drivers[j].getId() == driverId) {
                return drivers[j];
            }
        }
        return null;
    }
    public boolean isEmptyDriver(){
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i]!=null){
                return false;
            }
        }
        return true;
    }


}
