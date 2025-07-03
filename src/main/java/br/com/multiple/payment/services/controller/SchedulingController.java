package br.com.multiple.payment.services.controller;

import br.com.multiple.payment.services.dtos.SchedulingRequesterDTOS;
import br.com.multiple.payment.services.dtos.SchedulingResponserDTOS;
import br.com.multiple.payment.services.service.SchedulingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/scheduling/")
public class SchedulingController {

    private SchedulingService schedulingService;

    public SchedulingController(SchedulingService schedulingService) {
        this.schedulingService = schedulingService;
    }

    @GetMapping
    public ResponseEntity<List<SchedulingResponserDTOS>> searchAllScheduling () {
        var response = schedulingService.searchAllScheduling();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SchedulingResponserDTOS> searchById(@PathVariable UUID id) {
        SchedulingResponserDTOS responseDTO = schedulingService.searchById(id);
        return ResponseEntity.ok(responseDTO);
    }

    @PostMapping
    public ResponseEntity<SchedulingResponserDTOS> createScheduling(@RequestBody SchedulingRequesterDTOS requestDTO) {
        SchedulingResponserDTOS responserDTO = schedulingService.schedulingResponserDTOS(requestDTO);
        return ResponseEntity.ok(responserDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteScheduling(@PathVariable UUID id) {
        schedulingService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }
}
