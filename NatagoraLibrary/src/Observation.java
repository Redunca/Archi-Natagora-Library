import java.util.ArrayList;
import java.util.HashMap;

public class Observation {
    private long Id;
    private HashMap<Bird,Integer> Birds;
    private ArrayList<String> Medias;
    private String Comment;
    private ObservationStatus Status;

    public Observation() {
        Birds = new HashMap<>();
        Medias = new ArrayList<>();
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public HashMap<Bird, Integer> getBirds() {
        return Birds;
    }

    public void setBirds(HashMap<Bird, Integer> birds) {
        Birds = birds;
    }

    public ArrayList<String> getMedias() {
        return Medias;
    }

    public void setMedias(ArrayList<String> medias) {
        Medias = medias;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public ObservationStatus getStatus() {
        return Status;
    }

    public void setStatus(ObservationStatus status) {
        Status = status;
    }
}
