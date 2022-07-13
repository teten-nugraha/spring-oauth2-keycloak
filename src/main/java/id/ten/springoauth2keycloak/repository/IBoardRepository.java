package id.ten.springoauth2keycloak.repository;

import id.ten.springoauth2keycloak.entity.Board;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBoardRepository extends PagingAndSortingRepository<Board, Long> {
}