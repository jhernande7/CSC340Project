package com._Project.carServiceApp.provider;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Provider,Integer> {
    //custom get mapping requests here.
}

