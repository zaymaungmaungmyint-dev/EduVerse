package dev.backend.eduverse.service;

import dev.backend.eduverse.dto.AdminDto;
import dev.backend.eduverse.model.Admin;

import java.util.List;

public interface AdminService {
	
    List<AdminDto> findAll();

    AdminDto findById(Long id);

    AdminDto createAdmin(AdminDto adminDto);

    AdminDto updateAdmin(AdminDto adminDto, Long id);

    void deleteById(Long id);
}
