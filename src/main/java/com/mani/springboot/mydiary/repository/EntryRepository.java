package com.mani.springboot.mydiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mani.springboot.mydiary.entity.Entry;

public interface EntryRepository extends JpaRepository<Entry, Integer> {

}
