package tw.com.fcb.dolala.core.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tw.com.fcb.dolala.core.common.repository.entity.Fpm;

@Repository
public interface FpmRepository extends JpaRepository<Fpm, Long> {



}
