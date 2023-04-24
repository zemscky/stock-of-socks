package com.example.stockofsocks.repository;

import com.example.stockofsocks.entity.Socks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface SocksRepository extends JpaRepository <Socks,Long> {

//    Optional<Socks> findByColorIdAndCottonPart(long colorId, int cottonPart);
//    Optional<Socks> findByColorNameAndCottonPart(String colorName, int cottonPart);
//    Collection<Socks> findByColorNameAndCottonPartAfter(String colorName, int cottonPart);
//    Collection<Socks> findByColorNameAndCottonPartBefore(String colorName, int cottonPart);
}
