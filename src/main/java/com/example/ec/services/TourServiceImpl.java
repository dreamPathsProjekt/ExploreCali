
package com.example.ec.services;

import com.example.ec.domain.Difficulty;
import com.example.ec.domain.Region;
import com.example.ec.domain.Tour;
import com.example.ec.domain.TourPackage;
import com.example.ec.repository.TourPackageRepository;
import com.example.ec.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author i.dritsas
 */
@Service
public class TourServiceImpl implements TourService{
    
    private final TourRepository tourRepository;
    
    private final TourPackageRepository tourPackageRepository;

    @Autowired
    public TourServiceImpl(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
        this.tourRepository = tourRepository;
        this.tourPackageRepository = tourPackageRepository;
    }

    @Override
    public Tour createTour  (String title, String description, String blurb,
                            Integer price, String duration, String bullets, String keywords,
                            String tourPackageCode, Difficulty difficulty, Region region) {
        //find tourPackage in db
        TourPackage tourPackage = tourPackageRepository.findOne(tourPackageCode);
        if(tourPackage == null) throw new RuntimeException("Tour Package Code does not exist: " + tourPackageCode);
        
        return tourRepository.save(new Tour(title, description, blurb, price, duration, bullets, keywords, tourPackage, difficulty, region));
    }

    @Override
    public Iterable<Tour> lookup() {
        return tourRepository.findAll();
    }

    @Override
    public Long total() {
        return tourRepository.count();
    }
    
    
    
    
}
