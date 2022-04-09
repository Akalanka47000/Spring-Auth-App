package spring_auth.database.seeders;

import spring_auth.entities.Role;
import spring_auth.http.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class RoleSeeder {

    @Autowired
    private RoleRepository roleRepository;

    public void seed() {
        if(roleRepository.findAll().size()==0){
            List<Role> roles = new ArrayList<>();
            roles.add(new Role("SuperAdmin"));
            roles.add(new Role("User"));
            roles.forEach((role)->{
                roleRepository.save(role);
            });
        }
    }
}
