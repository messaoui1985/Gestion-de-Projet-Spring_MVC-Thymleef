package com.whitecape.projet_taches_mvc.repository;

import com.whitecape.projet_taches_mvc.entites.Chefgroupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefgroupeRepository extends JpaRepository<Chefgroupe,Long> {
}
