package coding.swagasoft.vehiclealert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ParkingAsistanceActivity extends AppCompatActivity {
    AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_asistance);

        MobileAds.initialize(this, "cca-app-pub-9044413020226754~6610651400");
        mAdview = (AdView)findViewById(R.id.adView);
        AdRequest adRequest;
        adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
    }
}
