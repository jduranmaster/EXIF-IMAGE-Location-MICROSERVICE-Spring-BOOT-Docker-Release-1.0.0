package com.epsilon.metadata.image.location.rest.service;

import com.epsilon.metadata.image.location.entity.City;

public interface CityService {

  public City findByLatLong(Double latitude, Double longitude);

}