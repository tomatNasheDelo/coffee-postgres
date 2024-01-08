package com.thehecklers.sburrestdemo.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.thehecklers.sburrestdemo.entity.Coffee;





@Transactional
public interface CoffeeRepository extends CrudRepository<Coffee, String> {}
