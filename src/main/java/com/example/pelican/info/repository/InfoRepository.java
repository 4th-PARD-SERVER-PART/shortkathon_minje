package com.example.pelican.info.repository;

import com.example.pelican.info.entity.Info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoRepository extends JpaRepository<Info, Long> {
}
