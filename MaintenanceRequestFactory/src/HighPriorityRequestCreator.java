public class HighPriorityRequestCreator extends RequestCreator {
    @Override
    public MaintenanceRequest createRequest() {
        return new HighPriorityRequest();
    }
}