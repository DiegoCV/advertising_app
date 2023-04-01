package co.com.agency.jpa.tierLimit;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface TierLimitDataRepository extends CrudRepository<TierLimitData, String>,
        QueryByExampleExecutor<TierLimitData> {

    TierLimitData findFirstActiveTrueTopByOrderByCreatedAtDesc();

}
