package lk.ijse.vehicleservice.service;



import lk.ijse.vehicleservice.dto.VehicleDTO;
import lk.ijse.vehicleservice.entity.Vehicle;

import java.util.List;
import java.util.UUID;

public interface VehicleService {
    VehicleDTO addVehicle(Vehicle vehicle);
    List<VehicleDTO> getVehiclesByUserId(UUID userId);
    String simulateEntry(UUID vehicleId);
    String simulateExit(UUID vehicleId);
    VehicleDTO updateVehicle(UUID id, Vehicle updated);
    String deleteVehicle(UUID id);
}
