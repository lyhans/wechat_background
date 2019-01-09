package com.wyait.manage.service;

import com.wyait.manage.form.PermissionForm;
import com.wyait.manage.form.RoleForm;

import java.util.List;

/**
 * @项目名称：wyait-manage
 * @包名：com.wyait.manage.service
 * @类描述：
 * @创建人：wyait
 * @创建时间：2017-12-20 15:52
 * @version：V1.0
 */
public interface AuthService {
	int addPermission(PermissionForm permission);

	List<PermissionForm> permList();

	int updatePerm(PermissionForm permission);

	PermissionForm getPermission(int id);

	String delPermission(int id);

	/**
	 * 查询所有角色
	 * @return
	 */
	List<RoleForm> roleList();

	/**
	 * 关联查询权限树列表
	 * @return
	 */
	List<PermissionForm> findPerms();

	/**
	 * 添加角色
	 * @param role
	 * @param permIds
	 * @return
	 */
	String addRole(RoleForm role, String permIds);

	RoleForm findRoleAndPerms(Integer id);

	/**
	 * 更新角色并授权
	 * @param role
	 * @param permIds
	 * @return
	 */
	String updateRole(RoleForm role, String permIds);

	/**
	 * 删除角色以及它对应的权限
	 * @param id
	 * @return
	 */
	String delRole(int id);

	/**
	 * 查找所有角色
	 * @return
	 */
	List<RoleForm> getRoles();

	/**
	 * 根据用户获取角色列表
	 * @param userId
	 * @return
	 */
	List<RoleForm> getRoleByUser(Integer userId);

	/**
	 * 根据角色id获取权限数据
	 * @param id
	 * @return
	 */
	List<PermissionForm> findPermsByRoleId(Integer id);

	/**
	 * 根据用户id获取权限数据
	 * @param id
	 * @return
	 */
	List<PermissionForm> getUserPerms(Integer id);
}
