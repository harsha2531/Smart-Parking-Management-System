package lk.ijse.parkingspaceservice.controller;


import lk.ijse.parkingspaceservice.dto.ParkingZoneDTO;
import lk.ijse.parkingspaceservice.service.ParkingZoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parking-zone")
@RequiredArgsConstructor
public class ParkingZoneController {

    private final ParkingZoneService parkingZoneService;

    @GetMapping
    public ResponseEntity<List<ParkingZoneDTO>> getAllZones() {
        return ResponseEntity.ok(parkingZoneService.getAllZones());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParkingZoneDTO> getZoneById(@PathVariable Long id) {
        ParkingZoneDTO zone = parkingZoneService.getZoneById(id);
        if (zone == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(zone);
    }

    @PostMapping
    public ResponseEntity<ParkingZoneDTO> createZone(@RequestBody ParkingZoneDTO zoneDTO) {
        ParkingZoneDTO parkingZoneDTO = parkingZoneService.createZone(zoneDTO);
        if (parkingZoneDTO == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.status(201).body(parkingZoneDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteZone(@PathVariable Long id) {
        parkingZoneService.deleteZone(id);
        return ResponseEntity.noContent().build();
    }
}