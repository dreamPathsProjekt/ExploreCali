
package com.example.ec.repository;

import com.example.ec.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author i.dritsas
 */
public interface TourPackageRepository extends CrudRepository<TourPackage, String>{
    public TourPackage findByName(String name);
}
