package com.diginotes.diginotes.dao;

import com.diginotes.diginotes.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesDao extends JpaRepository<Notes,List> {

}
