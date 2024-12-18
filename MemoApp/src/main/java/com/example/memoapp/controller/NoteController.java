package com.example.memoapp.controller;

import com.example.memoapp.model.Note;
import com.example.memoapp.service.NoteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NoteController {
  
  private final NoteService noteService;
  
  @Autowired
  public NoteController(NoteService noteService) {
    this.noteService = noteService;
  }
  
  // メモ一覧表示ページ
  @GetMapping("/notes")
  public String getAllNotes(Model model) {
    List<Note> notes = noteService.getAllNotes();
    model.addAttribute("notes", notes);
    return "notes"; // notes.htmlを返す
  }
  
  // ページ表示用のメソッド
  @GetMapping("/notes/new")
  public String showNewNoteForm(Model model) {
    model.addAttribute("note", new Note());
    return "new_note";
  }
  
  // 新規メモ追加処理のメソッド
  @PostMapping("/notes")
  public String addNewNote(@ModelAttribute Note note) {
    noteService.saveNote(note.getContent());
    return "redirect:/notes"; // 登録後に一覧ページへリダイレクト
  }

}
