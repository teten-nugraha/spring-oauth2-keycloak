package id.ten.springoauth2keycloak.service;

import id.ten.springoauth2keycloak.entity.Board;

public interface IBoardService {
  Iterable<Board> findAll();
}
