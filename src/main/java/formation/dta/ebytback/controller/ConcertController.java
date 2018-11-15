package formation.dta.ebytback.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formation.dta.ebytback.model.Concert;
import formation.dta.ebytback.repository.ConcertRepository;
import formation.dta.ebytback.service.ConcertService;

@RestController
@RequestMapping("/concert")
public class ConcertController {

	@Autowired
	ConcertService concertService;
	@Autowired
	ConcertRepository concertRepository;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@CrossOrigin(origins = "*")
	@GetMapping("/")
	public List<Concert> getAll() {
		return concertRepository.findAll();
	}
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@CrossOrigin(origins = "*")
	@GetMapping("/{id}")
	public void deleteById(long id) {
	}
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@CrossOrigin(origins = "*")
	@GetMapping("/}")
	public Concert create(Concert concert) {
		return concertRepository.save(concert);
	}
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@CrossOrigin(origins = "*")
	@GetMapping("/}")
	public Concert update(Concert concert) {
		return concertRepository.save(concert);
	}
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@CrossOrigin(origins = "*")
	@GetMapping("/}")
	public  Optional<Concert> getById(long id) {
		return concertRepository.findById(id);
	}
	
}