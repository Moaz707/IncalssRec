package nyc.muaadh_melhi_develpoer.resources_for_android_developers.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.muaadh_melhi_develpoer.resources_for_android_developers.R;
import nyc.muaadh_melhi_develpoer.resources_for_android_developers.model.DataModel;
import nyc.muaadh_melhi_develpoer.resources_for_android_developers.views.WebsitesViewsHolder;

/**
 * Created by c4q on 11/11/17.
 */

public class WebsitesAdapter extends RecyclerView.Adapter<WebsitesViewsHolder> {

    List<DataModel> websiteList;

    public WebsitesAdapter(List<DataModel> webisteList) {
        this.websiteList = webisteList;
    }

    @Override
    public WebsitesViewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.website_list, parent, false);
        return new WebsitesViewsHolder(view);
    }

    @Override
    public void onBindViewHolder(WebsitesViewsHolder holder, int position) {
        WebsitesViewsHolder websitesViewsHolder = (WebsitesViewsHolder) holder;
        websitesViewsHolder.bind(websiteList.get(position));

    }

    @Override
    public int getItemCount() {
        return websiteList.size();
    }
}

