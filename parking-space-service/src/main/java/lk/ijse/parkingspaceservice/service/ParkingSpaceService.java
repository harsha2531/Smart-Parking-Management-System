package lk.ijse.parkingspaceservice.service;


import lk.ijse.parkingspaceservice.dto.ParkingSpaceDTO;

import java.util.List;

public interface ParkingSpaceService {
    List<ParkingSpaceDTO> getAllSpaces();
    ParkingSpaceDTO getSpaceById(Long id);
    ParkingSpaceDTO createSpace(ParkingSpaceDTO spaceDTO);
    void deleteSpace(Long id);

    List<ParkingSpaceDTO> getAvailableSpace();

    ParkingSpaceDTO updateSpace(Long id, ParkingSpaceDTO spaceDTO);
}