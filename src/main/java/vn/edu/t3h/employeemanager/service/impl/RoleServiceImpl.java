package vn.edu.t3h.employeemanager.service.impl;


import vn.edu.t3h.employeemanager.dao.RoleDao;
import vn.edu.t3h.employeemanager.model.RoleModel;
import vn.edu.t3h.employeemanager.service.RoleService;

import javax.management.relation.Role;

public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public RoleModel getRoleById(Integer roleId) {
        return roleDao.findRoleById(roleId);
    }
}