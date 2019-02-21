package com.EsportLeagueStats.ESLS.web;

import com.EsportLeagueStats.ESLS.model.LigaSezona;
import com.EsportLeagueStats.ESLS.model.dto.SezonaSoLigi;
import com.EsportLeagueStats.ESLS.service.LigaSezonaService;
import com.EsportLeagueStats.ESLS.web.requests.CreateLigaSezonaRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/liga-sezona")
public class LigaSezonaController {

    private final LigaSezonaService service;

    public LigaSezonaController(LigaSezonaService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public LigaSezona findAll(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping
    public List<LigaSezona> create(@RequestBody CreateLigaSezonaRequest request) {
        return service.createMultiple(request.getSezonaId(), request.getLigi());
    }

    @GetMapping
    public List<SezonaSoLigi> findAll() {
        return service.groupBySezona();
    }

}
