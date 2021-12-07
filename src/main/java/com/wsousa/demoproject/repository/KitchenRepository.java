package com.wsousa.demoproject.repository;
import com.wsousa.demoproject.domain.KitchenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface KitchenRepository extends JpaRepository<KitchenEntity, Long> {

    @Query("select r from KitchenEntity r")
    List<KitchenEntity> getAllKitchens();
}