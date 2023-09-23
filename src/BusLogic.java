import java.util.Scanner;

public class BusLogic {
    private Buses[] buses = new Buses[50];

    public Buses[] getBuses() {
        return buses;
    }

    public BusLogic() {
    }

    public void inputBuses() {
        System.out.print("Có bao nhiêu tuyến mới: ");
        int BusesNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < BusesNumber; i++) {
            System.out.println("Nhập thông tin cho tuyến thứ " + (i + 1));
            Buses buses1 = new Buses();
            buses1.inputInfo();
            saveBuses(buses1);
        }


    }

    private void saveBuses(Buses Buses1) {
        for (int i = 0; i < buses.length; i++) {
            if (buses[i]== null){
                buses[i]=Buses1;
                break;
            }
        }
    }
    public void showBuses(){
        for (int i = 0; i < buses.length; i++) {
            if (buses[i]!= null){
                System.out.println(buses[i]);
            }
        }
    }
    public Buses searchIdBus(int idBus){
        for (int j = 0; j < buses.length; j++) {
            if (buses[j].getId() == idBus) {
                return buses[j];
            }
        }
        return null;
    }

    public boolean isEmptyBus() {
        for (int i = 0; i < buses.length; i++) {
            if (buses[i]!=null){
                return false;
            }
        }
        return true;
    }
}
