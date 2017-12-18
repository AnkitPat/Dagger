package com.example.bbim1041.dagger.module;

import com.example.bbim1041.dagger.Motor;
import com.example.bbim1041.dagger.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by BBIM1041 on 18/12/17.
 */

@Module
public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
    
}