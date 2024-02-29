package test.portal.repository;

import test.portal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jiagoushi on 2023/9/13.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
