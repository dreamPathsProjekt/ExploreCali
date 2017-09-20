
package com.example.ec.services;

import com.example.ec.domain.TourPackage;
import com.example.ec.repository.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author i.dritsas
 */
@Service
public class TourPackageServiceImpl implements TourPackageService{

    private final TourPackageRepository tourPackageRepository;

    @Autowired //Autowire at the constructor level
    public TourPackageServiceImpl(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    @Override 
    public TourPackage createTourPackage(String code, String name) {
        if(!tourPackageRepository.exists(code)) {
            tourPackageRepository.save(new TourPackage(code, name));
        }
        return null;
    }

    @Override
    public Iterable<TourPackage> lookup() {
        return tourPackageRepository.findAll();
    }

    @Override
    public Long total() {
        return tourPackageRepository.count();
    }
    
       
}
