package com.example.demo.service.second;
import com.example.demo.entity.StudentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SecondServiceImpl implements SecondService {

    private final KafkaProducerService kafkaProducerService;

    @Override
    public void updateStudents(Long id, StudentDTO studentDTO) {
        kafkaProducerService.sendMessage(studentDTO);
    }
}