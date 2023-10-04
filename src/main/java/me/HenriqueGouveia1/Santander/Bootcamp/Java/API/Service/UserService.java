package me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Service;

import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Model.PerfilUsuario;

public interface UserService {
    PerfilUsuario findById(Long id);

    PerfilUsuario create(PerfilUsuario userToCreate);
}
