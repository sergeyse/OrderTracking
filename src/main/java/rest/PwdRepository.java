package rest;

/**
 * Created by Sergiy on 24.6.2018.
 */



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PwdRepository extends CrudRepository<Pwd,String> {
    List<Pwd> findByPwd(@Param("pwd") String pwd);





}
