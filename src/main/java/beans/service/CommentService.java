package beans.service;

import org.springframework.stereotype.Service;

import beans.repository.MariaRepository;

@Service
public class CommentService {
	private MariaRepository repository;

	public CommentService(MariaRepository repository) {
		super();
		this.repository = repository;
	}

	public MariaRepository getRepository() {
		return repository;
	}
}
