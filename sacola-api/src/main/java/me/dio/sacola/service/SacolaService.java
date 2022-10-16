package me.dio.sacola.service;

import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.resource.dto.ItemDTO;

public interface SacolaService {
   Item incluirItemNaSacola(ItemDTO itemDTO);
    Sacola verSacola(Long id);

    Sacola fecharSacola(Long sacolaId, int formaPagamento);

   
}
