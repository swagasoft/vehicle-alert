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

public class SpecialActivity extends AppCompatActivity {
    AdView mAdview;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special);
        //placing banner ads
        MobileAds.initialize(this, "ca-app-pub-9044413020226754/8578748314");

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        //placing interstitial ads
        MobileAds.initialize(this,
                "ca-app-pub-9044413020226754~6610651400");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9044413020226754/1047720579");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                super.onAdClosed();
                finish();
            }

        });

    }
    public void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }else{
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        //show ads on app exit
        showInterstitial();

    }

    public void suspensionWarningClick(View view){
        Intent intent = new Intent(this , SuspensionWarningActivity.class);
        startActivity(intent);
    }
    public void alertIndicatorClick(View view){
        Intent intent = new Intent(this , AlertIndicatorActivity.class);
        startActivity(intent);
    }
    public void alertTimeInd(View view){
        Intent intent = new Intent(this , AlertTimeActivity.class);
        startActivity(intent);
    }
    public void autoBrakingInd(View view){
        Intent intent = new Intent(this , AutoBrakingActivity.class);
        startActivity(intent);
    }
    public void awdVindicator(View view){
        Intent intent = new Intent(this , AwdVindicatorActivity.class);
        startActivity(intent);
    }
    public void brakeHoldIndicator(View view){
        Intent intent = new Intent(this , brakeHoldInActivity.class);
        startActivity(intent);
    }
    public void easyAccessClik(View view){
        Intent intent = new Intent(this , EasyAcessActivity.class);
        startActivity(intent);
    }
    public void econIndicator(View view){
        Intent intent = new Intent(this , EconIndicatorActivity.class);
        startActivity(intent);
    }
    public void ectPowerClick(View view){
        Intent intent = new Intent(this , EctPowerActivity.class);
        startActivity(intent);
    }
    public void engineImmobilizer(View view){
        Intent intent = new Intent(this , EngineImmobilizerActivity.class);
        startActivity(intent);
    }
    public void frostWarning(View view){
        Intent intent = new Intent(this , FrostWarnigActivity.class);
        startActivity(intent);
    }

    public void hualIndicatorClick(View view){
        Intent intent = new Intent(this,HualIndicatorActivity.class);
        startActivity(intent);
    }
    public void inteligentStopStart(View view){
        Intent intent = new Intent(this,IntegentStopStartActivity.class);
        startActivity(intent);
    }
    public void keyBatteryClick(View view){
        Intent intent = new Intent(this,KeyBatteryActivity.class);
        startActivity(intent);
    }
    public void keyFoundClick(View view){
        Intent intent = new Intent(this,KeyFoundActivity.class);
        startActivity(intent);
    }
    public void keyQuestionClick(View view){
        Intent intent = new Intent(this,KeyQuestionActivity.class);
        startActivity(intent);
    }
    public void pawsIndicatorClick(View view){
        Intent intent = new Intent(this,PawsActivity.class);
        startActivity(intent);
    }
    public void predictiveClick(View view){
        Intent intent = new Intent(this,PredictiveActivity.class);
        startActivity(intent);
    }
    public void readyTwoClick(View view){
        Intent intent = new Intent(this,ReadyTwoActivity.class);
        startActivity(intent);
    }
    public void sccdWarningClick(View view){
        Intent intent = new Intent(this,SccdActivity.class);
        startActivity(intent);
    }
    public void sportModeInDictor(View view){
        Intent intent = new Intent(this,MaiSportModeActivity.class);
        startActivity(intent);
    }
    public void sstarterClick(View view){
        Intent intent = new Intent(this,SstartActivity.class);
        startActivity(intent);
    }
    public void startStopMalFunc(View view){
        Intent intent = new Intent(this,StartStopMalfuncActivity.class);
        startActivity(intent);
    }
    public void suspensionMalfunction(View view){
        Intent intent = new Intent(this,SuspensionMalfActivity.class);
        startActivity(intent);
    }
    public void topIndicator(View view){
        Intent intent = new Intent(this,TopIndicatorActivity.class);
        startActivity(intent);
    }
    public void towModeIndicator(View view){
        Intent intent = new Intent(this,TowModeIncatorActivity.class);
        startActivity(intent);
    }
    public void trackIndicatorClick(View view){
        Intent intent = new Intent(this,TrackIndicatorActivity.class);
        startActivity(intent);
    }
    public void shiftIndicatorClick(View view){
        Intent intent = new Intent(this,ShiftIndicatorActivity.class);
        startActivity(intent);
    }
    public void upShiftLight(View view){
        Intent intent = new Intent(this,UpshiftActivity.class);
        startActivity(intent);
    }

}
