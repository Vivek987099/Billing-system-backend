package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.BillServiceItem;

public interface BillServiceItemRepository extends JpaRepository<BillServiceItem, Long>{

}
