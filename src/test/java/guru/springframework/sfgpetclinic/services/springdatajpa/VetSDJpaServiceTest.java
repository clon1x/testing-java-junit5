package guru.springframework.sfgpetclinic.services.springdatajpa;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import guru.springframework.sfgpetclinic.repositories.VetRepository;

@ExtendWith(MockitoExtension.class)
@Tag("service")
class VetSDJpaServiceTest {

    @Mock
    VetRepository vetRepository;
    
    @InjectMocks
    VetSDJpaService service;
    
    @Test
    void testDeleteById() {
        vetRepository.deleteById(1L);
        Mockito.verify(vetRepository).deleteById(1L);;
    }

}
