package in.sushmita.__DataJPA_MySQL_App.repos;

import in.sushmita.__DataJPA_MySQL_App.entity.UserMasterEntity;
import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserMasterRepo extends CrudRepository<UserMasterEntity, Id> {

   // Optional<UserMasterEntity> findById(int i);

    //void deleteById(int i);

    Optional<UserMasterEntity> findById(int i);
}
