package co.com.agency.model.dealer.gateways;

import co.com.agency.model.dealer.Dealer;

public interface DealerRepository {
    Dealer save(Dealer dealer);
}
