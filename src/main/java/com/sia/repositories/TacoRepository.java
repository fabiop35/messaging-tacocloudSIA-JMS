package com.sia.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sia.entities.Taco;

public interface TacoRepository
        extends PagingAndSortingRepository<Taco, Long> {

}
