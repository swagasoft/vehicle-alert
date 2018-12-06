package coding.swagasoft.vehiclealert;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class HelpActivity extends AppCompatActivity {
      Button button_mail;
     Button facebookLink;
    private Intent chooser;
    AdView mAdview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        MobileAds.initialize(this, "ca-app-pub-9044413020226754~6610651400");
        mAdview = (AdView)findViewById(R.id.adView);
        AdRequest adRequest;
        adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);


        facebookLink = (Button)findViewById(R.id.facbook_btn);
        facebookLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent facebookIntent = openFaceBookSwagaSoft(HelpActivity.this);
                startActivity(facebookIntent);


                //setting the mail.
                button_mail= (Button)findViewById(R.id.email_btn);
                button_mail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });

            }
        });






    }
    public static Intent openFaceBookSwagaSoft(Context context){


        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana",0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/871553076380915"));
        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,Uri.parse("https://mobile.facebook.com/Swagasoft-Engineer"));

        }
    }
    public void maintenaceClick(View view){
        Intent intent = new Intent(this ,MaintenaceTipsActivity.class);
        startActivity(intent);
    }

    public  void sendMail(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailTo:"));
        String[] to ={"swagasoft@gmail.com",""};
        intent.putExtra(Intent.EXTRA_EMAIL , to);
        intent.setType("message/rfc822");
        chooser =Intent.createChooser(intent,"Send Email");
        startActivity(chooser );
    }


}
