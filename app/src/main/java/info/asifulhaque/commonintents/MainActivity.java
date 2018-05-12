package info.asifulhaque.commonintents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /**
     * @param openWebsite to open Specific website.
     * @param openLocation to locate particular location using google map
     * @param shareTextContent to share some Text.
     * @param openDialer to call specific no
     */

    Button openWebsite, openLocation, shareTextContent, openDialer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * Button Group Initiate with onClickListener
         */
        openWebsite = findViewById(R.id.open_web);
        openWebsite.setOnClickListener(this);
        openLocation = findViewById(R.id.open_location);
        openLocation.setOnClickListener(this);
        shareTextContent = findViewById(R.id.share_text_content);
        shareTextContent.setOnClickListener(this);
        openDialer = findViewById(R.id.phone_dialer);
        openDialer.setOnClickListener(this);

    }

    /**
     * @param url pass url with Button
     */

    public void openWebPage(String url) {
        Intent urlIntent = new Intent(Intent.ACTION_VIEW);
        urlIntent.setData(Uri.parse(url));
        startActivity(urlIntent);

    }

    /**
     * @param phoneNo pass to call.
     * @method cellPhone created to reduce code in onCLick method
     */

    public void callPhone(String phoneNo) {
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
        phoneIntent.setData(Uri.parse(phoneNo));
        startActivity(phoneIntent);
    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.open_web:
                openWebPage("https://asifulhaque.info");
                break;
            case R.id.phone_dialer:
                callPhone("tel:01717887196");


                break;
            case R.id.share_text_content:
                break;
            case R.id.open_location:
                break;

            default:
                break;

        }

    }
}
