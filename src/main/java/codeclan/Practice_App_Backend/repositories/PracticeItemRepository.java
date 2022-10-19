package codeclan.Practice_App_Backend.repositories;

import codeclan.Practice_App_Backend.models.PracticeItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PracticeItemRepository extends JpaRepository<PracticeItem, Long> {
    List<PracticeItem> findByPriority(int priority);
    List<PracticeItem> findByCategory(String category);
    List<PracticeItem> findTop10ByPriorityGreaterThanOrderByCounterAscPriorityAsc(int min);

    @Transactional
    @Modifying
    @Query("update PracticeItem p set p.counter = p.counter - 1 where p.counter > 1")
    void updateCounter();
}
