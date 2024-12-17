package com.example.memoapp.service;

import com.example.memoapp.model.Note;
import com.example.memoapp.repository.NoteRepository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

  private final NoteRepository noteRepository;
  
  @Autowired
  public NoteService(NoteRepository noteRepository) {
    this.noteRepository = noteRepository;
  }
  
  // メモを登録するメソッド
  public Note saveNote(String content) {
    Note note = new Note();
    note.setContent(content);
    note.setCreatedAt(LocalDateTime.now());
    return noteRepository.save(note);
  }
  
  // メモ一覧を取得するメソッド
  public List<Note> getAllNotes() {
    return noteRepository.findAll();
  }
}
