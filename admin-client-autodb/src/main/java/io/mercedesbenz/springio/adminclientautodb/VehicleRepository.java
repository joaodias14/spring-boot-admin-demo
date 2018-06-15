package io.mercedesbenz.springio.adminclientautodb;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "vehicle", path = "vehicles")
public interface VehicleRepository extends PagingAndSortingRepository<Vehicle, Long> {

}
