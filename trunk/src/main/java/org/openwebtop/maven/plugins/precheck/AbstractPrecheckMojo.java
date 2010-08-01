/**
 * Copyright (C) 2010  Jaehyeon Nam (dotoli21@gmail.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.openwebtop.maven.plugins.precheck;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.project.MavenProject;
import org.apache.maven.settings.Settings;

/**
 * Abstract precheck mojo
 *
 * @author Jaehyeon Nam (dotoli21@gmail.com)
 * @since 2010. 5. 3.
 */
public abstract class AbstractPrecheckMojo extends AbstractMojo {
	/**
	 * Maven project
	 *
	 * @parameter expression="${project}"
	 * @required
	 * @readonly
	 */
	private MavenProject project;

	/**
	 * Maven system settings for Maven.
	 *
	 * @parameter expression="${settings}"
	 * @required
	 * @readonly
	 */
	private Settings settings;

	public MavenProject getProject() {
		return project;
	}

	public Settings getSettings() {
		return settings;
	}

}