package com.example.rubrikatorjkm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng Location = new LatLng( 51.806012, 55.105319);
        map = googleMap;
        map.setMinZoomPreference(11.0f);
        Marker marker = map.addMarker(new MarkerOptions().position(Location).title("Null"));
        marker.setVisible(false);
        map.moveCamera(CameraUpdateFactory.newLatLng(Location));
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                map.clear();
                LatLng Location = new LatLng( 51.819973, 55.100698);
                Marker marker = map.addMarker(new MarkerOptions().position(Location).title("Burger King!!"));
                map.moveCamera(CameraUpdateFactory.newLatLng(Location));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                map.clear();
                LatLng Location = new LatLng( 51.843123, 55.327812);
                Marker marker = map.addMarker(new MarkerOptions().position(Location).title("Burger King!!"));
                map.moveCamera(CameraUpdateFactory.newLatLng(Location));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                map.clear();
                LatLng Location = new LatLng( 51.873123, 55.227812);
                Marker marker = map.addMarker(new MarkerOptions().position(Location).title("Burger King!!"));
                map.moveCamera(CameraUpdateFactory.newLatLng(Location));
            }
        });
    }
}