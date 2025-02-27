public abstract class RequestCreator {
 
    public abstract MaintenanceRequest createRequest();

    public void process() {
        MaintenanceRequest request = createRequest();
        request.setPriority();
        request.setStatus();
        request.setExpireDate();
    
        request.processRequest();

        System.out.println(" Request:");
        System.out.println("Priority: " + request.getPriority());
        System.out.println("Status: " + request.getStatus());
        System.out.println("Expire Day: " + request.getExpireDateString());
    }
}