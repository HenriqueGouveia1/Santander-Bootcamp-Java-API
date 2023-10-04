package me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Service.impl;
import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Model.PerfilUsuario;
import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Repository.UserRepository;
import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository ur;

    public UserServiceImpl(UserRepository ur) {
        this.ur = ur;
    }

    @Override
    public PerfilUsuario findById(Long id) {
        return ur.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public PerfilUsuario create(PerfilUsuario userToCreate) {
        if (userToCreate.getId() != null && ur.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("Perfil ja existe");
        }
        return ur.save(userToCreate);
    }
}
