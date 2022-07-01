package com.example.akbsensor.Presenter;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import com.example.akbsensor.R;
import com.example.akbsensor.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 Rezha Satria SP
 10119281
 IF7
 **/

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    private boolean maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION
            }, 100);
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        maps = true;
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);


        LatLng Mcdago = new LatLng(-6.884693808236867, 107.61351915471941);
        googleMap.addMarker(new MarkerOptions().position(Mcdago)
                .title("McD Dago"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Mcdago));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mcdago, 15));

        LatLng KFC = new LatLng(-6.909088629300857, 107.61062232957582);
        googleMap.addMarker(new MarkerOptions().position(KFC)
                .title("KFC BEC"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(KFC));

        LatLng Kegeprek = new LatLng(-6.888539970074193, 107.61857489704929);
        googleMap.addMarker(new MarkerOptions().position(Kegeprek)
                .title("Kegeprek Sekeloa"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Kegeprek));

        LatLng roti = new LatLng(-6.912603286241553, 107.6027564573591);
        googleMap.addMarker(new MarkerOptions().position(roti)
                .title("RotiO Stasiun Bandung "));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(roti));

        LatLng naspad = new LatLng(-6.898908227715017, 107.62453654307049);
        googleMap.addMarker(new MarkerOptions().position(naspad)
                .title("Nasi Padang"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(naspad));
    }


}