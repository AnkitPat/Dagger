package com.example.bbim1041.dagger;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.bbim1041.dagger.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by BBIM1041 on 18/12/17.
 */
@Singleton
@Component(modules = {VehicleModule.class})
interface VehicleComponent {

    Vehicle provideVehicle();

}

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        

        VehicleComponent component =  DaggerVehicleComponent.create();

        Vehicle vehicle = component.provideVehicle();
        
        vehicle.increaseSpeed(10);

        Toast.makeText(this, String.valueOf(vehicle.getSpeed())+vehicle.motor.getRpm(), Toast.LENGTH_SHORT).show();

    }
}
