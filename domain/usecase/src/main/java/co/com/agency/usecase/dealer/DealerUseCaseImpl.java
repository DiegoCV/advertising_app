package co.com.agency.usecase.dealer;

import co.com.agency.model.dealer.Dealer;
import co.com.agency.model.dealer.gateways.DealerRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class DealerUseCaseImpl implements DealerUseCase {

    private final DealerRepository dealerRepository;

    @Override
    public Dealer save(Dealer dealer) {
        return dealerRepository.save(dealer);
    }
}
