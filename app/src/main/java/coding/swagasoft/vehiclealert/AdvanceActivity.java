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

public class AdvanceActivity extends AppCompatActivity {
    AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);

        //placing banner ads
        MobileAds.initialize(this, "ca-app-pub-9044413020226754/8578748314");

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

    }
    public void adaptiveClick(View view){
        Intent intent  = new Intent(this, AdaptiveActivity.class);
        startActivity(intent);
    }
    public void adapiveCruiseClick(View view){
        Intent intent  = new Intent(this, AdaptiveCruiseActivity.class);
        startActivity(intent);
    }
    public void systemServiceIndicator(View view){
        Intent intent  = new Intent(this,SysetemServiceindActivity .class);
        startActivity(intent);
    }
    public void aslOnClick(View view){
        Intent intent  = new Intent(this,AslActivity .class);
        startActivity(intent);
    }
    public void blindSportClick(View view){
        Intent intent  = new Intent(this,BlindSpotActivity .class);
        startActivity(intent);
    }
    public void congClick(View view){
        Intent intent  = new Intent(this,CongActivity .class);
        startActivity(intent);
    }
    public void collissionWarningClick(View view){
        Intent intent  = new Intent(this,ColissionActivity .class);
        startActivity(intent);
    }
    public void crawlControlIndicator(View view){
        Intent intent  = new Intent(this,CrawlControlActivity .class);
        startActivity(intent);
    }
    public void distanceWarningClick(View view){
        Intent intent  = new Intent(this,DistanceWarningActivity .class);
        startActivity(intent);
    }
    public void eveModeClick(View view){
        Intent intent  = new Intent(this,EVmodeActivity .class);
        startActivity(intent);
    }
    public void eveModeClickTwo(View view){
        Intent intent  = new Intent(this,EveModeTwoActivity .class);
        startActivity(intent);
    }
    public void followModeClick(View view){
        Intent intent  = new Intent(this,FollowModeClickActivity .class);
        startActivity(intent);
    }
    public void forwardAlertClick(View view){
        Intent intent  = new Intent(this,ForwardAlertModeActivity .class);
        startActivity(intent);
    }
    public void forWardCollisionFault(View view){
        Intent intent  = new Intent(this,ForwardColssionFaultActivity .class);
        startActivity(intent);
    }
    public void frontEndClick(View view){
        Intent intent  = new Intent(this,FrontEndCollisionActivity .class);
        startActivity(intent);
    }
    public void gradeAssistClick(View view){
        Intent intent  = new Intent(this,GradeAssistActivity .class);
        startActivity(intent);
    }
    public void hillStartClick(View view){
        Intent intent  = new Intent(this,HillStartActivity .class);
        startActivity(intent);
    }
    public void laneDepatureClick(View view){
        Intent intent  = new Intent(this,LaneDepatureActivity .class);
        startActivity(intent);
    }
    public void laneDetatureWarn(View view){
            Intent intent  = new Intent(this,LaneDepaWarnActivity .class);
            startActivity(intent);
        }

    public void laneDepatureTwo(View view){
        Intent intent  = new Intent(this,LaneDapatureTwoActivity .class);
        startActivity(intent);
    }
    public void nightvisionClick(View view){
        Intent intent  = new Intent(this, NightVionActivity.class);
        startActivity(intent);
    }
    public void nightVisionTwo(View view){
        Intent intent  = new Intent(this, NightVionTwoActivity.class);
        startActivity(intent);
    }
    public void parkingAssistance(View view){
        Intent intent  = new Intent(this, ParkingAsistanceActivity.class);
        startActivity(intent);
    }
    public void parkingAssistTwo(View view){
        Intent intent  = new Intent(this, ParkingAssistTwoActivity.class);
        startActivity(intent);
    }
    public void pesdestrainSound(View view){
        Intent intent  = new Intent(this, PedestrainSoundActivity.class);
        startActivity(intent);
    }
    public void pedestrainWarning(View view){
        Intent intent  = new Intent(this, PedestrianWarningActivity.class);
        startActivity(intent);
    }
    public void pedestrainWarnTwo(View view){
        Intent intent  = new Intent(this, PedestrainWarn2Activity.class);
        startActivity(intent);
    }
    public void plugIndicatorClick(View view){
        Intent intent  = new Intent(this, PlugIndicatorActivity.class);
        startActivity(intent);
    }
    public void raderBlocked(View view){
        Intent intent  = new Intent(this, RaderBlockedActivity.class);
        startActivity(intent);
    }
    public void readyIndicator(View view){
        Intent intent  = new Intent(this, RadarIndicatorActivity.class);
        startActivity(intent);
    }
    public void sensorBlockClick(View view){
        Intent intent  = new Intent(this, SensorBlockedActivity.class);
        startActivity(intent);
    }
    public void streeringAssist(View view){
        Intent intent  = new Intent(this, SteeringAssistActivity.class);
        startActivity(intent);
    }
    }