package com.hriday.rao.repository;

import com.hriday.rao.model.Token;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TokenRepository extends MongoRepository<Token, ObjectId> {
    Optional<Token> findByToken(String token);

    void deleteAllByUsername(String username);

    void deleteByToken(String token);
}
