package coding.swagasoft.vehiclealert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class WarningActivity extends AppCompatActivity {
    AdView mAdview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warning);





    }

    public void setBrakelowClick(View view){
        Intent intent = new Intent(this,BrakeLowActivity.class);
        startActivity(intent);
    }
    public void setBrakeTest(View view){
        Intent intent = new Intent(this,BrakeTextActivity.class);
        startActivity(intent);
    }
    public void setBrakeTroublrCanada(View view){
        Intent intent = new Intent(this,BraketrocanadaActivity.class);
        startActivity(intent);
    }
    public void setChargesys(View view){
        Intent intent = new Intent(this,ChargesystroActivity.class);
        startActivity(intent);
    }
    public void setDoorAjar(View view){
        Intent intent = new Intent(this,DoorAjarActivity.class);
        startActivity(intent);
    }
    public void setDrivetrain(View view){
        Intent intent = new Intent(this,DriveTrainActivity.class);
        startActivity(intent);
    }
    public void setExernalClick(View view){
        Intent intent = new Intent(this,ExternalSoundActivity.class);
        startActivity(intent);
    }
    public void setHybridService(View view){
        Intent intent = new Intent(this,HybridServiceActivity.class);
        startActivity(intent);
    }
    public void setHighVoltageFault(View view){
        Intent intent = new Intent(this,HighVoltagefaultActivity.class);
        startActivity(intent);
    }
    public void setHighVolbattery(View view){
        Intent intent = new Intent(this,HighVoltSistemFaultActivity.class);
        startActivity(intent);
    }
    public void setBatteryTroubleMain(View view){
        Intent intent = new Intent(this ,batteryTRoMainActivity.class);
        startActivity(intent);
    }
    public void setHybridWarning(View view){
        Intent intent = new Intent(this ,hybridWarningActivity.class);
        startActivity(intent);
    }
    public void setKeyNotfound(View view){
        Intent intent = new Intent(this ,KynotFoundActivity.class);
        startActivity(intent);
    }
    public void setLockClick(View view){
        Intent intent = new Intent(this ,LockActivity.class);
        startActivity(intent);
    }
    public void setCollantwarn(View view){
        Intent intent = new Intent(this ,CoolantWarnActivity.class);
        startActivity(intent);
    }
    public void setOilLowLevel(View view){
        Intent intent = new Intent(this ,LowOilLevelActivity.class);
        startActivity(intent);
    }
    //ads point
    public void masterWarning(View view){
            Intent intent = new Intent(this,MasterWarningActivity.class );
            startActivity(intent);
        }

    public void oilTroubleIndicator(View view){
        Intent intent = new Intent(this ,OilTroubleActivity.class);
        startActivity(intent);
    }
    public void openHoodClick(View view){
        Intent intent = new Intent(this ,OpenHoodActivity.class);
        startActivity(intent);
    }
    public void parkBrakeClick(View view){
        Intent intent = new Intent(this ,ParkBrakeActivity.class);
        startActivity(intent);
    }
    public void powerTRainTro(View view){
        Intent intent = new Intent(this ,PowerTrainTroActivity.class);
        startActivity(intent);
    }
    public void rearBeltClick(View view){
        Intent intent = new Intent(this ,RearBeltWarnActivity.class);
        startActivity(intent);
    }

    public void securityIndicator(View view){
        Intent intent = new Intent(this ,SecurityIndiActivity.class);
        startActivity(intent);
    }
    public void serviceElectricPark(View view){
        Intent intent = new Intent(this ,ServiceElectBreakActivity.class);
        startActivity(intent);
    }
    public void setSrsClick(View view){
        Intent intent = new Intent(this ,SrsTextActivity.class);
        startActivity(intent);
    }
    public void setAirBagballClick(View view){
        Intent intent = new Intent(this ,AirBagBallActivity.class);
        startActivity(intent);
    }
    public void steeringTrouble(View view){
        Intent intent = new Intent(this ,SteeringTroubleActivity.class);
        startActivity(intent);
    }
    public void temperatureWarn(View view){
        Intent intent = new Intent(this ,TempWarnActivity.class);
        startActivity(intent);
    }
    public void transmissionTemp(View view){
        Intent intent = new Intent(this ,TransmissionTempActivity.class);
        startActivity(intent);
    }
    public void truncAjarClick(View view){
        Intent intent = new Intent(this , TrunckAjarActivity.class);
        startActivity(intent);
    }
}
