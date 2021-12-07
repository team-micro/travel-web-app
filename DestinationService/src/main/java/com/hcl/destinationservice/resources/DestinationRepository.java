package com.hcl.destinationservice.resources;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.destinationservice.models.Destination;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<Destination,Integer>{

}
