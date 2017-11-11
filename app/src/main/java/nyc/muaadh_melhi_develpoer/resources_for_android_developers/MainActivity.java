package nyc.muaadh_melhi_develpoer.resources_for_android_developers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import nyc.muaadh_melhi_develpoer.resources_for_android_developers.controller.WebsitesAdapter;
import nyc.muaadh_melhi_develpoer.resources_for_android_developers.model.DataModel;

public class MainActivity extends AppCompatActivity {
    private List<DataModel> websiteList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_View);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        for (int i = 0; i < WebsiteInfo.descriptionArray.length; i++) {
            websiteList.add(new DataModel(WebsiteInfo.descriptionArray[i], WebsiteInfo.generArray[i], WebsiteInfo.linkArray[i], WebsiteInfo.picArray[i]));
        }


        WebsitesAdapter websitesAdapter = new WebsitesAdapter(websiteList);
        recyclerView.setAdapter(websitesAdapter);


    }
}
