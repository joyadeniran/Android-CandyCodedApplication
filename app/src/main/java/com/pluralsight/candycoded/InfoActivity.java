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

<<<<<<< HEAD
        final TextView theAddress = (TextView) findViewById(R.id.text_view_address);
        theAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createMapIntent(theAddress);

            }
        });

        final TextView phoneNumber = (TextView) findViewById(R.id.text_view_phone);
        phoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createPhoneIntent(phoneNumber);
            }
        });
=======
>>>>>>> parent of 326b9d8... All 4 tasks completed.

    }

    // ***
    // TODO - Task 2 - Launch the Google Maps Activity
    // ***

<<<<<<< HEAD

    public void createMapIntent(View view) {
        Uri gMapUri = Uri.parse("geo:0,0?q=618 E South St Orlando, FL 32801");
        Intent gmapIntent = new Intent(Intent.ACTION_VIEW, gMapUri);
        gmapIntent.setPackage("com.google.android.apps.maps");
        if(gmapIntent.resolveActivity(getPackageManager()) != null){
            startActivity(gmapIntent);
        }
    }

    // ***
    // TODO - Task 3 - Launch the Phone Activity
    // ***
    public void createPhoneIntent(View view) {
        Intent telIntent = new Intent(Intent.ACTION_DIAL);
        telIntent.setData(Uri.parse("tel:0123456789"));
        //if (telIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(telIntent);
        //}
    }

=======
    // ***
    // TODO - Task 3 - Launch the Phone Activity
    // ***
>>>>>>> parent of 326b9d8... All 4 tasks completed.
}
