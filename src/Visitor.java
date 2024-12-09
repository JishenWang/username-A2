public class Visitor extends Person {
    private String ticketType;
    private boolean hasFastPass;
    private String visitDate;

    public Visitor() {
        super();
        this.ticketType = "";
        this.hasFastPass = false;
        this.visitDate = "";
    }

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
    @Override
    public String toString() {
        return getName() + ", " + getAge() + ", " + getGender() + ", " + getPhoneNumber() + ", " + getTicketType() + ", " + isHasFastPass() + ", " + getVisitDate();
    }

    public static Visitor fromString(String data) {
        String[] parts = data.split(","); 
        if (parts.length == 7) {
            try {
                String name = parts[0].trim();
                int age = Integer.parseInt(parts[1].trim());
                String gender = parts[2].trim();
                String phoneNumber = parts[3].trim();
                String ticketType =parts[4].trim();
                boolean hasFastTrack = Boolean.parseBoolean(parts[5].trim());
                String visitDate =parts[6].trim();
                
                return new Visitor(name, age, gender, phoneNumber, ticketType, hasFastTrack, visitDate);
            } catch (NumberFormatException e) {
                System.out.println("解析游客信息出错：" + e.getMessage());
                return null; 
            }
        }
        return null;
    }

}
