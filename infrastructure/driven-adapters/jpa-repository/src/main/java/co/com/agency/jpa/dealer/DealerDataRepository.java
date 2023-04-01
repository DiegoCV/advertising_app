package co.com.agency.jpa.dealer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface DealerDataRepository extends CrudRepository<DealerData, String>, QueryByExampleExecutor<DealerData> {
}
