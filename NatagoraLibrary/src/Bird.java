import java.util.ArrayList;
import java.util.HashMap;

public class Bird {
    private long Id;
    private HashMap<BodyPart,Color> Colors;
    private String Name;
    private String ScientificName;
    private ArrayList<String> Medias;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public HashMap<BodyPart, Color> getColors() {
        return Colors;
    }

    public void setColors(HashMap<BodyPart, Color> colors) {
        Colors = colors;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getScientificName() {
        return ScientificName;
    }

    public void setScientificName(String scientificName) {
        ScientificName = scientificName;
    }

    public ArrayList<String> getMedias() {
        return Medias;
    }

    public void setMedias(ArrayList<String> medias) {
        Medias = medias;
    }
}
