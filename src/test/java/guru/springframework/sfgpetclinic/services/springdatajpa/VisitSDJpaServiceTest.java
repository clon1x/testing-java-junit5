package guru.springframework.sfgpetclinic.services.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.repositories.VisitRepository;

@ExtendWith(MockitoExtension.class)
@Tag("service")
class VisitSDJpaServiceTest {
    
    @Mock
    VisitRepository visitRepository;
    
    @InjectMocks
    VisitSDJpaService service;
    
    @Test
    void testFindAll() {
        
        // when 
        Set<Visit> actual = service.findAll();
        
        // then
        assertNotNull(actual);
        verify(visitRepository).findAll();
    }

    @Test
    void testFindById() {
        
        // given
        Visit visit = new Visit();
        when(visitRepository.findById(1L))
            .thenReturn(Optional.of(visit));
        
        // when
        Visit actual = service.findById(1L);
        
        // then
        assertNotNull(actual);
        verify(visitRepository).findById(1L);
    }

    @Test
    void testSave() {
        
        // given
        Visit visit = new Visit();
        when(visitRepository.save(visit))
            .thenReturn(visit);
        
        // when
        Visit actual = service.save(visit);
        
        // then
        assertNotNull(actual);
        verify(visitRepository).save(visit);
    }

    @Test
    void testDelete() {
        
        // given
        Visit visit = new Visit();
        
        // when
        service.delete(visit);
        
        // then
        verify(visitRepository).delete(visit);
    }

    @Test
    void testDeleteById() {
        
        // given
        long id = 1L;
        
        // when
        service.deleteById(id);
        
        // then
        verify(visitRepository).deleteById(id);
    }

}
