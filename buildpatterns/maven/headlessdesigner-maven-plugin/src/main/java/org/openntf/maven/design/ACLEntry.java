package org.openntf.maven.design;

import java.util.List;

import org.apache.maven.plugins.annotations.Parameter;

public class ACLEntry {
	/**
	 * A List of roles to apply to this entry
	 */
	@Parameter
	private List<String> roles;
	/**
	 * The name of the entry, in canonical format
	 */
	@Parameter(required=true)
	private String name;
	/**
	 * The access level for the entry
	 */
	@Parameter(required=true)
	private ACLAccessLevel level;
	/**
	 * Whether the entry is allowed to delete documents
	 */
	@Parameter(defaultValue="false")
	private boolean deleteDocs = false;
	/**
	 * Whether the entry is allowed to write public documents
	 */
	@Parameter(defaultValue="true")
	private boolean writePublicDocs = true;
	/**
	 * Whether the entry is allowed to read public documents
	 */
	@Parameter(defaultValue="true")
	private boolean readPublicDocs = true;
	/**
	 * Whether the entry is allowed to create shared agents
	 */
	@Parameter(defaultValue="true")
	private boolean createLsJavaAgents = true;
	/**
	 * Whether the entry is allowed to create personal views
	 */
	@Parameter(defaultValue="true")
	private boolean createPersonalViews = true;
	/**
	 * Whether the entry is allowed to create personal agents
	 */
	@Parameter(defaultValue="true")
	private boolean createPersonalAgents = true;
	/**
	 * Whether the entry is allowed to create shared agents
	 */
	@Parameter(defaultValue="true")
	private boolean createSharedViews = true;
	/**
	 * Whether the entry is allowed to create documents
	 */
	@Parameter(defaultValue="true")
	private boolean createDocs = true;
	/**
	 * The type of the named entity
	 */
	@Parameter
	private ACLEntryType type;
	
	/**
	 * @return the roles
	 */
	public List<String> getRoles() {
		return roles;
	}
	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the level
	 */
	public ACLAccessLevel getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(ACLAccessLevel level) {
		this.level = level;
	}
	/**
	 * @return the deleteDocs
	 */
	public boolean isDeleteDocs() {
		return deleteDocs;
	}
	/**
	 * @param deleteDocs the deleteDocs to set
	 */
	public void setDeleteDocs(boolean deleteDocs) {
		this.deleteDocs = deleteDocs;
	}
	/**
	 * @return the writePublicDocs
	 */
	public boolean isWritePublicDocs() {
		return writePublicDocs;
	}
	/**
	 * @param writePublicDocs the writePublicDocs to set
	 */
	public void setWritePublicDocs(boolean writePublicDocs) {
		this.writePublicDocs = writePublicDocs;
	}
	/**
	 * @return the readPublicDocs
	 */
	public boolean isReadPublicDocs() {
		return readPublicDocs;
	}
	/**
	 * @param readPublicDocs the readPublicDocs to set
	 */
	public void setReadPublicDocs(boolean readPublicDocs) {
		this.readPublicDocs = readPublicDocs;
	}
	/**
	 * @return the createLsJavaAgents
	 */
	public boolean isCreateLsJavaAgents() {
		return createLsJavaAgents;
	}
	/**
	 * @param createLsJavaAgents the createLsJavaAgents to set
	 */
	public void setCreateLsJavaAgents(boolean createLsJavaAgents) {
		this.createLsJavaAgents = createLsJavaAgents;
	}
	/**
	 * @return the createPersonalViews
	 */
	public boolean isCreatePersonalViews() {
		return createPersonalViews;
	}
	/**
	 * @param createPersonalViews the createPersonalViews to set
	 */
	public void setCreatePersonalViews(boolean createPersonalViews) {
		this.createPersonalViews = createPersonalViews;
	}
	/**
	 * @return the createPersonalAgents
	 */
	public boolean isCreatePersonalAgents() {
		return createPersonalAgents;
	}
	/**
	 * @param createPersonalAgents the createPersonalAgents to set
	 */
	public void setCreatePersonalAgents(boolean createPersonalAgents) {
		this.createPersonalAgents = createPersonalAgents;
	}
	/**
	 * @return the createSharedViews
	 */
	public boolean isCreateSharedViews() {
		return createSharedViews;
	}
	/**
	 * @param createSharedViews the createSharedViews to set
	 */
	public void setCreateSharedViews(boolean createSharedViews) {
		this.createSharedViews = createSharedViews;
	}
	
	public ACLEntryType getType() {
		return type;
	}
	
	public boolean isCreateDocs() {
		return createDocs;
	}
}