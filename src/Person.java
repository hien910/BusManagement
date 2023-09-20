import java.util.Scanner;

public class Person implements InputInfo{
    private String Name;
    private String address;
    private String phone;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        System.out.println("Nhập tên:");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ:");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập số điện thoại:");
        this.setPhone(new Scanner(System.in).nextLine());
    }
}
