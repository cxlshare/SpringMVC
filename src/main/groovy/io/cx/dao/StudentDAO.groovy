package io.cx.dao

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import io.cx.model.baseStudent

public interface StudentRepo extends MongoRepository<baseStudent, ObjectId> {

}
