package br.com.mrb.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.mrb.hrpayroll.entities.Payment;
import br.com.mrb.hrpayroll.entities.Worker;
import br.com.mrb.hrpayroll.feignclients.WorkerFeignClients;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClients workerFeignClient;

    public Payment getPayment(long workerId, int days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
