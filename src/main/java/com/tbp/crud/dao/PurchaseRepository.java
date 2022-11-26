package com.tbp.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tbp.crud.entity.*;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

}
