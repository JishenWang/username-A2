import java.util.Comparator;

public class Touristranking implements Comparator<Visitor> {
    @Override
    public int compare(Visitor visitor1, Visitor visitor2) {
        // 根据年龄（升序）比较
        int ageComparison = Integer.compare(visitor1.getAge(), visitor2.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }
        // 如果年龄相同，再根据票类型（字母顺序）比较
        return visitor1.getTicketType().compareTo(visitor2.getTicketType());
    }
}