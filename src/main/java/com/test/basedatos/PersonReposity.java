package com.test.basedatos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonReposity extends JpaRepository<Person, Long> {
}
