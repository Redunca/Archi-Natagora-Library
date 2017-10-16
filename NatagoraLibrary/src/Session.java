import java.sql.Date;
import java.util.ArrayList;

public class Session {
    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Date getSessionStart() {
        return SessionStart;
    }

    public void setSessionStart(Date sessionStart) {
        SessionStart = sessionStart;
    }

    public Date getSessionEnd() {
        return SessionEnd;
    }

    public void setSessionEnd(Date sessionEnd) {
        SessionEnd = sessionEnd;
    }

    public float getLatitude() {
        return Latitude;
    }

    public void setLatitude(float latitude) {
        Latitude = latitude;
    }

    public float getLongitude() {
        return Longitude;
    }

    public void setLongitude(float longitude) {
        Longitude = longitude;
    }

    private long Id;
    private Date SessionStart;
    private Date SessionEnd;
    private float Latitude;
    private float Longitude;
    private ArrayList<Observation> Observations;

    public Session() {
        Observations = new ArrayList<>();
    }

    public ArrayList<Observation> getObservations() {
        return Observations;
    }

    public void setObservations(ArrayList<Observation> observations) {
        Observations = observations;
    }
}
