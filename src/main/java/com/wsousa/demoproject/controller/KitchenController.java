package com.wsousa.demoproject.controller;
import com.wsousa.demoproject.domain.KitchenEntity;
import com.wsousa.demoproject.dto.KitchenDTO;
import com.wsousa.demoproject.mapper.KitchenMapper;
import com.wsousa.demoproject.service.KitchenService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@Validated
@RequestMapping("/api/kitchens")
public class KitchenController {

    private KitchenService kitchenService;

    public KitchenController(KitchenService kitchenService) {
        this.kitchenService = kitchenService;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<KitchenDTO> index(){
        return kitchenService.getAllKitchens();
    }

    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity<KitchenDTO> kitchenSave(@RequestBody KitchenDTO kitchen) {
        KitchenEntity kitchenSave = kitchenService.saveKitchen(KitchenMapper.KitchenDTOToEntity(kitchen));
        return ResponseEntity.ok(KitchenMapper.entityToKitchenDTO(kitchenSave));
    }
}


