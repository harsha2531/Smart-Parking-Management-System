package lk.ijse.vehicleservice.controller;


import lk.ijse.vehicleservice.dto.VehicleDTO;
import lk.ijse.vehicleservice.entity.Vehicle;
import lk.ijse.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/save")
    public VehicleDTO addVehicle(@RequestBody Vehicle vehicle) {
        System.out.println("Add vehicle");
        return vehicleService.addVehicle(vehicle);
    }

    @GetMapping("/user/{userId}")
    public List<VehicleDTO> getVehiclesByUserId(@PathVariable String userId) {
        return vehicleService.getVehiclesByUserId(UUID.fromString(userId));
    }

    @PostMapping("/entry")
    public String simulateEntry(@RequestParam String vehicleId) {
        return vehicleService.simulateEntry(UUID.fromString(vehicleId));
    }

    @PostMapping("/exit")
    public String simulateExit(@RequestParam String vehicleId) {
        return vehicleService.simulateExit(UUID.fromString(vehicleId));
    }

    @PutMapping("/update/{id}")
    public VehicleDTO updateVehicle(@PathVariable String id, @RequestBody Vehicle updatedVehicle) {
        return vehicleService.updateVehicle(UUID.fromString(id), updatedVehicle);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteVehicle(@PathVariable String id) {
        return vehicleService.deleteVehicle(UUID.fromString(id));
    }
}
