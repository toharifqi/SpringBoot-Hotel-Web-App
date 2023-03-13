package com.toharifqi.roomwebapp.services;

import com.toharifqi.roomwebapp.data.StaffRepository;
import com.toharifqi.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getStaffs() {
        return staffRepository.findAll();
    }
}
