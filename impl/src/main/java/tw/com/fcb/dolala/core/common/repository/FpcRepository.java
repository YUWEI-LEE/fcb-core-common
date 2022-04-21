package tw.com.fcb.dolala.core.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tw.com.fcb.dolala.core.common.repository.entity.Fpc;

import java.util.Optional;

@Repository
public interface FpcRepository extends JpaRepository<Fpc, Long> {

    Optional<Fpc> findByFpcAccount(String account);

}
