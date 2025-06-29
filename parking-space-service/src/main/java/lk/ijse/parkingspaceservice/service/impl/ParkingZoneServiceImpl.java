package lk.ijse.parkingspaceservice.service.impl;


import lk.ijse.parkingspaceservice.dto.ParkingZoneDTO;
import lk.ijse.parkingspaceservice.entity.ParkingZone;
import lk.ijse.parkingspaceservice.repository.ParkingZoneRepository;
import lk.ijse.parkingspaceservice.service.ParkingZoneService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ParkingZoneServiceImpl implements ParkingZoneService {

    private final ParkingZoneRepository parkingZoneRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ParkingZoneDTO> getAllZones() {
        return parkingZoneRepository.findAll()
                .stream()
                .map(zone -> modelMapper.map(zone, ParkingZoneDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ParkingZoneDTO getZoneById(Long id) {
        ParkingZone zone = parkingZoneRepository.findById(id).orElse(null);
        return zone != null ? modelMapper.map(zone, ParkingZoneDTO.class) : null;
    }

    @Override
    public ParkingZoneDTO createZone(ParkingZoneDTO zoneDTO) {
        try {
            ParkingZone zone = modelMapper.map(zoneDTO, ParkingZone.class);
            ParkingZone savedZone = parkingZoneRepository.save(zone);
            return modelMapper.map(savedZone, ParkingZoneDTO.class);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void deleteZone(Long id) {
        parkingZoneRepository.deleteById(id);
    }
}