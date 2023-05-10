package br.com.elegacy.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.elegacy.hrworker.entities.Worker;

public interface WorkerRpository extends JpaRepository<Worker, Long> {

}
