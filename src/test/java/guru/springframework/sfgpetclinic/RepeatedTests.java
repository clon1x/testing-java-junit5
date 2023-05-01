package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public interface RepeatedTests {
    
    @BeforeEach
    default void setUp(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        StringBuilder msg = new StringBuilder();
        msg.append(testInfo.getDisplayName());
        msg.append(" (");
        msg.append(repetitionInfo.getCurrentRepetition());
        msg.append("/");
        msg.append(repetitionInfo.getTotalRepetitions());
        msg.append(")");
        
        System.out.println(msg.toString());
    }

}
