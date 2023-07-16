package com.sia.services;

import com.sia.entities.TacoOrder;

public interface OrderMessagingService {

  void sendOrder(TacoOrder order);
  
}
