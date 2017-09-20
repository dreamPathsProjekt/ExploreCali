
package com.example.ec.services;

import com.example.ec.domain.TourPackage;

/**
 *
 * @author i.dritsas
 */
public interface TourPackageService {
    
    public TourPackage createTourPackage(String code, String name); 
    
    public Iterable<TourPackage> lookup();
    
    public Long total();
}
