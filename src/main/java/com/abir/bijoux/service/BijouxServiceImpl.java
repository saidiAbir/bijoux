package com.abir.bijoux.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.abir.bijoux.entities.Bijoux;
import com.abir.bijoux.repos.BijouxRepository;
@Service
public class BijouxServiceImpl implements BijouxService{
	@Autowired
	BijouxRepository bijouxRepository;

	@Override
	public Bijoux saveBijoux(Bijoux b) {
		// TODO Auto-generated method stub
		return bijouxRepository.save(b);
	}

	@Override
	public Bijoux updateBijoux(Bijoux b) {
		// TODO Auto-generated method stub
		return bijouxRepository.save(b);
	}

	@Override
	public void deleteBijoux(Bijoux b) {
		bijouxRepository.delete(b);		
	}

	@Override
	public void deleteBijouxById(Long id) {
		bijouxRepository.deleteById(id);		
	}

	@Override
	public Bijoux getBijoux(Long id) {
		// TODO Auto-generated method stub
		return bijouxRepository.findById(id).get();
	}

	public List<Bijoux> getAllBijoux() {
		// TODO Auto-generated method stub
		return bijouxRepository.findAll();
	}

	@Override
	public Page<Bijoux> getAllBijouxParPage(int page, int size) {
		// TODO Auto-generated method stub
		return bijouxRepository.findAll(PageRequest.of(page, size));
	}

}
