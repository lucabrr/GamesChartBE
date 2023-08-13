package com.sito.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sito.classes.UserRecord;

public interface IUserRecordPageable extends PagingAndSortingRepository<UserRecord, Long> {

}
