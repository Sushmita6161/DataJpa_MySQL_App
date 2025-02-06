package in.sushmita.__DataJPA_MySQL_App.service;

import in.sushmita.__DataJPA_MySQL_App.entity.UserMasterEntity;
import in.sushmita.__DataJPA_MySQL_App.repos.UserMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserMasterRepo userMasterRepo;

    public void test() {
        long count = userMasterRepo.count();
        System.out.println("Total Records Count: "+ count);
    }

    //public void deleteUser()
      //  userMasterRepo.deleteById(1020);
        //userMasterRepo.deleteAllById(Arrays.asList(102,103));
    }

    public void saveUser()
    {
        //setting data for entity object
        UserMasterEntity entity = new UserMasterEntity();
        entity.setId(104);
        entity.setName("Ashi");
        entity.setEmail("ashi@gmail.com");
        entity.setGender("Female");
        entity.setCity("India");
        entity.setAge(22);

        //insert record
        userMasterRepo.save(entity);

        System.out.println("Done........");
    }

    public void saveUsers()
    {
        //setting data for entity object
        UserMasterEntity entity1 = new UserMasterEntity();
        entity1.setId(201);
        entity1.setName("Ashutosh");
        entity1.setEmail("ashutosh1910@gmail.com");
        entity1.setGender("Male");
        entity1.setCity("Germany");
        entity1.setAge(24);

        //setting data for entity object
        UserMasterEntity entity2 = new UserMasterEntity();
        entity2.setId(202);
        entity2.setName("Veer");
        entity2.setEmail("veer1312@gmail.com");
        entity2.setGender("Male");
        entity2.setCity("Australia");
        entity2.setAge(20);

        List<UserMasterEntity> entitiesList = Arrays.asList(entity1,entity2);
        //List<UserMasterEntity> entityList = Arrays.asList(entity1,entity2);
        //insert record
        userMasterRepo.saveAll(entitiesList);

        System.out.println("Done........");
    }

    public void getUser()
    {
      Optional<UserMasterEntity> findById = userMasterRepo.findById(205);

      if(findById.isPresent())
      {
          System.out.println(findById.get());
      }

      else
      {
          System.out.println("Record not found...");
      }
    }

    public void getUsers()
    {
        List<Integer> ids = Arrays.asList(101,201,202);
      // Iterable<UserMasterEntity> entities = userMasterRepo.findAllById(ids);

        Iterable<UserMasterEntity> entities = userMasterRepo.findAll();

       entities.forEach(e ->
       {
           System.out.println(e);
       });
    }


}
