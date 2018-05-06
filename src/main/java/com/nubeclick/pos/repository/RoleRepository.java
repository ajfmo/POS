package com.nubeclick.pos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nubeclick.pos.dto.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	List<Role> findByRoleDescription(String roleDescription);
}
