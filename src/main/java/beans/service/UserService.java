package beans.service;

import org.springframework.stereotype.Service;

import beans.repository.MariaRepository;

@Service
public class UserService {
	private MariaRepository repository;
	
	public UserService(MariaRepository repository) {
		super();
		this.repository = repository;
	}

	public MariaRepository getRepository() {
		return repository;
	}
}
