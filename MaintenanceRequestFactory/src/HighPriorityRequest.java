import java.time.LocalDate;

public class HighPriorityRequest extends MaintenanceRequest {

    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setStatus() {
        this.status = "Accept";
    }

    @Override
    public void setExpireDate() {
        this.expireDate = LocalDate.now();
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }
}