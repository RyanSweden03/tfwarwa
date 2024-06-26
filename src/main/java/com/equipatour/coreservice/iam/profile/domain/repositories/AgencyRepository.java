package com.equipatour.coreservice.iam.profile.domain.repositories;

import com.equipatour.coreservice.iam.profile.domain.model.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AgencyRepository extends JpaRepository<Agency, Long> {

    @Query("select a from Agency a where a._deleted=false and a.user.id=:userId")
    Optional<Agency> findByUserId(@Param("userId") Long userId);
}
