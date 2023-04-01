package co.com.agency.usecase.dealer;

import co.com.agency.model.dealer.Dealer;
import co.com.agency.model.dealer.gateways.DealerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class DealerUseCaseImplTest {

    @InjectMocks
    @Spy
    DealerUseCaseImpl dealerUseCase;

    @Mock
    protected DealerRepository dealerRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void save() {
        Dealer dealer = Dealer.builder().name("Test Dealer").build();
        Mockito.doReturn(dealer).when(dealerRepository).save(any(Dealer.class));
        assertNotNull(dealerUseCase.save(Dealer.builder().build()));
    }
}