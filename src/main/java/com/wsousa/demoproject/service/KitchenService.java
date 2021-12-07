package com.wsousa.demoproject.service;
import com.wsousa.demoproject.domain.KitchenEntity;
import com.wsousa.demoproject.dto.KitchenDTO;
import java.util.List;
import java.util.Optional;

public interface KitchenService {
    KitchenEntity saveKitchen(KitchenEntity kitchen);
    List<KitchenDTO> getAllKitchens();
    Optional<KitchenEntity> findById(Long id);
}