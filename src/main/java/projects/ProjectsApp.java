/**
 * 
 */
package projects;

import projects.dao.DbConnection;

/**
 * @author maddycole
 *
 */
public class ProjectsApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DbConnection.getConnection();

	}

}
