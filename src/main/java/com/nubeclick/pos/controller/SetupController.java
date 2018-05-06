package com.nubeclick.pos.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nubeclick.pos.dto.Role;
import com.nubeclick.pos.repository.RoleRepository;

@Service
public class SetupController<ID extends Serializable> {

	@Autowired
	private RoleRepository roleRepository;

	private Role role = new Role();

	@Transactional
	public void saveRole(String roleDescription, int roleLevel) {
		role.setRoleDescription(roleDescription);
		role.setRoleLevel(roleLevel);
		roleRepository.save(role);
	}
}
