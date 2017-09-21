
package com.example.ec.repository;

import com.example.ec.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author i.dritsas
 */
public interface TourPackageRepository extends PagingAndSortingRepository<TourPackage, String>{
    public TourPackage findByName(@Param("name") String name);
}
