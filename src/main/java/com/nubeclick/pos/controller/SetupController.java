package com.nubeclick.pos.controller;

import java.io.Serializable;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.nubeclick.pos.dto.Role;
import com.nubeclick.pos.repository.RoleRepository;

@Controller
public class SetupController<ID extends Serializable> {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private RoleRepository<Role> roleRepository;

	private Role role;

	// @Transactional
	public void saveRole(String roleDescription, int roleLevel) {
		role.setRoleDescription(roleDescription);
		role.setRoleLevel(roleLevel);
		role = new Role();
		roleRepository.save(role);
	}
}
