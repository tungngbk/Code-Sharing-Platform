package platform.repository;


import org.springframework.data.repository.CrudRepository;
import platform.entities.Code;

import java.util.List;
import java.util.UUID;

public interface CodeRepository extends CrudRepository<Code, UUID> {
    List<Code> findTop10ByOrderByDateDesc();
    List<Code> findAllByOrderByDateAsc();
}
