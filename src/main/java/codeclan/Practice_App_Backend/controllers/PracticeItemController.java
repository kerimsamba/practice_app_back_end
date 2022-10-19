package codeclan.Practice_App_Backend.controllers;

import codeclan.Practice_App_Backend.models.PracticeItem;
import codeclan.Practice_App_Backend.repositories.PracticeItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PracticeItemController {

    @Autowired
    PracticeItemRepository practiceItemRepository;

    @GetMapping(value = "/practiceitems")
    public ResponseEntity<List<PracticeItem>> getAllPracticeItems(){
        return new ResponseEntity<>(practiceItemRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/practiceitems/daily")
    public ResponseEntity<List<PracticeItem>> getDailyPracticeItems(){
        return new ResponseEntity<>(practiceItemRepository.findByPriority(1), HttpStatus.OK);
    }

    @GetMapping(value = "/lowerpriority")
    public ResponseEntity<List<PracticeItem>> getLowerPracticeItems(){
        practiceItemRepository.updateCounter();
        return new ResponseEntity<>(practiceItemRepository.findTop10ByPriorityGreaterThanOrderByCounterAscPriorityAsc(1), HttpStatus.OK);
    }


    @GetMapping(value = "/practiceitems/{id}")
    public ResponseEntity getPracticeItem(@PathVariable Long id){
        return new ResponseEntity<>(practiceItemRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/practiceitems")
    public ResponseEntity<PracticeItem> postPracticeItem(@RequestBody PracticeItem practiceItem){
        practiceItemRepository.save(practiceItem);
        return new ResponseEntity<>(practiceItem, HttpStatus.CREATED);
    }


    @DeleteMapping(value = "/practiceitems/{id}")
    public ResponseEntity<Void> deletePracticeItem(@PathVariable Long id) {
        practiceItemRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
