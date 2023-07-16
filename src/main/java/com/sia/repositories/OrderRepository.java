package com.sia.repositories;

import java.util.List;

import com.sia.entities.TacoOrder;
import com.sia.entities.User;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByUserOrderByPlacedAtDesc(
            User user, Pageable pageable);

}
