package com.mani.springboot.mydiary.service;

import java.util.List;

import com.mani.springboot.mydiary.entity.Entry;


public interface EntryService {
	
	public Entry saveEntry(Entry entry);
	public Entry updateUser(Entry entry);
	public void deleteUser(Entry entry);
	public Entry findById(int id);
	public List<Entry> findAll();
	
	

}
