package me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Service;

import me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Model.BarItem;

public interface BarItemService {

    BarItem findById(Long id);

    BarItem create(BarItem bi);

}
