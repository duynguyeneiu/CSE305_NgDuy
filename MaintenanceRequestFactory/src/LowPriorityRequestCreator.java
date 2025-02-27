public class LowPriorityRequestCreator extends RequestCreator {
    @Override
    public MaintenanceRequest createRequest() {
        return new LowPriorityRequest();
    }
}