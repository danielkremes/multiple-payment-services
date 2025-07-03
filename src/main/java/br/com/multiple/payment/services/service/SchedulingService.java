package br.com.multiple.payment.services.service;

import br.com.multiple.payment.services.dtos.SchedulingRequesterDTOS;
import br.com.multiple.payment.services.dtos.SchedulingResponserDTOS;
import br.com.multiple.payment.services.enums.StatusScheduling;
import br.com.multiple.payment.services.model.Scheduling;
import br.com.multiple.payment.services.repository.SchedulingRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class SchedulingService {

    private SchedulingRepository schedulingRepository;

    public SchedulingService(SchedulingRepository schedulingRepository) {
        this.schedulingRepository = schedulingRepository;
    }

    public SchedulingResponserDTOS schedulingResponserDTOS(SchedulingRequesterDTOS schedulingRequesterDTOS) {
        Scheduling scheduling = Scheduling.builder().destinationScheduling(schedulingRequesterDTOS.destination()).messageScheduling(schedulingRequesterDTOS.message()).typeCommunication(schedulingRequesterDTOS.typeCommunication()).statusScheduling(StatusScheduling.SCHEDULED).build();
        return toResponse(schedulingRepository.save(scheduling));
    }

    public List<SchedulingResponserDTOS> searchAllScheduling() {
        List<Scheduling> schedulings = schedulingRepository.findAll();
        return schedulings.stream().map(s -> new SchedulingResponserDTOS(s.getId(), s.getDestinationScheduling(), s.getMessageScheduling(), s.getTypeCommunication(), s.getDateTimeSent(), s.getStatusScheduling(), s.getCreateAt())).collect(Collectors.toList());
    }

    public SchedulingResponserDTOS searchById(UUID id) {
        Scheduling scheduling = schedulingRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found"));
        return toResponse(scheduling);
    }

    public void deleteUserById(UUID id) {
        if (!schedulingRepository.existsById(id)) {
            throw new EntityNotFoundException("User not found ");
        }
        schedulingRepository.deleteById(id);
    }

    public SchedulingResponserDTOS toResponse(Scheduling scheduling) {
        return new SchedulingResponserDTOS(scheduling.getId(), scheduling.getDestinationScheduling(), scheduling.getMessageScheduling(), scheduling.getTypeCommunication(), scheduling.getDateTimeSent(), scheduling.getStatusScheduling(), scheduling.getCreateAt());
    }
}
