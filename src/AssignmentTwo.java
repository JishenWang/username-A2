public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
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
    // 创建一个Ride对象和一个操作员
        Employee operator = new Employee("YiMing", 40, "Female", "18954637834", "Ride Operator", 3000, "E12345");
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill", operator);    
        
        Visitor visitor6 = new Visitor("MingfanJiang", 25, "Male", "17346599637", "Standard", false, null);
        Visitor visitor7 = new Visitor("TuPi", 30, "Female", "14758457328", "VIP", true, null);
        Visitor visitor8 = new Visitor("ErXiong", 22, "Female", "18467364337", "Standard", false, null);
        Visitor visitor9 = new Visitor("DaXiong", 35, "Male", "19174624387", "VIP", true, null);
        Visitor visitor10 = new Visitor("FengLin", 28, "Male", "16484720473", "Standard", false, null);

        

        // 添加游客到队列
        rollerCoaster.addVisitorToQueue(visitor6);
        rollerCoaster.addVisitorToQueue(visitor7);
        rollerCoaster.addVisitorToQueue(visitor8);
        rollerCoaster.addVisitorToQueue(visitor9);
        rollerCoaster.addVisitorToQueue(visitor10);

        // 打印队列中的游客
        rollerCoaster.printQueue();

        // 移除一个游客并打印队列
        rollerCoaster.removeVisitorFromQueue(visitor8);
        rollerCoaster.printQueue();

        // 将游客添加到历史记录
        rollerCoaster.addVisitorToHistory(visitor6);
        rollerCoaster.addVisitorToHistory(visitor7);
        rollerCoaster.addVisitorToHistory(visitor9);

        // 检查一个游客是否在历史记录中
        rollerCoaster.checkVisitorFromHistory(visitor10);  // Not in history
        rollerCoaster.checkVisitorFromHistory(visitor6);  // In history

        // 打印历史记录中的游客数量
        System.out.println("Number of visitors in ride history: " + rollerCoaster.numberOfVisitors());

        // 打印所有历史记录中的游客
        rollerCoaster.printRideHistory();
    }
    public void partFourB() {
        // 创建员工和游乐设施
        Employee rideOperator = new Employee("YuexingLiang", 30, "Male", "17436548385", "Operator", 3000, "E001");
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill Ride", rideOperator);

        // 创建游客
        Visitor visitor11 = new Visitor("HuiMing", 25, "Female", "17343684927", "VIP", true, "2024-11-30");
        Visitor visitor12 = new Visitor("YifanYang", 30, "Male", "12857844782", "Standard", false, "2024-11-30");
        Visitor visitor13 = new Visitor("FengLin", 28, "Male", "12848574927", "Standard", true, "2024-11-30");
        Visitor visitor14 = new Visitor("YiWang", 35, "Female", "12759472475", "VIP", true, "2024-11-30");
        Visitor visitor15 = new Visitor("ZimuLi", 40, "Female", "13750317485", "Standard", false, "2024-11-30");

        // 添加游客到历史记录
        rollerCoaster.addVisitorToHistory(visitor11);
        rollerCoaster.addVisitorToHistory(visitor12);
        rollerCoaster.addVisitorToHistory(visitor13);
        rollerCoaster.addVisitorToHistory(visitor14);
        rollerCoaster.addVisitorToHistory(visitor15);

        // 打印排序前的游客历史记录
        System.out.println("Before Sorting:");
        rollerCoaster.printRideHistory();

        // 对游客进行排序
        Touristranking comparator = new Touristranking();
        rollerCoaster.sortRideHistory(comparator);

        // 打印排序后的游客历史记录
        System.out.println("\nAfter Sorting:");
        rollerCoaster.printRideHistory();
    }
    public void partFive() {
    }
    public void partSix() {
    }
    public void partSeven() {
    }
}
