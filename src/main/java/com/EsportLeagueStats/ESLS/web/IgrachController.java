    package com.EsportLeagueStats.ESLS.web;import com.EsportLeagueStats.ESLS.model.Igrachi;import com.EsportLeagueStats.ESLS.service.IgrachService;import com.EsportLeagueStats.ESLS.web.requests.AddIgrachRequest;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.http.HttpStatus;import org.springframework.web.bind.annotation.*;import java.util.List;@RestController@RequestMapping(value = "/igrachi")@CrossOrigin()public class IgrachController {    private final IgrachService igrachService;    @Autowired    public IgrachController(IgrachService igrachService) {        this.igrachService = igrachService;    }    @GetMapping("/all")    public List<Igrachi> getIgrachi() {        return igrachService.findAllIgrachi();        }    @GetMapping("/{id}")    public Igrachi getIgrachById(@PathVariable("id") int id){        return igrachService.findIgrachById(id);    }    @PostMapping   public Igrachi addIgrach(@RequestBody AddIgrachRequest request){        return igrachService.addIgrach(request.getAkronim(),request.getDrzava(),request.getIme(),request.getPozicija());   }   //REMEMBER  REST API Konvencija e da se koristi PathVariable   @DeleteMapping("/{id}")   @ResponseStatus(HttpStatus.NO_CONTENT)   public void deleteIgrach(@PathVariable("id") int id){        igrachService.deleteIgrach(id);   }   @DeleteMapping("/all/delete")    @ResponseStatus(HttpStatus.NO_CONTENT)    public void deleteAllPlayers(){        igrachService.deleteAllIgrachi();   }   @GetMapping("/bestPlayer")   public Igrachi getBestPlayer(int id){        return igrachService.findBestPlayer(id);   }}