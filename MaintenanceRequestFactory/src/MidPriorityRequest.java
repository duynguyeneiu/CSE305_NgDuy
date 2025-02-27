import java.time.LocalDate;

public class MidPriorityRequest extends MaintenanceRequest {

    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void setExpireDate() {
        this.expireDate = LocalDate.now().plusMonths(1);
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated completion date is " + getExpireDateString());
    }
}