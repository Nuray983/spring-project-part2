package com.example.demo.service.second;
import com.example.demo.entity.StudentDTO;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, StudentDTO> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, StudentDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(StudentDTO studentDTO) {
        kafkaTemplate.send("update_student", studentDTO);
    }
}