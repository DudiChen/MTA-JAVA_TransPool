import java.time.*;

public class TripOffer {

    private String m_DriversName;
    private int m_SeatsAvailable; // positive integer
    private String [] m_StationNames;
    private double m_PricePerKM; // in shmekels, positive double only
    private DayOfWeek m_DayOfTrip;
    private LocalDateTime m_TripStartTime;
    private boolean m_isRepeatingTrip;

    private Duration m_TripDuration;
    private double m_TripCost; // in shmekels, positive double only
    private double m_AvgFuelConsumption; // in fuels per trip
}

