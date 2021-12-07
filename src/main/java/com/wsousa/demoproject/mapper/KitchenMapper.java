package com.wsousa.demoproject.mapper;
import com.wsousa.demoproject.domain.KitchenEntity;
import com.wsousa.demoproject.dto.KitchenDTO;
import org.modelmapper.ModelMapper;
public class KitchenMapper {
    private static final ModelMapper kitchenMapper = new ModelMapper();
    public static KitchenDTO entityToKitchenDTO(KitchenEntity kitchen){
        KitchenDTO kitchenDTO = kitchenMapper.map(kitchen, KitchenDTO.class);
        return kitchenDTO;
    }

    public static KitchenEntity KitchenDTOToEntity(KitchenDTO kitchenDTO){
        KitchenEntity kitchen = kitchenMapper.map(kitchenDTO, KitchenEntity.class);
        return kitchen;
    }
}