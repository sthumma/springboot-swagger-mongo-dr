package com.practice.spring.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//collection name and java class name may not be same
@Document(collection = "sample-collection")
public class Sample {

    @JsonProperty("id")
    @Id
    private ObjectId id;

    //field and class attribute may not be same.
    @JsonProperty("firstName")
    @Field("firstname")
    private String firstName;

    @JsonProperty("lastName")
    @Field("lastName")
    private String lastName;
}
