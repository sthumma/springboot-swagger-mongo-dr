package com.practice.spring.repository;

import com.practice.spring.domain.Sample;
import io.swagger.annotations.Api;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@Api(tags = "Sample entity")
@RepositoryRestResource(path = "samples")
public interface SampleRepository extends MongoRepository<Sample, String> {

    @RestResource(path = "/")
    List<Sample> findAll();

    @RestResource(path = "/:id")
    Sample findById(@Param("id") ObjectId id);
}
