package me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Repository;

import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Model.BarItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarItemRepository extends JpaRepository<BarItem, Long> {
}
