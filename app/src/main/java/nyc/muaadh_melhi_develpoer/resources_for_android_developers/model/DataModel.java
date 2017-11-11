package nyc.muaadh_melhi_develpoer.resources_for_android_developers.model;

/**
 * Created by c4q on 11/11/17.
 */

public class DataModel {
    private String description ,gener ,link;
    private int pic;

    public DataModel(String description, String gener, String link, int pic) {
        this.description = description;
        this.gener = gener;
        this.link = link;
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public String getGener() {
        return gener;
    }

    public String getLink() {
        return link;
    }

    public int getPic() {
        return pic;
    }
}
