
package com.example.ec.repository;

import com.example.ec.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 *
 * @author i.dritsas
 */
@RepositoryRestResource(collectionResourceRel = "packages", path = "packages") //The Resource is now renamed as /packages.
public interface TourPackageRepository extends CrudRepository<TourPackage, String>{
    public TourPackage findByName(@Param("name") String name);

    @Override
    @RestResource(exported = false)
    public void deleteAll();

    @Override
    @RestResource(exported = false)
    public void delete(Iterable<? extends TourPackage> itrbl);

    @Override
    @RestResource(exported = false)
    public void delete(TourPackage t);

    @Override
    @RestResource(exported = false)
    public void delete(String id);

    @Override
    @RestResource(exported = false)
    public <S extends TourPackage> Iterable<S> save(Iterable<S> itrbl);

    @Override
    @RestResource(exported = false)
    public <S extends TourPackage> S save(S s);
    
    
}
