import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class MaintenanceRequest {
    protected String priority;
    protected String status;
    protected LocalDate expireDate;

    public abstract void setPriority();

    public abstract void setStatus();
    
    public abstract void setExpireDate();
    
    public abstract void processRequest();


    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }
    public String getExpireDateString() {
        if (expireDate == null) return "N/A";
        return expireDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }
}