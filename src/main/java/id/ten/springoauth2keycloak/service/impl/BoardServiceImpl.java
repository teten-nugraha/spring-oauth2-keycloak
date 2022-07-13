package id.ten.springoauth2keycloak.service.impl;

import id.ten.springoauth2keycloak.entity.Board;
import id.ten.springoauth2keycloak.repository.IBoardRepository;
import id.ten.springoauth2keycloak.service.IBoardService;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements IBoardService {

  private final IBoardRepository boardRepository;

  public BoardServiceImpl(IBoardRepository boardRepository) {
    this.boardRepository = boardRepository;
  }

  @Override
  public Iterable<Board> findAll() {
    return boardRepository.findAll();
  }

}
