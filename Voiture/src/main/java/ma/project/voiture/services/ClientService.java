package ma.project.voiture.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ma.project.voiture.entities.Client;

@FeignClient(name="SERVICE-CLIENT")
public interface ClientService{
    @GetMapping(path="/client/{id}")
    Client clientById(@PathVariable Long id);
}
