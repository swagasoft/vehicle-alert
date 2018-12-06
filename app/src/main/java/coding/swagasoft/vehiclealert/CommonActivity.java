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

public class CommonActivity extends AppCompatActivity {
    AdView mAdview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        //placing banner ads
        MobileAds.initialize(this, "ca-app-pub-9044413020226754/8578748314");

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
    }


    public void  allWheelLock(View view){
        Intent intent = new Intent(this ,AllWheelActivity.class );
        startActivity(intent);
    }
    public void  setBlissClick(View view){
   Intent intent = new Intent(this ,BlissActivity.class );
       startActivity(intent);
   }
    public void  chargingClick(View view){
        Intent intent = new Intent(this ,ChargingActivity.class );
        startActivity(intent);
    }
    public void  engineOperatorClick(View view){
        Intent intent = new Intent(this ,EngineOperatorClickActivity.class );
        startActivity(intent);
    }

    public void  electronicDiff(View view){
        Intent intent = new Intent(this ,ElectronicDiffActivity.class );
        startActivity(intent);
    }
    public void  emlIndicateClick(View view){
        Intent intent = new Intent(this ,EmlIndicatorActivity.class );
        startActivity(intent);
    }
    public void  engineStartOne(View view){
        Intent intent = new Intent(this ,EngineActivity.class );
        startActivity(intent);
    }
    public void  engineStartTwo(View view){
        Intent intent = new Intent(this ,EngineStartTwoActivity.class );
        startActivity(intent);
    }
    public void  etcsClick(View view){
        Intent intent = new Intent(this ,EtcsActivity.class );
        startActivity(intent);
    }
    public void  euroAbsClick(View view){
        Intent intent = new Intent(this ,EuroAbsActivity.class );
        startActivity(intent);
    }
    public void  fourLowClick(View view){
        Intent intent = new Intent(this ,FourLowActivity.class );
        startActivity(intent);
    }

    public void  fourTimesFour(View view){
        Intent intent = new Intent(this ,FourTimesFourActivity.class );
        startActivity(intent);
    }
    public void  fourWdlock(View view){
        Intent intent = new Intent(this ,FourWDlockActivity.class );
        startActivity(intent);
    }

    public void  lowFuelClick(View view){
        Intent intent = new Intent(this ,LowFuelClickActivity.class );
        startActivity(intent);
    }
    public void  lowPowerClick(View view){
        Intent intent = new Intent(this ,LowPowerActivity.class );
        startActivity(intent);
    }
    public void  lowWasherFluid(View view){
        Intent intent = new Intent(this ,LowWasherFluidActivity.class );
        startActivity(intent);
    }
    public void  slipIndicator(View view){
        Intent intent = new Intent(this ,SlipIndictorActivity.class );
        startActivity(intent);
    }
    public void  powerLimitation(View view){
        Intent intent = new Intent(this ,PowerLimitationActivity.class );
        startActivity(intent);
    }

    public void  rearLockClick(View view){
        Intent intent = new Intent(this ,RearLock2Activity.class );
        startActivity(intent);
    }
    public void  serviceReminder(View view){
        Intent intent = new Intent(this ,ServiceRemindActivity.class );
        startActivity(intent);
    }
    public void  manualClick(View view){
        Intent intent = new Intent(this ,ManualActivity.class );
        startActivity(intent);
    }
    public void  tractionControlSys(View view){
        Intent intent = new Intent(this ,TractionContrlActivity.class );
        startActivity(intent);
    }
    public void  vdcClick(View view){
        Intent intent = new Intent(this ,VdcActivity.class );
        startActivity(intent);
    }
    public void  slipOffIndicator(View view){
        Intent intent = new Intent(this ,SlipOffIndicatorActivity.class );
        startActivity(intent);
    }
    public void  overDrive(View view){
        Intent intent = new Intent(this ,OverDriveActivity.class );
        startActivity(intent);
    }
}
