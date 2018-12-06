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

public class DieselActivity extends AppCompatActivity {
    AdView mAdview;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diesel);


    }
    public void adblueClick(View view){
        Intent intent = new Intent(this ,adblueFillActivity.class );
        startActivity(intent);
    }
    public void adblueMaintenace(View view){
        Intent intent = new Intent(this ,AdblueMaintenaceActivity.class );
        startActivity(intent);
    }
    public void dieselExhaurst(View view){
        Intent intent = new Intent(this ,DieselExhaurstActivity.class );
        startActivity(intent);
    }
    public void exhurstFilterTwo(View view){
        Intent intent = new Intent(this ,ExhuarstFilterTwoActivity.class );
        startActivity(intent);
    }
    public void perticulateClickFilter(View view){
        Intent intent = new Intent(this ,PerticulateFilterActivity.class );
        startActivity(intent);
    }
    public void paticluteTwoClick(View view){
        Intent intent = new Intent(this ,PerticulateTwoActivity.class );
        startActivity(intent);
    }
    public void glowPlugClick(View view){
        Intent intent = new Intent(this ,glowPlugActivity.class );
        startActivity(intent);
    }
    public void waterInFuelClick(View view){
        Intent intent = new Intent(this ,WaterInFuelActivity.class );
        startActivity(intent);
    }
    public void waterinfuelTwo(View view){
        Intent intent = new Intent(this ,WaterInfuelTwoActivity.class );
        startActivity(intent);
    }
    public void waterTrapClick(View view){
        Intent intent = new Intent(this ,WatertrapActivity.class );
        startActivity(intent);
    }
}
