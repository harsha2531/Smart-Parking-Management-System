package lk.ijse.parkingspaceservice.controller;


import lk.ijse.parkingspaceservice.dto.ParkingSpaceDTO;
import lk.ijse.parkingspaceservice.service.ParkingSpaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parking-space")
@RequiredArgsConstructor
public class ParkingSpaceController {

    private final ParkingSpaceService parkingSpaceService;

    @GetMapping
    public ResponseEntity<List<ParkingSpaceDTO>> getAllSpaces() {
        return ResponseEntity.ok(parkingSpaceService.getAllSpaces());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParkingSpaceDTO> getSpaceById(@PathVariable Long id) {
        ParkingSpaceDTO space = parkingSpaceService.getSpaceById(id);
        if (space == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(space);
    }

    @PostMapping
    public ResponseEntity<ParkingSpaceDTO> createSpace(@RequestBody ParkingSpaceDTO spaceDTO) {
        ParkingSpaceDTO parkingSpaceDTO =parkingSpaceService.createSpace(spaceDTO);

        if (parkingSpaceDTO == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.status(201).body(parkingSpaceDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSpace(@PathVariable Long id) {
        parkingSpaceService.deleteSpace(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/availableSpace")
    public ResponseEntity<List<ParkingSpaceDTO>> getAvailableSpaces() {
        return ResponseEntity.ok(parkingSpaceService.getAvailableSpace());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ParkingSpaceDTO> updateSpace(@PathVariable Long id, @RequestBody ParkingSpaceDTO spaceDTO) {
        ParkingSpaceDTO updatedSpace = parkingSpaceService.updateSpace(id, spaceDTO);
        if (updatedSpace == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedSpace);
    }

}