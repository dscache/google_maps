package com.dwisatria.googlemaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun onMapReady(googleMap: GoogleMap){

            val uty = LatLng(-7.747033,110.355398)
            googleMap.addMarker(
                MarkerOptions().position(uty)
                    .title("Universitas Teknologi Yogyakarta")
            )
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(uty,17.0f))
        }

    }


}
