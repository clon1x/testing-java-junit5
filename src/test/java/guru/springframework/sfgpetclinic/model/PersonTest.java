package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.ModelTest;
import guru.springframework.sfgpetclinic.RepeatedTests;

class PersonTest implements ModelTest {

    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1l, "Joe", "Buck");

        //then
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Joe"),
                () -> assertEquals(person.getLastName(), "Buck"));
    }

    @Test
    void groupedAssertionMsgs() {
        //given
        Person person = new Person(1l, "Joe", "Buck");

        //then
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Joe", "First Name Failed"),
                () -> assertEquals(person.getLastName(), "Buck", "Last Name Failed"));
    }
    
    @Nested
    class Repeated implements RepeatedTests {

        @RepeatedTest(value = 4, name = RepeatedTest.DISPLAY_NAME_PLACEHOLDER)
        @DisplayName("Test Person First and LastName are set")
        void should_ReturnName_When_NameIsSet() {
            
            // given
            String expectedFirstName = "John";
            String expectedLastName = "Williams";
            Person person = new Person(1L, expectedFirstName, expectedLastName);
            
            // when
            String actualFirstName = person.getFirstName();
            String actualLastName = person.getLastName();
            
            // then
            assertAll("Person Properties",
                            () -> assertEquals(expectedFirstName, actualFirstName),
                            () -> assertEquals(expectedLastName, actualLastName));
        }
        
    }
    
}