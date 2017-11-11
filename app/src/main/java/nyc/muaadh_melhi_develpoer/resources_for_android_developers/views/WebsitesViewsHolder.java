package nyc.muaadh_melhi_develpoer.resources_for_android_developers.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.muaadh_melhi_develpoer.resources_for_android_developers.R;
import nyc.muaadh_melhi_develpoer.resources_for_android_developers.model.DataModel;

/**
 * Created by c4q on 11/11/17.
 */

public class WebsitesViewsHolder extends RecyclerView.ViewHolder {
    TextView gener, description, link;
    ImageView pic;


    public WebsitesViewsHolder(View view) {
        super(view);

    }

    public void bind(DataModel dataModel) {
        gener = (TextView) itemView.findViewById(R.id.genre);
        description = (TextView) itemView.findViewById(R.id.description);
        link = (TextView) itemView.findViewById(R.id.link);
        pic = (ImageView) itemView.findViewById(R.id.pic);


        gener.setText(dataModel.getGener());
        description.setText(dataModel.getDescription());
        link.setText(dataModel.getLink());
        pic.setImageResource(dataModel.getPic());

        //description.setText(dataModel.getDescription());

    }
}
