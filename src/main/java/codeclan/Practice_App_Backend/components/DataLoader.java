package codeclan.Practice_App_Backend.components;

import codeclan.Practice_App_Backend.models.PracticeItem;
import codeclan.Practice_App_Backend.repositories.PracticeItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!test")
public class DataLoader implements ApplicationRunner {

    @Autowired
    PracticeItemRepository practiceItemRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        PracticeItem templateItem1 = new PracticeItem(
                "alternate picking exercise",
                1,
                10,
                "alternate picking",
                "insert URL here",
                "10/10/2022",
                0,
                120,
                "1st and 2nd strings",
                1
        );
        PracticeItem templateItem2 = new PracticeItem(
                "scales",
                1,
                10,
                "alternate picking",
                "insert URL here",
                "10/10/2022",
                0,
                120,
                "all positions",
                1
        );
        PracticeItem templateItem3 = new PracticeItem(
                "finger picking",
                1,
                10,
                "fingerpicking",
                "insert URL here",
                "10/10/2022",
                0,
                120,
                "G major and c seventh",
                1
        );
        PracticeItem templateItem4 = new PracticeItem(
                "Funk guitar",
                1,
                10,
                "rhythm guitar",
                "https://www.youtube.com/watch?v=aXgSHL7efKg",
                "10/10/2022",
                0,
                120,
                "Chic Le Freak riff",
                1
        );
        PracticeItem templateItem5 = new PracticeItem(
                "Blues rhythm guitar",
                1,
                10,
                "rhythm guitar",
                "insert URL here",
                "10/10/2022",
                0,
                120,
                "Key of A",
                1
        );
        PracticeItem templateItem6 = new PracticeItem(
                "Daytripper",
                2,
                15,
                "song",
                "https://www.youtube.com/watch?v=AYZlME0mQB8",
                "10/10/2022",
                0,
                120,
                "",
                1
        );
        PracticeItem templateItem7 = new PracticeItem(
                "You Really Got Me",
                3,
                15,
                "song",
                "https://www.youtube.com/watch?v=fTTsY-oz6Go",
                "10/10/2022",
                0,
                120,
                "full song",
                1
        );
        PracticeItem templateItem8 = new PracticeItem(
                "Back In Black riff",
                4,
                5,
                "riff",
                "insert URL here",
                "10/10/2022",
                0,
                120,
                "main riff",
                1
        );
        PracticeItem templateItem9 = new PracticeItem(
                "Johnny Be Goode riff",
                5,
                5,
                "riff",
                "insert URL here",
                "10/10/2022",
                0,
                120,
                "intro riff",
                1
        );        PracticeItem templateItem10 = new PracticeItem(
                "Blur Song2",
                6,
                15,
                "song",
                "insert URL here",
                "10/10/2022",
                0,
                120,
                "full song",
                1
        );
        PracticeItem templateItem11 = new PracticeItem(
                "Wonderwall",
                7,
                15,
                "song",
                "https://www.youtube.com/watch?v=6hzrDeceEKc",
                "10/10/2022",
                0,
                120,
                "",
                1
        );

        practiceItemRepository.save(templateItem1);
        practiceItemRepository.save(templateItem2);
        practiceItemRepository.save(templateItem3);
        practiceItemRepository.save(templateItem4);
        practiceItemRepository.save(templateItem5);
        practiceItemRepository.save(templateItem6);
        practiceItemRepository.save(templateItem7);
        practiceItemRepository.save(templateItem8);
        practiceItemRepository.save(templateItem9);
        practiceItemRepository.save(templateItem10);
        practiceItemRepository.save(templateItem11);
    }
}
