package org.github.bobobot.services.impl;

import org.github.bobobot.entities.Board;
import org.github.bobobot.repositories.IBoardRepository;
import org.github.bobobot.services.IBoardService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BoardService implements IBoardService {

	@Autowired
	private IBoardRepository repository;

	private Board getBoardIfPresent(Optional<Board> board) {
		if (!board.isPresent()) {
			throw new IllegalArgumentException("Board was not found!");
		}
		return board.get();
	}

	@Override
	public Board create(Board board) {
		return repository.save(board);
	}

	@Override
	public Board create(String shortName, String longName) {
		return create(new Board(shortName, longName));
	}

	@Override
	public Board update(Board tempBoard) {
		getBoardIfPresent(repository.findById(tempBoard.getId())); //dobjunk errort ha nem létezik
		return repository.save(tempBoard);
	}

	@Override
	public Board update(Long id, String shortName, String longName) {
		return update(new Board(id, shortName, longName));
	}

	@Override
	public List<Board> list() {
		return repository.findAll();
	}

	@Override
	public Board findById(Long id) {
		Optional<Board> board = repository.findById(id);
		return getBoardIfPresent(board);
	}

	@Override
	public Board findByShortName(String shortName) {
		Optional<Board> board = repository.findByShortName(shortName);
		return getBoardIfPresent(board);
	}

	@Override
	public void delete(Long id) {
		getBoardIfPresent(repository.findById(id)); //dobjunk errort ha nem létezik
		repository.deleteById(id);
	}
}
