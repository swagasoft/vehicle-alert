package coding.swagasoft.vehiclealert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {
    InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

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



    public void setWarningClick(View view){
        Intent intent = new Intent(this,WarningActivity.class );
        startActivity(intent);
    }
    public void setSaftyClick(View view) {

            Intent intent = new Intent(this, SafetyActivity.class);
            startActivity(intent);

    }
    public void setCommonClick(View view){
        Intent intent = new Intent(this,CommonActivity.class );
        startActivity(intent);
    }
    public void setLightingClick(View view){
        Intent intent = new Intent(this,LightingActivity.class );
        startActivity(intent);
    }
    public void setAdvanceClick(View view){

            Intent intent = new Intent(this,AdvanceActivity.class );
            startActivity(intent);
        }


    public void setSpecialFeatures(View view){
            Intent intent = new Intent(this,SpecialActivity.class );
            startActivity(intent);


    }
    public void setDieselClick(View view){
        Intent intent = new Intent(this,DieselActivity.class );
        startActivity(intent);
    }
    public void setHelpClick(View view){
        Intent intent = new Intent(this,HelpActivity.class );
        startActivity(intent);
    }

}
