package com.example.learndagger2.component;

import com.example.learndagger2.model.Vehicle;
import com.example.learndagger2.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();
}
