package com.systex.demo1.infrastructure.repository;

import com.systex.demo1.domain.PointType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PointTypeJPARepository extends JpaRepository<PointType, UUID> {
}
