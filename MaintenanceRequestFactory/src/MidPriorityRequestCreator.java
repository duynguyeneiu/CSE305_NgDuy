public class MidPriorityRequestCreator extends RequestCreator {
    @Override
    public MaintenanceRequest createRequest() {
        return new MidPriorityRequest();
    }
}