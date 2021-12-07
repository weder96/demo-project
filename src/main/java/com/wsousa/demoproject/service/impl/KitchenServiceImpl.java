package com.wsousa.demoproject.service.impl;
import com.wsousa.demoproject.domain.KitchenEntity;
import com.wsousa.demoproject.dto.KitchenDTO;
import com.wsousa.demoproject.mapper.KitchenMapper;
import com.wsousa.demoproject.repository.KitchenRepository;
import com.wsousa.demoproject.service.KitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class KitchenServiceImpl implements KitchenService {

    @Autowired
    KitchenRepository kitchenRepository;
    @Override
    public KitchenEntity saveKitchen(KitchenEntity kitchen) {
        return kitchenRepository.save(kitchen);
    }

    @Override
    public List<KitchenDTO> getAllKitchens() {
        List<KitchenDTO> kitchenDTOS = new ArrayList<>();
        List<KitchenEntity> kitchens = kitchenRepository.getAllKitchens();
        kitchens.forEach(kitchen -> {
            KitchenDTO kitchenDTO = KitchenMapper.entityToKitchenDTO(kitchen);
            kitchenDTOS.add(kitchenDTO);
        });
        return kitchenDTOS;
    }

    @Override
    public Optional<KitchenEntity> findById(Long id) {
        return kitchenRepository.findById(id);
    }
}