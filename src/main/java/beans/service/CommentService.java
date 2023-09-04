package beans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beans.repository.MariaRepository;

@Service
public class CommentService {
	@Autowired
	private MariaRepository repository;

	public MariaRepository getRepository() {
		return repository;
	}
}
