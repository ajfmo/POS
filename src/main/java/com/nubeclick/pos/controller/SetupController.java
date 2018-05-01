package com.nubeclick.pos.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.nubeclick.pos.dto.Role;
import com.nubeclick.pos.repository.RoleRepository;

@Controller
public class SetupController<ID extends Serializable> {

	@Autowired
	private RoleRepository<Role> roleRepository;

	private Role role = new Role();

	@Transactional
	public void saveRole(String roleDescription, int roleLevel) {
		role.setRoleDescription(roleDescription);
		role.setRoleLevel(roleLevel);
		roleRepository.save(role);
	}
}
