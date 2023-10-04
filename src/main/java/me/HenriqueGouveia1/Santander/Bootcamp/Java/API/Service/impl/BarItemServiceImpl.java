package me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Service.impl;

import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Model.BarItem;
import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Model.PerfilUsuario;
import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Repository.BarItemRepository;
import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Service.BarItemService;

import java.util.NoSuchElementException;

public class BarItemServiceImpl implements BarItemService {

    private final BarItemRepository br;

    public BarItemServiceImpl(BarItemRepository br) {
        this.br = br;
    }

    @Override
    public BarItem findById(Long id) {
        return br.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public BarItem create(BarItem itemToCreate) {
        if (itemToCreate.getId() != null && br.existsById(itemToCreate.getId())){
            throw new IllegalArgumentException("Item ja existe");
        }
        return br.save(itemToCreate);
    }
}
