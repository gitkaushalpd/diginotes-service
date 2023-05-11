package com.diginotes.diginotes.service;

import com.diginotes.diginotes.dao.NotesDao;
import com.diginotes.diginotes.entity.Notes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NotesServiceImpl implements NotesService{

    @Autowired
    NotesDao notesDao;
    @Override
    public List<Notes> showNotes() {
        return (List<Notes>) notesDao.findAll();
    }

    @Override
    public Notes saveNotes(Notes notes) {

        return notesDao.save(notes);
    }
}
