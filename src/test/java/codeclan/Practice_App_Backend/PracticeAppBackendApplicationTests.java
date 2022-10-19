package codeclan.Practice_App_Backend;

import codeclan.Practice_App_Backend.models.PracticeItem;
import codeclan.Practice_App_Backend.repositories.PracticeItemRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest
class PracticeAppBackendApplicationTests {

    @Autowired
    PracticeItemRepository practiceItemRepository;

    @Before
    public void createPracticeItemThenSave() {
        PracticeItem practiceItem1 = new PracticeItem(
                "scales",
                1,
                10,
                "technique",
                "a url",
                "10/10/2022",
                5,
                120,
                "all positions",
                3);
        PracticeItem practiceItem2 = new PracticeItem(
                "Wonderwall",
                7,
                10,
                "song",
                "a url",
                "10/10/2022",
                3,
                90,
                "Oasis",
                5);
        practiceItemRepository.save(practiceItem1);
        practiceItemRepository.save(practiceItem2);

    }

    @Test
    public void canFindPracticeItemsByPriority() {
        List<PracticeItem> foundPracticeItems = practiceItemRepository.findByPriority(1);
        assertEquals(1, foundPracticeItems.size());
    }

    @Test
    public void canFindPracticeItemsByCategory() {
        List<PracticeItem> foundPracticeItems = practiceItemRepository.findByCategory("song");
        assertEquals(1, foundPracticeItems.size());
    }
}
