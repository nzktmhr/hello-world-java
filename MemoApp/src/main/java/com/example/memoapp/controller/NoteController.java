package com.example.memoapp.controller;

import com.example.memoapp.model.Note;
import com.example.memoapp.service.NoteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes")
public class NoteController {
  
  private final NoteService noteService;
  
  @Autowired
  public NoteController(NoteService noteService) {
    this.noteService = noteService;
  }
  
  // メモ登録API: POST /notes
  @PostMapping
  public ResponseEntity<Note> createNote(@RequestBody Note noteRequest) {
    Note savedNote = noteService.saveNote(noteRequest.getContent());
    return ResponseEntity.ok(savedNote);
  }
  
  // メモ一覧取得API: GET /notes
  @GetMapping
  public ResponseEntity<List<Note>> getAllNotes() {
    List<Note> notes = noteService.getAllNotes();
    return ResponseEntity.ok(notes);
  }

}
