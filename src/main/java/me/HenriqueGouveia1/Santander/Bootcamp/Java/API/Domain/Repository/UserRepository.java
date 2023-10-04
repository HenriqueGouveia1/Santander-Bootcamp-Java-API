package me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Repository;

import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Model.PerfilUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<PerfilUsuario, Long> {

}
