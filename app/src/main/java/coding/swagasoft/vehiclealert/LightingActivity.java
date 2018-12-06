package coding.swagasoft.vehiclealert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class LightingActivity extends AppCompatActivity {
    AdView mAdview;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lighting);
        MobileAds.initialize(this, "ca-app-pub-9044413020226754~6610651400");
        //placing banner ads
        MobileAds.initialize(this, "ca-app-pub-9044413020226754/8578748314");

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

    }


    public void autoDimmerClick(View view){
        Intent intent = new Intent(this ,AutoDimmerActivity.class );
        startActivity(intent);
    }
    public void corneringMalfunction(View view){
        Intent intent = new Intent(this ,CorneringMalfuncActivity.class );
        startActivity(intent);
    }
    public void dayTimeRunningClick(View view){
        Intent intent = new Intent(this ,DayTimeRunningActivity.class );
        startActivity(intent);
    }
    public void fogLampIndicator(View view){
        Intent intent = new Intent(this ,FogLampIndicatorActivity.class );
        startActivity(intent);
    }
    public void headLampClick(View view){
        Intent intent = new Intent(this ,HeadLampOutActivity.class );
        startActivity(intent);
    }
    public void headLampSymbolind(View view){
        Intent intent = new Intent(this ,HeadlampSymbolActivity.class );
        startActivity(intent);
    }
    public void headLampLeveling(View view){
        Intent intent = new Intent(this ,HeadLevelingActivity.class );
        startActivity(intent);
    }

    public void headMalfunction(View view){
        Intent intent = new Intent(this ,HeadMalfunctionActivity.class );
        startActivity(intent);
    }
    public void beamIndicatorClick(View view){
        Intent intent = new Intent(this ,BeamIndicatorActivity.class );
        startActivity(intent);
    }
    public void highBeamAssistance(View view){
        Intent intent = new Intent(this ,HighBeamAssistanceActivity.class );
        startActivity(intent);
    }
    public void lampOutSymbol(View view){
        Intent intent = new Intent(this ,LampOutActivity.class );
        startActivity(intent);
    }
    public void rearFogLampIndicator(View view){
        Intent intent = new Intent(this ,RearFogLamoActivity.class );
        startActivity(intent);
    }
    public void stopLightClick(View view){
        Intent intent = new Intent(this ,StopLightClickActivity.class );
        startActivity(intent);
    }
    public void tailLightInd(View view){
        Intent intent = new Intent(this ,TailLightActivity.class );
        startActivity(intent);
    }
    public void tailLightOutClick(View view){
        Intent intent = new Intent(this ,TailLightOutctivity.class );
        startActivity(intent);
    }
    public void turnSignalClick(View view){
        Intent intent = new Intent(this ,TurnSignalActivity.class );
        startActivity(intent);
    }
}
