package coding.swagasoft.vehiclealert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class BrakeTextActivity extends AppCompatActivity {
    AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brake_text);
        mAdview = (AdView)findViewById(R.id.adView);
        AdRequest adRequest;
        adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
    }
}
