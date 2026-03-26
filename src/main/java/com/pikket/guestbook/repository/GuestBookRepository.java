package com.pikket.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pikket.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}
