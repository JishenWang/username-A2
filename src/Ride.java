import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private final String rideName;
    private final String rideType; // 显示游乐设施类型
    private final Employee rideOperator; // 显示操作员的信息
    private final Queue<Visitor> visitorQueue;

    public Ride() {
        this.rideName = "";
        this.rideType = "";
        this.rideOperator = null;
        this.visitorQueue = new LinkedList<>();
    }

    public Ride(String rideName, String rideType, Employee rideOperator) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.rideOperator = rideOperator;
        this.visitorQueue = new LinkedList<>();
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
        throw new UnsupportedOperationException("Unimplemented method 'addVisitorToHistory'");
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        throw new UnsupportedOperationException("Unimplemented method 'checkVisitorFromHistory'");
    }

    @Override
    public int numberOfVisitors() {
        throw new UnsupportedOperationException("Unimplemented method 'numberOfVisitors'");
    }

    @Override
    public void printRideHistory() {
        throw new UnsupportedOperationException("Unimplemented method 'printRideHistory'");
    }
}
