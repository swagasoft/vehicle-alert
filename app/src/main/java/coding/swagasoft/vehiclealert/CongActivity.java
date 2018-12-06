package coding.swagasoft.vehiclealert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class CongActivity extends AppCompatActivity {

    AdView mAdview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cong);

        MobileAds.initialize(this, "ca-app-pub-3940256099942544-3347511713");

        mAdview = (AdView)findViewById(R.id.adView);
        AdRequest adRequest;
        adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
    }
}
