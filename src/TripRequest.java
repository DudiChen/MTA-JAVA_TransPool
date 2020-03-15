import java.time.LocalDateTime;

public class TripRequest {

    private String m_NameOfApplicant;
    private String m_FromStation;
    private String m_ToStation;
    private LocalDateTime m_RequestedTimeOfArrival;
    private LocalDateTime m_RequestedTimeOfDeparture;
    private boolean m_isTripSegmented;
}
