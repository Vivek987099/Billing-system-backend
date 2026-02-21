package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.HServiceItem;

public interface HospitalServiceItemRepository extends JpaRepository<HServiceItem, Long>{

}
