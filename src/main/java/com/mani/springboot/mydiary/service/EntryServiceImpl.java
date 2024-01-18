package com.mani.springboot.mydiary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mani.springboot.mydiary.entity.Entry;

import com.mani.springboot.mydiary.repository.EntryRepository;

@Service
public class EntryServiceImpl implements EntryService {

	@Autowired
	private EntryRepository entryRepository;
	
	@Override
	public Entry saveEntry(Entry entry) {
		// TODO Auto-generated method stub
		return entryRepository.save(entry);
	}

	@Override
	public Entry updateUser(Entry entry) {
		// TODO Auto-generated method stub
		return entryRepository.save(entry);
	}

	@Override
	public void deleteUser(Entry entry) {
		entryRepository.delete(entry);
	}

	@Override
	public Entry findById(int id) {
		return entryRepository.findById(id).get();
	}

	@Override
	public List<Entry> findAll() {
		return entryRepository.findAll();
	}

	
}
