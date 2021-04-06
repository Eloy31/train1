package br.com.train1.train1.controller;

import br.com.train1.train1.service.RoutesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javassist.tools.rmi.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/routes")
@Api(value = "API Rest Routes")
@CrossOrigin(origins = "*")
public class RoutesController {

    @ApiOperation(value = "Retorna documento com possiveis rotas")
    @GetMapping(path = "/api/find-route/{station}/{destiny}/{trip}")
    public ResponseEntity findRoute(String station, String destiny, String trip) {
        RoutesService routesService = new RoutesService();
        return ResponseEntity.ok().body(routesService.findRoute(station, destiny, trip));
    }
}
