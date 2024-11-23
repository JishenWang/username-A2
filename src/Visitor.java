public class Visitor extends Person {
    private String ticketType;
    private boolean hasFastPass;
    private String visitDate;

    // Default constructor
    public Visitor() {
        super();
        this.ticketType = "";
        this.hasFastPass = false;
        this.visitDate = "";
    }

    // Constructor with parameters
    public Visitor(String name, int age, String gender, String phoneNumber, String ticketType, boolean hasFastPass, String visitDate) {
        super(name, age, gender, phoneNumber); // Calling the superclass constructor
        this.ticketType = ticketType;
        this.hasFastPass = hasFastPass;
        this.visitDate = visitDate;
    }

    // Getters and Setters
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public boolean isHasFastPass() {
        return hasFastPass;
    }

    public void setHasFastPass(boolean hasFastPass) {
        this.hasFastPass = hasFastPass;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }
}
