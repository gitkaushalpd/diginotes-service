package com.diginotes.diginotes.controller;

import com.diginotes.diginotes.entity.Notes;
import com.diginotes.diginotes.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(value = "*")
@RestController
public class NotesController {
    @Autowired
    NotesService notesService;

@PostMapping(value = "/saveNotes")
    Notes saveNotes(@RequestBody Notes notes){

    return  notesService.saveNotes(notes);
}


    @GetMapping(value = "/showNotes")
    List<Notes> showNotes(){
        List<Notes> noteList= new ArrayList<>();
        noteList= notesService.showNotes();
        return noteList;
    }


}
