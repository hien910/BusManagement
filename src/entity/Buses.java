package entity;

import entity.InputInfo;

import java.util.Scanner;

public class Buses implements InputInfo {
    private int id;
    private static int ID_AUTOBUS = 100;
    private String distance;
    private int numBusStop;

    public Buses() {
        this.id = ID_AUTOBUS;
        ID_AUTOBUS++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public int getNumBusStop() {
        return numBusStop;
    }

    public void setNumBusStop(int numBusStop) {
        this.numBusStop = numBusStop;
    }

    @Override
    public String toString() {
        return "entity.Buses{" +
                "id=" + id +
                ", distance='" + distance + '\'' +
                ", numBusStop=" + numBusStop +
                '}';
    }

    @Override
    public void inputInfo() {
//        System.out.println("Nhập tên:");
//        this.setId(new Scanner(System.in).nextInt());
        System.out.print("Nhập khoảng cách: ");
        this.setDistance(new Scanner(System.in).nextLine());
        System.out.print("Nhập số điểm dừng: ");
        this.setNumBusStop(new Scanner(System.in).nextInt());
    }
}
