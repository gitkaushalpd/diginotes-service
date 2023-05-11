package com.diginotes.diginotes.service;

import com.diginotes.diginotes.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotesService  {
    List<Notes> showNotes();

    Notes saveNotes(Notes notes);
}
