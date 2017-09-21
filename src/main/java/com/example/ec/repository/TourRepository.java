
package com.example.ec.repository;

import com.example.ec.domain.Tour;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 *
 * @author i.dritsas
 */
public interface TourRepository extends PagingAndSortingRepository<Tour, Integer>{
    public Page<Tour> findByTourPackageCode(@Param("code") String code, Pageable pageable);  //changes to enable paging and sorting |from Crud->PagingAndSorting.

    @Override
    @RestResource(exported = false) //prevent users of the Api to edit and delete Tours. Method level Annotation.
    public <S extends Tour> S save(S s);

    @Override
    @RestResource(exported = false)
    public void deleteAll();

    @Override
    @RestResource(exported = false)
    public void delete(Iterable<? extends Tour> itrbl);

    @Override
    @RestResource(exported = false)
    public void delete(Tour t);

    @Override
    @RestResource(exported = false)
    public void delete(Integer id);

    @Override
    @RestResource(exported = false)
    public <S extends Tour> Iterable<S> save(Iterable<S> itrbl);
    
    
}
