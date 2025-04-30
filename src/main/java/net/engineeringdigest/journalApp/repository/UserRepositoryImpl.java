package net.engineeringdigest.journalApp.repository;

import lombok.NonNull;
import net.engineeringdigest.journalApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.schema.JsonSchemaObject;
import org.springframework.stereotype.Component;

import java.util.List;

@Component  // was not added
public class UserRepositoryImpl {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<User> getUserForSA() {
        Query query = new Query();
        query.addCriteria(Criteria.where("email").regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,6}$"));
        query.addCriteria(Criteria.where("sentimentAnalysis").is(true));
        return mongoTemplate.find(query, User.class);
//        query.addCriteria(Criteria.where("userName").is("Ankit"));
//        query.addCriteria(Criteria.where("field").ne("value"));
//        not equal= ne, less than= lt, less than equal to= lte, greater than= gt, greater than equal to= gte, not in= nin
//        query.addCriteria(Criteria.where("email").exists(true));
//        AND
//        query.addCriteria(Criteria.where("email").ne(null).ne(""));
//        query.addCriteria(Criteria.where("userName").nin("Rajat","Shanu"));
//        query.addCriteria(Criteria.where("roles").in("USER","ADMIN"));
//        query.addCriteria(Criteria.where("sentimentAnalysis").type(JsonSchemaObject.Type.BsonType.BOOLEAN));

//        for OR operator
//        Criteria criteria = new Criteria();
//        query.addCriteria(criteria.orOperator(
//                Criteria.where("email").exists(true),
//                Criteria.where("sentimentAnalysis").is(true))
//        );
//        List<User> users = mongoTemplate.find(query, User.class);
    }
}
