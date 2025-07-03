package br.com.multiple.payment.services.model;

import br.com.multiple.payment.services.enums.StatusScheduling;
import br.com.multiple.payment.services.enums.TypeCommunication;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "tb_scheduling")
public class Scheduling {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "scheduling_id")
    private UUID id;

    @Column(name = "destination_scheduling", nullable = false)
    private String destinationScheduling;

    @Column(name = "message_scheduling", nullable = false, columnDefinition = "TEXT")
    private String messageScheduling;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_comunication_scheduling",nullable = false)
    private TypeCommunication typeCommunication;

    @Column(name = "date_time_sent", nullable = false)
    private Instant dateTimeSent;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_scheduling",nullable = false)
    private StatusScheduling statusScheduling;

    @Column(name = "created_scheduling", nullable = false)
    private Instant createAt;

}
