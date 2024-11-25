public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
    }
    public void partThree() {
// 创建Ride和游客
        Employee rideOperator = new Employee("Tom", 30, "Male", "123456789", "Operator", 3000, "E001");
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill Ride", rideOperator);

        // 创建游客
        Visitor v1 = new Visitor("Jeirui", 25, "Female", "18437897584", "VIP", true, "2024-11-25");
        Visitor v2 = new Visitor("AotianLong", 30, "Male", "17485934792", "Standard", false, "2024-11-25");
        Visitor v3 = new Visitor("YueLiang", 28, "Male", "14939472974", "Standard", true, "2024-11-25");
        Visitor v4 = new Visitor("ChengMing", 35, "Female", "19673863954", "VIP", true, "2024-11-25");
        Visitor v5 = new Visitor("YiJue", 22, "Female", "17548239470", "Standard", false, "2024-11-25");

        // 添加游客到队列
        rollerCoaster.addVisitorToQueue(v1);
        rollerCoaster.addVisitorToQueue(v2);
        rollerCoaster.addVisitorToQueue(v3);
        rollerCoaster.addVisitorToQueue(v4);
        rollerCoaster.addVisitorToQueue(v5);

        // 打印队列
        rollerCoaster.printQueue();

        // 移除游客
        rollerCoaster.removeVisitorFromQueue(v3);
        
        // 打印队列
        rollerCoaster.printQueue();

        // 打印操作员信息
        rollerCoaster.printRideOperator();
    }
    public void partFourA() {
    }
    public void partFourB() {
    }
    public void partFive() {
    }
    public void partSix() {
    }
    public void partSeven() {
    }
}
