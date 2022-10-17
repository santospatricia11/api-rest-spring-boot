package me.dio.sacola.resource;

import lombok.RequiredArgsConstructor;
import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.resource.dto.ItemDTO;
import me.dio.sacola.service.SacolaService;
import org.springframework.web.bind.annotation.*;

//@Api(values="/ifood-devweek/sacolas")
@RestController
@RequestMapping("/ifood-devweek/sacolas")
@RequiredArgsConstructor
public class SacolaResource {
    private final SacolaService sacolaService;

    @PostMapping
    public Item incluirItemNaSacola( @RequestBody ItemDTO itemDTO){
        return  sacolaService.incluirItemNaSacola(itemDTO);

    }
    @GetMapping("/{id}")
    public Sacola verSacola(@PathVariable Long id){
        return sacolaService.verSacola(id);

    }
@PatchMapping("/fecharSacola/{sacolaId}")
    public Sacola fecharSacola ( @PathVariable("sacolaId") Long sacolaId, @RequestParam("formaPagamento") int formaPagamento){

        return sacolaService.fecharSacola(  sacolaId,formaPagamento);
    }
}
