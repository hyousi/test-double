package stub;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    @Mock
    GradeSystem mockGradeSystem;
    @InjectMocks
    GradeService gs;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        //Assertions.assertEquals(90.0, result);
        when(mockGradeSystem.gradesFor(123)).thenReturn(Arrays.asList(1.0, 2.0, 3.0));

        double actual = gs.calculateAverageGrades(123);
        verify(mockGradeSystem).gradesFor(123);

        Assertions.assertEquals(2.0, actual);
    }
}
