
package com.example.ec.repository;

import com.example.ec.domain.Tour;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author i.dritsas
 */
public interface TourRepository extends PagingAndSortingRepository<Tour, Integer>{
    public Page<Tour> findByTourPackageCode(@Param("code") String code, Pageable pageable);  //changes to enable paging and sorting |from Crud->PagingAndSorting.
}
