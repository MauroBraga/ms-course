package br.com.mrb.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mrb.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}