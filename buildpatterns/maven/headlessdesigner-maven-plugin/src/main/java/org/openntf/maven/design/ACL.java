package org.openntf.maven.design;

import java.util.List;

import org.apache.maven.plugins.annotations.Parameter;

/**
 * Represents an ACL specification to be added to the database.properties file during building.
 * 
 * @author Jesse Gallagher
 * @since 1.4.0
 */
public class ACL {
	/**
	 * A List of ACL entries to populate the ACL
	 */
	@Parameter
	private List<ACLEntry> entries;
	/**
	 * The administration server to specify for the ACL
	 */
	@Parameter
	private String adminServer;
	/**
	 * Whether the database should be set to maintain a consistent ACL across replicas
	 */
	@Parameter
	private boolean consistentAcl;
	/**
	 * The maximum effective access level for Internet sessions
	 */
	@Parameter(defaultValue="editor")
	private ACLAccessLevel maxInternetAccess = ACLAccessLevel.editor;
	/**
	 * A List of roles available in the database
	 */
	@Parameter
	private List<String> roles;
	
	/**
	 * @return the entries
	 */
	public List<ACLEntry> getEntries() {
		return entries;
	}
	/**
	 * @param entries the entries to set
	 */
	public void setEntries(List<ACLEntry> entries) {
		this.entries = entries;
	}
	/**
	 * @return the adminServer
	 */
	public String getAdminServer() {
		return adminServer;
	}
	/**
	 * @param adminServer the adminServer to set
	 */
	public void setAdminServer(String adminServer) {
		this.adminServer = adminServer;
	}
	/**
	 * @return the consistentAcl
	 */
	public boolean isConsistentAcl() {
		return consistentAcl;
	}
	/**
	 * @param consistentAcl the consistentAcl to set
	 */
	public void setConsistentAcl(boolean consistentAcl) {
		this.consistentAcl = consistentAcl;
	}
	/**
	 * @return the maxInternetAccess
	 */
	public ACLAccessLevel getMaxInternetAccess() {
		return maxInternetAccess;
	}
	/**
	 * @param maxInternetAccess the maxInternetAccess to set
	 */
	public void setMaxInternetAccess(ACLAccessLevel maxInternetAccess) {
		this.maxInternetAccess = maxInternetAccess;
	}
	
	public List<String> getRoles() {
		return roles;
	}
	
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
}
