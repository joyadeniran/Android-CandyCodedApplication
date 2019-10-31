package com.pluralsight.candycoded;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Uri uri = Uri.parse("android.resource://com.codeschool.candycoded/" + R.drawable.store_front);
        ImageView candyStoreImageView = (ImageView)findViewById(R.id.image_view_candy_store);
        Picasso.with(this).
                load(uri).
                into(candyStoreImageView);


    }

    // ***
    // TODO - Task 2 - Launch the Google Maps Activity
    // ***

        TextView address = (TextView) view;
        Uri gMapUri = Uri.parse("geo:0,0?q=618 E South St Orlando, FL 32801");
        Intent gmapIntent = new Intent(Intent.ACTION_VIEW, gMapUri);
        gmapIntent.setPackage("com.google.android.apps.maps");
        if(gmapIntent.resolveActivity(getPackageManager()) != null){
          startActivity(mapIntent);
        }

    // ***
    // TODO - Task 3 - Launch the Phone Activity
    // ***

      Intent telIntent = new Intent(Intent.ACTION_DIAL);
      telintent.setData(Uri.parse("tel:0123456789"));
      if(intent.resolveActivity(getPackageManager()) != null){
        startActivity(intent);
      }

}
