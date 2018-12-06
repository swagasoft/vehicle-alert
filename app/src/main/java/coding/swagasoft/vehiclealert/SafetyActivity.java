package coding.swagasoft.vehiclealert;

import android.animation.AnimatorSet;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SafetyActivity extends AppCompatActivity {
    AdView mAdview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety);

        //placing banner ads
        MobileAds.initialize(this, "ca-app-pub-9044413020226754/8578748314");

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
    }

    public void setAsarBar (View view){
        Intent intent = new Intent(this, AsarActivity.class);
        startActivity(intent);
    }
    public void awdMalfunction (View view){
        Intent intent = new Intent(this, AwdMalfuncActivity.class);
        startActivity(intent);
    }
    public void absCanada (View view){
        Intent intent = new Intent(this, AbsCanadaActivity.class);
        startActivity(intent);
    }
    public void absUsClick (View view){
        Intent intent = new Intent(this, AbsUsActivity.class);
        startActivity(intent);
    }
    public void filterClong (View view){
        Intent intent = new Intent(this, FilterClongActivity.class);
        startActivity(intent);
    }
    public void allWhellDisable (View view){
        Intent intent = new Intent(this, AllWheelDisableActivity.class);
        startActivity(intent);
    }
    public void setBrake (View view){
        Intent intent = new Intent(this, BrakeActivity.class);
        startActivity(intent);
    }
    public void setBreakWear (View view){
        Intent intent = new Intent(this, SetBrakeWearActivity.class);
        startActivity(intent);
    }
    public void catalystClick (View view){
        Intent intent = new Intent(this, CatalystActivity.class);
        startActivity(intent);
    }
    public void checkEngineLight (View view){
        Intent intent = new Intent(this, ChechEngineActivity.class);
        startActivity(intent);
    }
    public void checkLightTwo (View view){
        Intent intent = new Intent(this, CheckLighttwoActivity.class);
        startActivity(intent);
    }
    public void checkLightThree (View view){
        Intent intent = new Intent(this, CheckLIght3Activity.class);
        startActivity(intent);
    }
    public void chechGasCap (View view){
        Intent intent = new Intent(this, GasCapActivity.class);
        startActivity(intent);
    }
    public void electricParkbreak (View view){
        Intent intent = new Intent(this, electricParkBrakeActivity.class);
        startActivity(intent);
    }
    public void electricParkbreakshiftMal (View view){
        Intent intent = new Intent(this, ElectShiftMalActivity.class);
        startActivity(intent);
    }
    public void electThrottle (View view){
        Intent intent = new Intent(this, ElectThrotleActivity.class);
        startActivity(intent);
    }
    public void ellectBrakeControl (View view){
        Intent intent = new Intent(this, ElectBrakeConttro2Activity.class);
        startActivity(intent);
    }
    public void keyFobClick (View view){
        Intent intent = new Intent(this, KeyFobActivity.class);
        startActivity(intent);
    }
    public void lambaIndicator (View view){
        Intent intent = new Intent(this, LambaIndicatorActivity.class);
        startActivity(intent);
    }
    public void liftServiceClick (View view){
        Intent intent = new Intent(this, LiftServiceIndActivity.class);
        startActivity(intent);
    }
    public void lowColant (View view){
        Intent intent = new Intent(this, LowColantActivity.class);
        startActivity(intent);
    }
    public void lowColantTwo (View view){
        Intent intent = new Intent(this, LowColantTwoActivity.class);
        startActivity(intent);
    }
    public void colantfour (View view){
        Intent intent = new Intent(this, LowColontFourActivity.class);
        startActivity(intent);
    }
    public void messageIndicator (View view){
        Intent intent = new Intent(this, MessageIndicatorActivity.class);
        startActivity(intent);
    }
    public void oilMinimumClick (View view){
        Intent intent = new Intent(this, OilMinimumActivity.class);
        startActivity(intent);
    }
    public void oilLevelSensorClick (View view){
        Intent intent = new Intent(this, OilLevelensorActivity.class);
        startActivity(intent);
    }
    public void rearSeatBeltClick (View view){
        Intent intent = new Intent(this, RearBeltSafety2Activity.class);
        startActivity(intent);
    }
    public void reduceEnginepower (View view){
        Intent intent = new Intent(this, ReduceEnginePowActivity.class);
        startActivity(intent);
    }
    public void serviceLightClick (View view){
        Intent intent = new Intent(this, ServiceLightActivity.class);
        startActivity(intent);
    }
    public void lowcolantThree (View view){
        Intent intent = new Intent(this, LowColantthreeActivity.class);
        startActivity(intent);
    }
    public void shiftLockInd (View view){
        Intent intent = new Intent(this, ShiftlocIndActivity.class);
        startActivity(intent);
    }
    public void sideAirBagOff (View view){
        Intent intent = new Intent(this, SideAirBagOffActivity.class);
        startActivity(intent);
    }
    public void spannerServiceClick (View view){
        Intent intent = new Intent(this, SpannerServiceActivity.class);
        startActivity(intent);
    }
    public void stabilityControlFault (View view){
        Intent intent = new Intent(this, StabilityFaultOneActivity.class);
        startActivity(intent);
    }
    public void stabilityFaultTwo (View view){
        Intent intent = new Intent(this, StabilityFaultTwoActivity.class);
        startActivity(intent);
    }
    public void TireArrowClick (View view){
        Intent intent = new Intent(this, tireArrowActivity.class);
        startActivity(intent);
    }
    public void tirePressureTwo (View view){
        Intent intent = new Intent(this, TirePressureTwoActivity.class);
        startActivity(intent);
    }
    public void transmissionClick (View view){
        Intent intent = new Intent(this, TransmissionActivity.class);
        startActivity(intent);
    }
    public void slipRealClick (View view){
        Intent intent = new Intent(this, SlipRealActivity.class);
        startActivity(intent);
    }


}

