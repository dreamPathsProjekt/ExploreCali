package com.example.ec.services;

import com.example.ec.domain.Difficulty;
import com.example.ec.domain.Region;
import com.example.ec.domain.Tour;
import com.example.ec.domain.TourPackage;

/**
 *
 * @author i.dritsas
 */
public interface TourService {

    public Tour createTour  (String title, String description, String blurb,
                            Integer price, String duration, String bullets, String keywords,
                            String tourPackageCode, Difficulty difficulty, Region region);
    
    public Iterable<Tour> lookup();
    
    public Long total();
}
