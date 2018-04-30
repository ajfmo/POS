package com.nubeclick.pos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nubeclick.pos.dto.Role;

@Repository
public interface RoleRepository<R> extends CrudRepository<Role, Long> {

	List<Role> findByRoleDescription(String roleDescription);

}
