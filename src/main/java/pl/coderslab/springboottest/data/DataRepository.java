package pl.coderslab.springboottest.data;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DataRepository extends CrudRepository <Data, Long> {

    List<Data> findByDataName(String dataName);

    Data findById(long id);
}
