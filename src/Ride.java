import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private final String rideName;
    private final String rideType; // 显示游乐设施类型
    private final Employee rideOperator; // 显示操作员的信息
    private final Queue<Visitor> visitorQueue;
    private final LinkedList<Visitor> rideHistory;  // 存储已乘坐过的游客


    public Ride() {
        this.rideName = "";
        this.rideType = "";
        this.rideOperator = null;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public Ride(String rideName, String rideType, Employee rideOperator) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.rideOperator = rideOperator;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // 接口RideInterface中实现方法

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        visitorQueue.offer(visitor);
        System.out.println("Visitor " + visitor.getName() + " has been added to the queue.");
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitorQueue.remove(visitor)) {
            System.out.println("Visitor " + visitor.getName() + " has been removed from the queue.");
        } else {
            System.out.println("Visitor " + visitor.getName() + " was not found in the queue.");
        }
    }

    @Override
    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Visitors in the queue for " + rideName + " (" + rideType + "):");
            for (Visitor visitor : visitorQueue) {
                System.out.println(visitor.getName() + ", Age: " + visitor.getAge() + ", Phone: " + visitor.getPhoneNumber() + ", tickeType: " + visitor.getTicketType() + ", hasFastPass: " + visitor.isHasFastPass() + ", visitDate: " + visitor.getVisitDate());
            }
        }
    }

    public void printRideOperator() {
        if (rideOperator != null) {
            System.out.println("Ride Operator: " + rideOperator.getName() + " (" + rideOperator.getEmployeeID() + ")");
        } else {
            System.out.println("No operator assigned.");
        }
    }

    @Override
    public void runOneCycle() {
        throw new UnsupportedOperationException("Unimplemented method 'runOneCycle'");
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println("Visitor " + visitor.getName() + " has been added to the ride history.");
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        if (rideHistory.contains(visitor)) {
            System.out.println("Visitor " + visitor.getName() + " is in the ride history.");
            return true;
        } else {
            System.out.println("Visitor " + visitor.getName() + " has not yet taken the ride.");
            return false;
        }
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("No visitors have taken the ride yet.");
        } else {
            System.out.println("Visitors who have taken the ride:");
            Iterator<Visitor> iterator = rideHistory.iterator();
            while (iterator.hasNext()) {
                Visitor visitor = iterator.next();
                System.out.println(visitor.getName() + ", " + visitor.getAge() + " years old, " + visitor.getPhoneNumber());
            }
        }
    }
}
